package magang;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 11/21/2023 9:24 AM
@Last Modified 11/21/2023 9:24 AM
Version 1.0
*/

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magang.pages.LoginPage;
import magang.utills.constants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User access invalid url")
    public void User_access_invalid_url(){
        driver.get(constants.URL1);
        extentTest.log(LogStatus.PASS, "User access Siloam url");
    }

    @Then("User should see text not found")
    public void User_should_see_text_not_found(){
        Assert.assertEquals(loginPage.getTxtNotFound(), "Not Found");
        extentTest.log(LogStatus.PASS, "User should see text not found");
    }

    @Given("User access valid url")
    public void User_access_valid_url(){
        driver.get(constants.URL);
        extentTest.log(LogStatus.PASS, "User access Siloam url");
    }

    @Then("User should see warning text")
    public void User_should_see_warning_text(){
        Assert.assertEquals("", "Username or password invalid");
        extentTest.log(LogStatus.PASS, "User should see warning text");
    }
    @Then("User should see text home login")
    public void User_should_see_text_home_login(){
        Assert.assertEquals(loginPage.getTxtHomeLogin(), "DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "User should see text home login");
    }

    @Then("User should see text alert")
    public void User_should_see_text_alert(){
        Assert.assertEquals(loginPage.getTxtFillOut(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User should see text home login");
        loginPage.enterUsername(Keys.CONTROL+"A" + Keys.DELETE);
        loginPage.enterPassword(Keys.CONTROL+"A" + Keys.DELETE);
    }

    @When("User enter valid admin username")
    public void User_enter_valid_admin_username(){
        loginPage.enterUsername("admindika");
        extentTest.log(LogStatus.PASS, "User enter valid admin username");
    }

    @And("User enter valid admin password")
    public void User_enter_valid_admin_password(){
        loginPage.enterPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "User enter valid admin password");
    }

    @And("User click button login")
    public void User_click_button_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User should see text title page home admin")
    public void User_should_see_text_title_page_home_admin(){
        Assert.assertEquals(loginPage.getTxtHome(), "Home");
        Assert.assertEquals(loginPage.getTxtProfile(), "Administrator");
        extentTest.log(LogStatus.PASS, "User should see text title page home admin");
    }

    @Then("User should see text title page home sales")
    public void User_should_see_text_title_page_home_sales(){
        Assert.assertEquals(loginPage.getTxtHome(), "Home");
        Assert.assertEquals(loginPage.getTxtProfile(), "YESSA AINURROCHMA");
        extentTest.log(LogStatus.PASS, "User should see text title page home sales");
    }

    @And("User enter invalid admin username")
    public void User_enter_invalid_admin_username(){
        loginPage.enterUsername("admindikaaa");
        extentTest.log(LogStatus.PASS, "User enter invalid admin username");
    }

    @And("User enter invalid admin password")
    public void User_enter_invalid_admin_password(){
        loginPage.enterPassword("dika@pasword");
        extentTest.log(LogStatus.PASS, "User enter invalid admin password");
    }

    @When("User click profile")
    public void User_click_profile(){
        loginPage.clickProfile();
        extentTest.log(LogStatus.PASS, "User click profile");
    }

    @And("User click button logout")
    public void User_click_button_logout(){
        loginPage.clickBtnLogout();
        extentTest.log(LogStatus.PASS, "User click button logout");
    }

    @When("User enter valid sales username")
    public void User_enter_valid_sales_username(){
        loginPage.enterUsername("K6400001");
        extentTest.log(LogStatus.PASS, "User enter valid sales username");
    }

    @And("User enter valid sales password")
    public void User_enter_valid_sales_password(){
        loginPage.enterPassword("a");
        extentTest.log(LogStatus.PASS, "User enter valid sales password");
    }

    @And("User enter invalid sales username")
    public void User_enter_invalid_sales_username(){
        loginPage.enterUsername("D6200926");
        extentTest.log(LogStatus.PASS, "User enter invalid sales username");
    }
    @And("User enter invalid sales password")
    public void User_enter_invalid_sales_password(){
        loginPage.enterPassword("1997-10-22");
        extentTest.log(LogStatus.PASS, "User enter invalid sales password");
    }
}
