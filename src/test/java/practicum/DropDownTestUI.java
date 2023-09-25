package practicum;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class DropDownTestUI extends BaseUITest{
    MainPage mainPage = new MainPage(webDriver);

    @Test
    public void checkHowMuchButtons(){
        mainPage.open();
        mainPage.clickHowMuchButtons();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getHowMuchAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getHowMuchAnswer()));
    }


    @Test
    public void checkWantSeveralScootersButtons(){
        mainPage.open();
        mainPage.clickWantSeveralScootersButtons();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getWantSeveralScootersAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getWantSeveralScootersAnswer()));
    }

    @Test
    public void checkRentalTimeButtons(){
        mainPage.open();
        mainPage.clickRentalTimeButtons();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getRentalTimeAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getRentalTimeAnswer()));
    }

    @Test
    public void checkTodayOrderButtons(){
        mainPage.open();
        mainPage.clickTodayOrderButtons();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getTodayOrderAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getTodayOrderAnswer()));
    }


    @Test
    public void checkExtendAndEarlierButtons(){
        mainPage.open();
        mainPage.clickExtendAndEarlierButtons();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getExtendAndEarlierAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getExtendAndEarlierAnswer()));
    }

    @Test
    public void checkChargingButtons(){
        mainPage.open();
        mainPage.clickChargingButtons();
        String expected = "Самокат приезжает к вам с полной зарядкой." +
                " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                " Зарядка не понадобится.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getChargingAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getChargingAnswer()));
    }

    @Test
    public void checkCancellationButtons(){
        mainPage.open();
        mainPage.clickCancellationButtons();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getCancellationAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getCancellationAnswer()));
    }

    @Test
    public void checkFarAwayButtons(){
        mainPage.open();
        mainPage.clickFarAwayButtons();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(mainPage.getFarAwayButtonsAnswer()));
        assertEquals(expected, mainPage.getTextOfElement(mainPage.getFarAwayButtonsAnswer()));
    }

}