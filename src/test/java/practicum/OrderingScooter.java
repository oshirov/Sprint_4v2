package practicum;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(DataProviderRunner.class)
public class OrderingScooter extends BaseUITest {
    MainPage mainPage = new MainPage(webDriver);
    OrderPage orderPage = new OrderPage(webDriver);
    MainPage MainPage = new MainPage(webDriver);

    @DataProvider
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Иван", "Иванов", "г.Москва, Ленина 1, кв 111", "Сокольники", "88005553535", "01.01.2021", "трое суток", "хороша погода", true},
                {"Борис", "Борисов", "г.Питер, Маркса 2, кв 222", "Черкизовская", "88003333535", "02.02.2022", "четверо суток", "плохая погода", true},
                {"Олег", "Олегов", "г.Казань, Энгельса 3, кв 333", "Красносельская", "83380033535", "03.03.2023", "семеро суток", "плохая погода", true},
        };
    }

    @Test
    @UseDataProvider("getCredentials")
    public void checkRentOneOrder(String name, String lastname, String address, String metroStation, String phone, String duration, String orderDuration, String comment, boolean result){

        mainPage.open();
        MainPage.makeOrderOne();
        orderPage.inputCustomerName(name);
        orderPage.inputCustomerLastName(lastname);
        orderPage.inputCustomerAddress(address);
        orderPage.selectCustomerMetroStation(metroStation);
        orderPage.inputCustomerPhone(phone);
        orderPage.clickNextButton();

        orderPage.inputDateOrder(duration);
        orderPage.inputOrderDuration(orderDuration);
        orderPage.inputColorOrderGrey();
        orderPage.inputComment(comment);
        orderPage.clickOrderButton();
        orderPage.clickConfirmOrder();
        assertTrue(orderPage.orderConfirm().contains("Заказ оформлен"));
    }


    @Test
    @UseDataProvider("getCredentials")
    public void checkRentTwoOrder(String name, String lastname, String address, String metroStation, String phone, String duration, String orderDuration, String comment, boolean result) {
        mainPage.open();
        MainPage.makeOrderTwo();
        orderPage.inputCustomerName(name);
        orderPage.inputCustomerLastName(lastname);
        orderPage.inputCustomerAddress(address);
        orderPage.selectCustomerMetroStation(metroStation);
        orderPage.inputCustomerPhone(phone);
        orderPage.clickNextButton();

        orderPage.inputDateOrder(duration);
        orderPage.inputOrderDuration(orderDuration);
        orderPage.inputColorOrderBlack();
        orderPage.inputComment(comment);
        orderPage.clickOrderButton();
        orderPage.clickConfirmOrder();
        assertTrue(orderPage.orderConfirm().contains("Заказ оформлен"));
    }
}