package practicum;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    public final WebDriver webDriver;

    public final String URL_DESTINATION = "https://qa-scooter.praktikum-services.ru/";

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

}