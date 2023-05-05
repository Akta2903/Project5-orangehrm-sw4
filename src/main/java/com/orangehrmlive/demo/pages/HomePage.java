package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By search = By.xpath("//input[@placeholder='Search']");

    By admin = By.xpath("//li[1]//a[1]//span[1]");

    By PIM = By.xpath("//span[normalize-space()='PIM']");
    By leave = By.xpath("//span[normalize-space()='Leave']");
    By dashboardLocators = By.xpath("//h6[normalize-space()='Dashboard']");


    public void clickOnAdmin() {
        clickOnElement(admin);
    }

    public void clickOnPIM() {
        clickOnElement(PIM);
    }

    public void clickOnLeave() {
        clickOnElement(leave);
    }

    public void clickOnSearch() {
        clickOnElement(search);
    }

    public String getDashboardLocator(String text) {
        return getTextFromElement(dashboardLocators);

    }
}