package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    ViewSystemUsersPage systemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();


    @Test
    public void adminShouldAddUserSuccessFully()
    {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        homePage.clickOnAdmin();
        Assert.assertEquals(systemUsersPage.getSystemUserText(),"System Users");
        systemUsersPage.clickOnAddButton();
        Assert.assertEquals(systemUsersPage.getAddUserText(),"Add User");
        addUserPage.selectUserRoleDropDownAddUserLocator("Admin");
        addUserPage.enterEmployeeNameAddUserLocator("Ananya Dash");
        addUserPage.enterUserNameAddUserLocator("ananya");
        addUserPage.selectStatusDropDownAddUserLocator("Disabled");
        addUserPage.enterPasswordAddUser("Admin@123");
        addUserPage.enterConfirmPasswordAddUser("Admin@123");
        addUserPage.clickOnSaveAddUser();
        Assert.assertEquals(addUserPage.getTextFromSuccessfullyAdded(),"Successfully Saved");


    }

    @Test
    public void searchTheUserCreatedAndVerifyIt()
    {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        homePage.clickOnAdmin();
        Assert.assertEquals(systemUsersPage.getSystemUserText(),"System Users");
       // systemUsersPage.clickOnSystemUserButton();
        systemUsersPage.enterUsernameField("John.Smith");
        systemUsersPage.selectUserRollDropdown("Admin");
        systemUsersPage.selectStatusDropdown("Enabled");
        systemUsersPage.clickOnSearchButton();
        Assert.assertEquals(systemUsersPage.getTextSearchUserResultText(),"John Smith");

    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException
    {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        homePage.clickOnAdmin();
        Assert.assertEquals(systemUsersPage.getSystemUserText(),"System Users");
        // systemUsersPage.clickOnSystemUserButton();
        systemUsersPage.enterUsernameField("Admin");
        Thread.sleep(2000);
        systemUsersPage.selectUserRollDropdown("Admin");
        systemUsersPage.selectStatusDropdown("Enabled");
        systemUsersPage.clickOnSearchButton();
        Assert.assertEquals(systemUsersPage.getTextSearchUserResultText(),"Carolinecarl CollingsMagare");
        systemUsersPage.clickOnCheckBox();
        systemUsersPage.clickOnDeleteButton();
        systemUsersPage.clickOnOkInDeleteUserPopUp();
        Assert.assertEquals(systemUsersPage.getDeleteUserSuccessfullyMessageText(),"Successfully Deleted");


    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException
    {
        Thread.sleep(1000);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        homePage.clickOnAdmin();
        Assert.assertEquals(systemUsersPage.getSystemUserText(),"System Users");
        // systemUsersPage.clickOnSystemUserButton();
        systemUsersPage.enterUsernameField("Admin");
        //Thread.sleep(2000);
        systemUsersPage.selectUserRollDropdown("Admin");
        systemUsersPage.selectStatusDropdown("Enabled");
        systemUsersPage.clickOnSearchButton();

    }

    
}
