package practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public  class OrderPage extends BasePage {
    protected OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    // Локатор для Поля "Имя"
    private By firstNameCustomer = By.xpath("//input[@placeholder ='* Имя']");

    // Локатор для Поля "Фамилия"
    private By lastNameCustomer = By.xpath("//input[@placeholder ='* Фамилия']");

    // Локатор для Поле "Адрес"
    private By addressCustomer = By.xpath("//input[@placeholder ='* Адрес: куда привезти заказ']");

    // Локатор для Поля "Телефон"
    private By phoneCustomer = By.xpath("//input[@placeholder ='* Телефон: на него позвонит курьер']");

    // Локатор для Кнопка далее
    private By nextButton = By.xpath("//button[text()= 'Далее']");

    //    Локатор поля даты
    private By dateOrder = By.xpath("//*[contains(@placeholder, '* Когда привезти самокат')]");

    //   Локатор предыдущего месяца
    private By previosMonth = By.xpath("//div[contains(@class, 'react-datepicker')]//button[contains(text(), 'Previous Month')]");

    //   Локатор следующего месяца
    private By nextMonth = By.xpath("//div[contains(@class, 'react-datepicker')]//button[contains(text(), 'Next Month')]");

    //    Локатор срока аренды
    private By periodDuration = By.xpath("//*[@class='Dropdown-placeholder']");

    //Локатор выбора черного цвета
    private By blackColor = By.id("black");

    //Локатор выбора Серого цвета
    private By greyColor = By.id("grey");

    //Локатор для комментарий для курьера
    private By commentOrder = By.xpath("//input[@placeholder ='Комментарий для курьера']");

    //Локатор кнопки "Заказать"
    private By orderButton = By.xpath("//div[contains(@class, 'Order_Buttons')]//button[contains(text(), 'Заказать')]");

    //Локатор кнопки "Да"
    private By confirmButton = By.xpath("//div[contains(@class, 'Order_Buttons')]//button[contains(text(),'Да')]");

    //Локатор подтвержденного заказа
    private By listOrder = By.xpath("//div[contains(@class, 'Order_ModalHeader')]");

    public void inputCustomerName(String name){
        webDriver.findElement(firstNameCustomer).sendKeys(name);
    }

    public void inputCustomerLastName(String lastName){
        webDriver.findElement(lastNameCustomer).sendKeys(lastName);
    }

    public void inputCustomerAddress(String address){
        webDriver.findElement(addressCustomer).sendKeys(address);
    }

    public void selectCustomerMetroStation(String metroStation){
        // Локатор для Поля "Станция метро"
        By metroStationCustomer = By.xpath("//input[@placeholder ='* Станция метро']");
        By station = By.xpath("//div[@class='select-search__select']//*[text()='"+metroStation+"']");
        webDriver.findElement(metroStationCustomer).click();
        webDriver.findElement(station).click();
    }

    public void inputCustomerPhone(String phone){
        webDriver.findElement(phoneCustomer).sendKeys(phone);
    }

    public void clickNextButton(){
        webDriver.findElement(nextButton).click();
    }

    public void inputDateOrder(String dateTime){
        webDriver.findElement(dateOrder).click();
        webDriver.findElement(dateOrder).sendKeys(dateTime);
        webDriver.findElement(dateOrder).sendKeys(Keys.ENTER);
    }

    public void inputOrderDuration(String Duration){
        webDriver.findElement(periodDuration).click();
        webDriver.findElement(By.xpath("//*[text()='"+Duration+"']")).click();
    }

    public void inputColorOrderBlack() {
        webDriver.findElement(blackColor).click();
    }

    public void inputColorOrderGrey() {
        webDriver.findElement(greyColor).click();
    }

    public void inputComment(String comment){
        webDriver.findElement(commentOrder).sendKeys(comment);
    }

    public void clickOrderButton(){
        webDriver.findElement(orderButton).click();
    }

    public void clickConfirmOrder(){
        webDriver.findElement(confirmButton).click();
    }

    public String orderConfirm(){
        return webDriver.findElement(listOrder).getText();
    }
}