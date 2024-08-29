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

public class ViewExport {

    public ViewExport() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='View & Export']")
    WebElement ViewExportbutton;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtViewExport;

    @FindBy(xpath = "//button[normalize-space()='Filter']")
    WebElement FilterButton;

    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement StartDate;

    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement EndDate;

    @FindBy(xpath = "//a[@title='Refresh']")
    WebElement RefreshButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/form/button")
    WebElement ExportButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/form/button")
    WebElement DownloadButton;

    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[2]/a")
    WebElement ViewButton;

    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[7]/a")
    WebElement ViewDoc;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[1]")
    WebElement GridData;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]")
    WebElement txtMoreThanOneMonth;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/h4")
    WebElement ViewData;

    public String getViewDatatxt(){
        return ViewData.getText();
    }

    public void clickViewExport(){
        ViewExportbutton.click();
    }
    public String getTxtViewExport(){
        DriverSingleton.delay(3);
        return txtViewExport.getText();
    }


    public String getTxtFillOutEnd(){
        DriverSingleton.delay(2);
        String output = "";
        String required = EndDate.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }

    public String getTxtFillOutStart(){
        DriverSingleton.delay(2);
        String output = "";
        String required = StartDate.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }

    public String getTxtFillOutStartEnd(){
        DriverSingleton.delay(2);
        String output = "";
        String required = StartDate.getAttribute("required");
        if (required.equals("true")){
            output += "Danger! Mohon isi start_date dan end_date terlebih dahulu!!!";
        }
        System.out.println(output);
        return output;
    }

    public String getTxtMoreThanOneMonth(){
        return txtMoreThanOneMonth.getText();
    }

    public void enterStartDate(String startDate){
        this.StartDate.sendKeys(startDate);
    }

    public void enterEndDate(String endDate){
        this.EndDate.sendKeys(endDate);
    }

    public void clickBtnFilter(){
        this.FilterButton.click();
    }

    public void clickBtnExport(){
        this.ExportButton.click();
    }

    public void clickBtnDownload(){
        this.DownloadButton.click();
    }

    public void clickBtnView(){
        this.ViewButton.click();
    }

    public void clickDocLink(){
        this.ViewDoc.click();
    }

    public String getGridData(){
        DriverSingleton.delay(3);
        return GridData.getText();
    }

    public void clickBtnRefresh(){
        this.RefreshButton.click();
    }

    public void validViewExport(){
        StartDate.sendKeys("2023-11-01");
        EndDate.sendKeys("2023-11-26");
        FilterButton.click();
    }

    public void invalidViewExport(){
        StartDate.sendKeys("2023-09-26");
        EndDate.sendKeys("2023-11-26");
        FilterButton.click();
    }
}