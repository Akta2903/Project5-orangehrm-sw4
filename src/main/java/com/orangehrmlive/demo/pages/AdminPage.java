package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By userManagement= By.xpath("//span[normalize-space()='User Management']");

    By job = By.xpath("//div[@class='oxd-topbar-body']//li[@class='--active oxd-topbar-body-nav-tab --parent']");
    By organizationTabLocators = By.xpath("");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    public void clickOnUserManagement(){
        clickOnElement(userManagement);
    }

    public void clickOnJob(String text){
        selectByValueFromDropDown(job,text);
    }

    public void clickOnOrganization(String text){
        selectByValueFromDropDown(organizationTabLocators,text);
    }



    public void clickOnAddButton()
    {
        clickOnElement(addButton);
    }



}
