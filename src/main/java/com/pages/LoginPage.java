package com.pages;

import com.qa.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // page objects
    private static final By USER_NAME = By.id("email");
    private static final By PASSWORD = By.id("loginPaswd");
    private static final By LOGIN_BTN = By.xpath("//button[contains(text(),'Login')]");
    private static final By FORGOT_PASSWORD_LINK = By.xpath("//a[contains(text(),'Forgot Password ?')]");

    // page constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    };
    ElementUtil sendKeysToElement;
    // page methods
    public void enterUsername(String username) throws InterruptedException {
        Thread.sleep(7000);
        driver.findElement(USER_NAME).sendKeys(username);
    }
    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(7000);
        driver.findElement(PASSWORD).sendKeys(password);
    }
    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(7000);
        driver.findElement(LOGIN_BTN).click();
    }
    public String getLoginPageUrl() throws InterruptedException {
        Thread.sleep(7000);
        return driver.getCurrentUrl();
    }
    public boolean getForgotPasswordLink(){
    return driver.findElement(FORGOT_PASSWORD_LINK).isDisplayed();
    }

    public boolean verifyValidInvalidLoginWithURL(String URL) throws InterruptedException {
        Thread.sleep(7000);
        return driver.getCurrentUrl().equals(URL);
    }
    public DashBoardPage doLogin(String username, String password) throws InterruptedException {
        Thread.sleep(7000);
        driver.findElement(USER_NAME).sendKeys(username);
        Thread.sleep(7000);
        driver.findElement(PASSWORD).sendKeys(password);
        Thread.sleep(7000);
        driver.findElement(LOGIN_BTN).click();
        return new DashBoardPage(this.driver);
    }
}
