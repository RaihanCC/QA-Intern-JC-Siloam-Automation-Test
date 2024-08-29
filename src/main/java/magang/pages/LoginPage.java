package magang.pages;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 11/21/2023 9:21 AM
@Last Modified 11/21/2023 9:21 AM
Version 1.0
*/

import magang.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    // Locator Element @FindBy
    @FindBy(xpath = "//h1[normalize-space()='Not Found']")
    WebElement txtNotFound;
    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    WebElement txtHomeLogin;
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtDashboard;

    @FindBy(xpath = "//div[@class='info']")
    WebElement txtProfileName;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    WebElement profile;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement btnLogout;

    public String getTxtNotFound(){
        DriverSingleton.delay(3);
        return txtNotFound.getText();
    }
    public String getTxtHomeLogin(){
        DriverSingleton.delay(3);
        return txtHomeLogin.getText();
    }
    public String getTxtFillOut(){
        DriverSingleton.delay(2);
        String output = "";
        String required = username.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public void enterUsername(String username){
        this.username.sendKeys(username);
    }
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }
    public void clickBtnLogin(){
        this.btnLogin.click();
    }
    public void clickProfile(){
        profile.click();
    }
    public void clickBtnLogout(){
        btnLogout.click();
    }
    public void validLoginAdmin(){
        username.sendKeys("username");
        password.sendKeys("password");
        btnLogin.click();
    }
    public void validLoginSales(){
        username.sendKeys("username");
        password.sendKeys("password");
        btnLogin.click();
    }
    public void validLogout(){
        profile.click();
        btnLogout.click();
    }
    public String getTxtHome(){
        DriverSingleton.delay(3);
        return txtDashboard.getText();
    }
    public String getTxtProfile(){
        DriverSingleton.delay(3);
        return txtProfileName.getText();
    }
}
