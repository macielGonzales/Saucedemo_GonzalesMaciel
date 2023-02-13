package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {
    public static By userInput = By.xpath("//input[contains(@id,'user-name')]");
    public static By passwordInput = By.xpath("//input[contains(@id,'password')]");
    public static By loginButton = By.xpath("//input[contains(@id,'login-button')]");
}
