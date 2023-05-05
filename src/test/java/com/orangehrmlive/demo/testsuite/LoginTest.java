package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();



    @Test

    public void verifyUserShouldLoginSuccessFully()
    {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        Assert.assertEquals(dashboardPage.getDashboardLocator(),"Dashboard");

    }
    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage()
    {
        //loginPage.isHRLogoIsDisplayed();
        Assert.assertTrue(loginPage.isHRLogoIsDisplayed());
    }

    @Test

    public void VerifyUserShouldLogOutSuccessFully()throws InterruptedException
    {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        dashboardPage.clickOnUserProfileLogo();
        //Thread.sleep(2000);
        dashboardPage.clickOnLogout();
        Assert.assertTrue(loginPage.isLoginPanelVisible());


    }

}
