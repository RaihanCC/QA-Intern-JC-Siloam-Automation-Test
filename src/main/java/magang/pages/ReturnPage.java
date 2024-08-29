package magang.pages;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 12/12/2023 9:19 AM
@Last Modified 12/12/2023 9:19 AM
Version 1.0
*/

import magang.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnPage {
//    private boolean lastPage;
//    private boolean nextButtonEnabled;

    public ReturnPage() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='New']")
    WebElement Returnbutton;

    @FindBy(xpath = "//button[@id='btn-reset']")
    WebElement ResetReturnSalesButton;

    @FindBy(xpath = "//input[@type='search']")
    WebElement SearchBox;

    @FindBy(xpath = "//span[@id='btnSearch']")
    WebElement SearchButton;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/center[1]/a[1]/span[1]")
    WebElement AksiButton;

    @FindBy(xpath = "//select[@name='table_length']")
    WebElement EntryDropdown;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement NextPageButton;

    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement PreviousPageButton;

    @FindBy(xpath = "//span[@id='btnRefresh']")
    WebElement RefreshBtnSales;

    @FindBy(xpath = "//a[@class='btn btn-icon btn-circle btn-success btn-scroll-to-top fade show']")
    WebElement BtmtoTopbtn;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    WebElement ProfileSales;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement LogoutSales;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[1]/td[5]")
    static WebElement Jakarta;

    @FindBy(xpath = "//button[@id='btn-filter']")
    WebElement FilterBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement FormReturn;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/h4")
    WebElement GridDataSales;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[25]/td[1]")
    WebElement TwentyFiveGrid;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement FormInput;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[10]/td[1]")
    WebElement TwentyNextPage;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[10]/td[1]")
    WebElement TenPrevPage;

    @FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[1]/td[3]")
    WebElement BPJSDefault;

    @FindBy(xpath = "//input[@id='tgl']")
    WebElement StartDateSales;

    @FindBy(xpath = "//input[@id='tgl2']")
    WebElement EndDateSales;

    public void enterStartDateSales(String startDateSales){
        this.StartDateSales.sendKeys(startDateSales + Keys.ENTER);
    }

    public void enterEndDateSales(String endDateSales){
        this.EndDateSales.sendKeys(endDateSales);
    }

    public String getDefaultTextBPJS(){
        return BPJSDefault.getText();
    }

    public String getTenPrevText(){
        return TenPrevPage.getText();
    }

    public String getTwentyNextText(){
        return TwentyNextPage.getText();
    }

    public String getFormInputText(){
        return FormInput.getText();
    }

    public String getTwentyFiveData(){
        return TwentyFiveGrid.getText();
    }

    public String getGridDataSales(){
        return GridDataSales.getText();
    }

    public void clickBtnFilter(){
        this.FilterBtn.click();
    }

    public void clickLogoutSales(){
        this.LogoutSales.click();
    }

    public void clickBtnReturn() {
        Returnbutton.click();
    }

    public void clickBtnResetReturn() {
        this.ResetReturnSalesButton.click();
    }

    public void clickBtnSearch() {
        this.SearchButton.click();
    }

    public void enterSearchBox(String dataSearch) {
        this.SearchBox.sendKeys(dataSearch);
    }

    public void enterDropdown(String dataDropdown){
        this.EntryDropdown.sendKeys(dataDropdown);
    }

    public void clickBtnAksi() {
        this.AksiButton.click();
    }

//    public void clickDropdown() {
//        this.EntryDropdown.click();
//    }

    public void clickNextPagebtn() {
        this.NextPageButton.click();
    }

    public void clickPreviousPage() {
        this.PreviousPageButton.click();
    }

    public void clickRefreshbtn() {
        this.RefreshBtnSales.click();
    }

    public void clickBottomtoTopbtn(){
        this.BtmtoTopbtn.click();
    }

    public void clickProfile(){
        ProfileSales.click();
    }

    public static String getTxtJKT(){
        return Jakarta.getText();
    }

    public String getTxtReturn(){
        return FormReturn.getText();
    }
}
