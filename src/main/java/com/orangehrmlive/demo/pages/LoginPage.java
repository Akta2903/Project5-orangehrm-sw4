package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userName = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By hRLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
   By loginPanel = By.xpath("//div[@class='orangehrm-login-container']");


    public void enterUsername(String UserName){
        sendTextToElement(userName,UserName);
    }

    public void enterPassword(String Password){
        sendTextToElement(password,Password);
    }

    public void clickOnLogin(){
        clickOnElement(loginButton);
    }
/*

    public String getLoginPanelText(String value){
        return getTextFromElement(loginPanel);
    }
*/
public boolean isHRLogoIsDisplayed(){
//    WebElement hrLogo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"));
//    boolean logoVisible = hrLogo.isDisplayed();
//    return  logoVisible;
    return isElementPresent(hRLogo);

}

public boolean isLoginPanelVisible()
{
//    WebElement loginPanel = driver.findElement(By.xpath("//div[@class='orangehrm-login-container']"));
//    boolean isLoginPanelVisible = loginPanel.isDisplayed();
//    return isLoginPanelVisible;
   return isElementPresent(loginPanel);

}

}
