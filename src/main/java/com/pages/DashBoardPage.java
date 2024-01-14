package com.pages;

import com.qa.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashBoardPage {

    private WebDriver driver;
    // page objects
    private static final By DASHBOARD_ICON = By.xpath("//span[contains(text(),'Dashboard')]");

    // page constructor
    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    // page methods
    public boolean isDashboardIconVisible() throws InterruptedException {
        Thread.sleep(7000);
        return driver.findElement(DASHBOARD_ICON).isDisplayed();
    }

    public String getDashboardPageUrl() throws InterruptedException {
        Thread.sleep(7000);
        return driver.getCurrentUrl();
    }

}
