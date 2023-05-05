package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {


        By userRoleDropDownADDUserLocator = By.xpath("//div[@class='oxd-select-text-input']");
        By userRoleDropdownButton = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
        By admin = By.xpath("//div[@id='app']//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div[contains(text(),'Admin')]");
        By employeeNameAddUserLocator = By.xpath("//input[@placeholder='Type for hints...']");
        By userNameAddUserLocator = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active oxd-input--error']");
        By statusDropDownAddUserLocator = By.xpath("//div[@class='oxd-select-text--after' and @xpath='1']");
        By passwordAddUser = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
        By confirmPasswordAddUser = By.xpath("//input[@fdprocessedid='isyno']");

        By saveAddUser = By.xpath("//button[normalize-space()='Save']");
        By cancelAddUser = By.xpath("//button[normalize-space()='Save']");
        By successfullySavedMessage = By.xpath("//div[@id='app']");


        public void selectUserRoleDropDownAddUserLocator(String value) {
            clickOnElement(userRoleDropdownButton);
            clickOnElement(admin);
            //selectByContainsTextFromDropDown(userRoleDropDownADDUserLocator,value);
        }

        public void enterEmployeeNameAddUserLocator(String text) {
            sendTextToElement(employeeNameAddUserLocator, text);
        }

        public void enterUserNameAddUserLocator(String text) {
            sendTextToElement(userNameAddUserLocator, text);
        }

        public void selectStatusDropDownAddUserLocator(String text) {
            selectByVisibleTextFromDropDown(statusDropDownAddUserLocator, text);
        }

        public void enterPasswordAddUser(String text) {
            sendTextToElement(passwordAddUser, text);
        }

        public void enterConfirmPasswordAddUser(String text) {
            sendTextToElement(confirmPasswordAddUser, text);
        }

        public void clickOnSaveAddUser() {
            clickOnElement(saveAddUser);
        }

        public void clickOnCancelAddUser() {
            clickOnElement(cancelAddUser);
        }

        public String getTextFromSuccessfullyAdded()
        {
           return getTextFromElement(successfullySavedMessage);
        }

}