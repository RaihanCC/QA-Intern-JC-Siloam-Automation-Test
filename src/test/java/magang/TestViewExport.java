package magang;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 11/21/2023 10:42 AM
@Last Modified 11/21/2023 10:42 AM
Version 1.0
*/

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magang.drivers.DriverSingleton;
import magang.pages.ViewExport;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestViewExport {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ViewExport viewExport = new ViewExport();
    public TestViewExport(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    private boolean isFileXls(File file) {
        return file.getName().toLowerCase().endsWith(".xls");
    }
    private int getDownloadedFilesCount() {
        // Assumes the use of Chrome browser. Adjust for other browsers accordingly.
        String downloadsFolder = System.getProperty("Users.Administrator") + "/Downloads";

        // List all files in the downloads folder
        String[] files = new java.io.File(downloadsFolder).list();

        // Return the number of files
        return files != null ? files.length : 0;
    }

    private File[] getDownloadedFilesList() {
        // Assumes the use of Chrome browser. Adjust for other browsers accordingly.
        String downloadsFolder = System.getProperty("Users.Administrator") + "/Downloads";

        // List all files in the downloads folder
        return new java.io.File(downloadsFolder).listFiles();
    }

    private boolean isFileZip(File file) {
        return file.getName().toLowerCase().endsWith(".zip");
    }

    @When("User click View and Export page")
    public void User_click_View_and_Export_page(){
        viewExport.clickViewExport();
    }

    @Then("User should see text title page View and Export admin")
    public void User_should_see_text_title_page_View_and_Export_admin(){
        Assert.assertEquals(viewExport.getTxtViewExport(), "View & Export");
        extentTest.log(LogStatus.PASS, "User should see text title page View and Export admin");
    }

    @When ("User pick a start date")
    public void User_pick_a_start_date(){
        viewExport.enterStartDate("2023-11-01");
        extentTest.log(LogStatus.PASS, "User pick a start date");
    }

    @And ("User pick an end date")
    public void User_pick_an_end_date(){
        viewExport.enterEndDate("2023-11-26");
        extentTest.log(LogStatus.PASS, "User pick an end date");
    }

    @And ("User click filter button")
    public void User_click_filter_button(){
        viewExport.clickBtnFilter();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "User click filter button");
    }

    @Then ("User click export button")
    public void User_click_export_button(){
        viewExport.clickBtnExport();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "User click export button");
    }

    @Then ("User click download button")
    public void User_click_download_button(){
        viewExport.clickBtnDownload();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "User click download button");
    }

    @And ("User click view button")
    public void User_click_view_button(){
        DriverSingleton.delay(3);
        viewExport.clickBtnView();
        extentTest.log(LogStatus.PASS, "User click view button");
    }

    @And ("User pick today date as the end date")
    public void User_pick_today_date_as_the_end_date(){
        viewExport.enterEndDate("2023-11-26");
        extentTest.log(LogStatus.PASS, "User pick today date as the end date");
    }

    @When ("User pick a start date 2 months ago from today date")
    public void User_pick_a_start_date_2_months_ago_from_today_date(){
        viewExport.enterStartDate("2023-09-26");
        extentTest.log(LogStatus.PASS, "User pick a start date 2 months ago from today date");
    }

    @And ("User click one of the document link")
    public void User_click_one_of_the_document_link(){
        viewExport.clickDocLink();
        extentTest.log(LogStatus.PASS, "User click one of the document link");
    }

    @Then ("User should see grid view of the data")
    public void User_should_see_grid_view_of_the_data(){
        Assert.assertEquals(viewExport.getGridData(), "Data");
        extentTest.log(LogStatus.PASS, "User should see grid view of the data");
    }

    @Then ("User should see text alert to fill the end date")
    public void User_should_see_text_alert_to_fill_the_end_date(){
        Assert.assertEquals(viewExport.getTxtFillOutEnd(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User should see text alert to fill the end date");
    }

    @Then("User should be directed to a new page to view the file")
    public void userShouldBeDirectedToANewPageToViewTheFile() {
        DriverSingleton.delay(3);
        String MainTab = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()){
            if (!handle.equals(MainTab)){
                driver.switchTo().window(handle);
                break;
            }
        }
        WebElement fileElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h4"));
        assertTrue("File is not displayed in the new tab", fileElement.isDisplayed());

        driver.close();
        driver.switchTo().window(MainTab);
        extentTest.log(LogStatus.PASS, "User should be directed to a new page to view the file");
    }

    @Then ("User should see text alert to fill the start date")
    public void User_should_see_text_alert_to_fill_the_start_date(){
        Assert.assertEquals(viewExport.getTxtFillOutStart(), "Please fill out this field.");
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "User should see text alert to fill the start date");
    }

    @Then ("User should see text alert to only select a date range up to 31 days back")
    public void User_should_see_text_alert_to_only_select_a_date_range_up_to_31_days_back(){
        Assert.assertEquals(viewExport.getTxtMoreThanOneMonth(), "Danger! Maximal Penarikan Data adalah 1 Bulan / 31 Hari !!!\n" +
                "×");
        extentTest.log(LogStatus.PASS, "User should see text alert to only select a date range up to 31 days back");
    }

    @When ("User click refresh button")
    public void User_click_refresh_button(){
        viewExport.clickBtnRefresh();
        extentTest.log(LogStatus.PASS, "User click refresh button");
    }

    @Then("User should see the file online in a new tab")
    public void userShouldSeeTheFileOnlineInANewTab() {
        String parentTab = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()){
            if (!handle.equals(parentTab)){
                driver.switchTo().window(handle);
                break;
            }
        }
        WebElement fileElement = driver.findElement(By.xpath("/html/body/img"));
        assertTrue("File is not displayed in the new tab", fileElement.isDisplayed());

        driver.close();
        driver.switchTo().window(parentTab);
    }

    @Then("The page reloading")
    public void thePageReloading() {
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

    @Then("User should see text alert to fill the start and end date")
    public void userShouldSeeTextAlertToFillTheStartAndEndDate() {
        Assert.assertEquals(viewExport.getTxtFillOutStartEnd(), "Danger! Mohon isi start_date dan end_date terlebih dahulu!!!");
        extentTest.log(LogStatus.PASS, "User should see text alert to fill the start date");
    }
}
