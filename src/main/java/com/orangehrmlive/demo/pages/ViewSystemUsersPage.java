package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By systemUser = By.xpath("//h5[normalize-space()='System Users']");
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By userNameField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRollDropdown = By.xpath("By.xpath(\"//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By systemUserButton = By.xpath("//i[@class='oxd-icon bi-caret-down-fill']");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By statusDropdown = By.xpath("//div[@class='oxd-select-text--after' and@xpath='1']");
    By searchButton= By.xpath("//button[normalize-space()='Search']");
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By deleteButton =By.xpath("//i[@class='oxd-icon bi-trash']");
    By searchResult = By.xpath("//div[normalize-space()='John Smith']");
    By searchResultOfDeleteOperation = By.xpath("//div[contains(text(),'Carolinecarl CollingsMagare')]");
    By recordFoundCheckBox = By.xpath("//div[@role='columnheader']//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
    By deleteUserSuccessfullyMessageText = By.xpath("//div[@class='oxd-toast-container oxd-toast-container--bottom']");
    By userRole = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By admin = By.xpath("//div[contains(text(),'Admin')]");



    public String getSystemUserText(){
        return getTextFromElement(systemUser);
    }

    public String getAddUserText()
    {
        return getTextFromElement(addUserText);
    }


    public void enterUsernameField(String text){
        sendTextToElement(userNameField,text);
    }

    public void selectUserRollDropdown(String value){
       // selectByVisibleTextFromDropDown(userRollDropdown,value);
        //selectByContainsTextFromDropDown(userRollDropdown,value);
        clickOnElement(userRole);
        clickOnElement(admin);

    }

    public void enterEmployeeNameField(String text){
        sendTextToElement(employeeNameField,text);
    }

    public void selectStatusDropdown(String value){
        selectByVisibleTextFromDropDown(statusDropdown,value);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }

    public void clickOnResetButton(){
        clickOnElement(resetButton);
    }

    public void clickOnAddButton(){
        clickOnElement(addButton);
    }

    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
    public void clickOnSystemUserButton()
    {
        mouseHoverToElementAndClick(systemUserButton);
    }
    public String getTextSearchUserResultText()
    {
        return getTextFromElement(searchResult);
    }

    public String getSearchResultTextOfDeleteOperation()
    {
        return getTextFromElement(searchResultOfDeleteOperation);
    }

    public void clickOnCheckBox()
    {
        clickOnElement(recordFoundCheckBox);
    }
    public void clickOnOkInDeleteUserPopUp()
    {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String getDeleteUserSuccessfullyMessageText()
    {
        return getTextFromElement(deleteUserSuccessfullyMessageText);
    }
}
