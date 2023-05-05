package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By dashboardLocators = By.xpath("//h6[normalize-space()='Dashboard']");
    By profileDropdownLocator= By.xpath("//li[@class='--active oxd-userdropdown']//i");
    By logout = By.xpath("//a[normalize-space()='Logout']");
    By profileLogo =By.xpath("//img[@class='oxd-userdropdown-img']");


    public String getDashboardLocator(){
        return getTextFromElement(dashboardLocators);
    }

    public void selectLogoutFromProfileDropdown(String dropdownOption)
    {
        selectByContainsTextFromDropDown(profileDropdownLocator,dropdownOption);
    }

    public void clickOnUserProfileLogo()
    {
        clickOnElement(profileLogo);
    }

    public void clickOnLogout()
    {
        mouseHoverToElementAndClick(logout);
    }

}
