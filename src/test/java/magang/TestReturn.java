package magang;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 12/12/2023 9:21 AM
@Last Modified 12/12/2023 9:21 AM
Version 1.0
*/

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magang.drivers.DriverSingleton;
import magang.pages.ReturnPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.Driver;

import static org.testng.Assert.assertNotEquals;

public class TestReturn {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ReturnPage returnPage = new ReturnPage();
    public TestReturn() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click Return page")
    public void userClickReturnPage(){
        returnPage.clickBtnReturn();
    }

    @When("User click reset button")
    public void userClickResetButton() {
        DriverSingleton.delay(3);
        returnPage.clickBtnResetReturn();
        extentTest.log(LogStatus.PASS, "User click reset button");
    }

    @When("User type the data in search box")
    public void userTypeTheDataInSearchBox() {
        returnPage.enterSearchBox("jkt");
        extentTest.log(LogStatus.PASS, "User type the data in search box");
    }

    @And("User click the search button")
    public void userClickTheSearchButton() {
        DriverSingleton.delay(3);
        returnPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click the search button");
    }

    @When("User click refresh button sales")
    public void userClickRefreshButtonSales() {
        DriverSingleton.delay(3);
        returnPage.clickRefreshbtn();
        extentTest.log(LogStatus.PASS, "User click refresh button sales");
    }

    @When("User click the previous button")
    public void userClickThePreviousButton() {
        returnPage.clickPreviousPage();
        extentTest.log(LogStatus.PASS, "User click the previous button");
    }

    @When("User click buttom to top button")
    public void userClickButtomToTopButton() {
        DriverSingleton.scrollDown();
        returnPage.clickBottomtoTopbtn();
        extentTest.log(LogStatus.PASS, "User click buttom to top button");
    }

    @When("User click aksi button")
    public void userClickAksiButton() {
        returnPage.clickBtnAksi();
        extentTest.log(LogStatus.PASS, "User click aksi button");
    }

    @When("User click profile sales")
    public void userClickProfileSales() {
        returnPage.clickProfile();
        extentTest.log(LogStatus.PASS, "User click profile sales");
    }

    @Then("User should see text title page Return sales")
    public void userShouldSeeTextTitlePageReturnSales() {
        Assert.assertEquals(returnPage.getTxtReturn(), "Form Return");
        extentTest.log(LogStatus.PASS, "User should see text title page Return sales");
    }

    @Then("User should see grid view of the data sales")
    public void userShouldSeeGridViewOfTheDataSales() {
        Assert.assertEquals(returnPage.getGridDataSales(), "Data Table");
        extentTest.log(LogStatus.PASS, "User should see grid view of the data sales");
    }

    @Then("The data reset to the default")
    public void theDataResetToTheDefault() {
        Assert.assertEquals(returnPage.getDefaultTextBPJS(), "1212880212177");
        extentTest.log(LogStatus.PASS, "User should see text not found");
    }

    @Then("User should see the data they are looking for")
    public void userShouldSeeTheDataTheyAreLookingFor() {
        Assert.assertEquals(ReturnPage.getTxtJKT(), "jkt");
        extentTest.log(LogStatus.PASS, "User should see the data they are looking for");
    }

    @Then("The return page reloading")
    public void theReturnPageReloading() {
        // Capture the current page's HTML source before the action
        String pageSourceBefore = driver.getPageSource();
        try {
            Thread.sleep(5000); // Wait for 5 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Capture the current page's HTML source after the action
        String pageSourceAfter = driver.getPageSource();

        // Assertion: Check if the page source before and after the action is different
        assertNotEquals("The page is not reloading", pageSourceBefore, pageSourceAfter);
    }

    @Then("User will move to the next page")
    public void userWillMoveToTheNextPage() {
        DriverSingleton.delay(3);
        Assert.assertEquals(returnPage.getTwentyNextText(), "20");
        extentTest.log(LogStatus.PASS, "User will move to the next page");
    }

    @Then("User will go back to the previous page")
    public void userWillGoBackToThePreviousPage() {
        DriverSingleton.delay(3);
        Assert.assertEquals(returnPage.getTenPrevText(), "10");
        extentTest.log(LogStatus.PASS, "User will go back to the previous page");
    }

    @Then("User directed to the very top of the page")
    public void userDirectedToTheVeryTopOfThePage() {
        DriverSingleton.scrollUp();
        extentTest.log(LogStatus.PASS, "User directed to the very top of the page");
    }

    @Then("User will redirected to upload document in Form Input page")
    public void userWillRedirectedToUploadDocumentInFormInputPage() {
        Assert.assertEquals(returnPage.getFormInputText(), "Form Return");
        extentTest.log(LogStatus.PASS, "User will redirected to upload document in Form Input page");
    }

    @And("User click button logout sales")
    public void userClickButtonLogoutSales() {
        returnPage.clickLogoutSales();
        extentTest.log(LogStatus.PASS, "User click button logout sales");
    }

    @When("User click the next page button")
    public void userClickTheNextPageButton() {
        DriverSingleton.delay(3);
        DriverSingleton.scrollDown();
        returnPage.clickNextPagebtn();
        extentTest.log(LogStatus.PASS, "User click the next page button");
    }

    @And("User click filter button sales")
    public void userClickFilterButtonSales() {
        DriverSingleton.delay(3);
        returnPage.clickBtnFilter();
        extentTest.log(LogStatus.PASS, "User click filter button sales");
    }

    @When("User selects to display twenty five entries")
    public void userSelectsToDisplayTwentyFiveEntries() {
        returnPage.enterDropdown("25");
        extentTest.log(LogStatus.PASS, "User selects to display twenty five entries");
    }

    @When("User pick a start date sales")
    public void userPickAStartDateSales() {
        returnPage.enterStartDateSales("2023-11-01");
        extentTest.log(LogStatus.PASS, "User pick a start date sales");
    }

    @And("User pick an end date sales")
    public void userPickAnEndDateSales() {
        returnPage.enterEndDateSales("2023-11-01");
        extentTest.log(LogStatus.PASS, "User pick an end date sales");
    }

    @Then("Data displayed should match the selected option of Twenty Five entries")
    public void dataDisplayedShouldMatchTheSelectedOptionOfTwentyFiveEntries() {
        Assert.assertEquals(returnPage.getTwentyFiveData(), "25");
        extentTest.log(LogStatus.PASS, "Data displayed should match the selected option of Twenty Five entries");
    }
}
