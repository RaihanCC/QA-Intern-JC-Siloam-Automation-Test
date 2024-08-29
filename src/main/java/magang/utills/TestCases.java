package magang.utills;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 11/14/2023 3:03 PM
@Last Modified 11/14/2023 3:03 PM
Version 1.0
*/

public enum TestCases {
    //Modul 1(Login and Logout)
    T1("User access invalid url"),
    T2("User access valid url"),
    T3("Login admin no username and password"),
    T4("Login admin with valid username and invalid password"),
    T5("Login admin with invalid username and valid password"),
    T6("Login admin with valid username"),
    T7("Login admin with invalid username"),
    T8("Login admin with valid password"),
    T9("Login admin with invalid password"),
    T10("Login admin with valid username and password"),
    T11("Logout admin"),
    T12("User access invalid url"),
    T13("User access valid url"),
    T14("Login sales no username and password"),
    T15("Login sales with valid username and invalid password"),
    T16("Login sales with invalid username and valid password"),
    T17("Login sales with valid username"),
    T18("Login sales with invalid username"),
    T19("Login sales with valid password"),
    T20("Login sales with invalid password"),
    T21("Login sales with valid username and password"),
    T22("Logout sales"),

    //Modul 2(View Export Admin Account)
    T23 ("View and export page admin"),
    T24 ("View and export with valid start and end date admin"),
    T25 ("Export with valid start and end date admin"),
    T26 ("View and export download with valid start and end date admin"),
    T27 ("View and export data view with valid start and end date admin"),
    T28 ("View and export document view with valid start and end date admin"),
    T29 ("View and export with valid start date but no end date admin"),
    T30 ("View and export with valid end date but no start date admin"),
    T31 ("View and export with no start and end date admin"),
    T32 ("View and export export with no start and end date admin"),
    T33 ("View and export download with no start and end date admin"),
    T34 ("Users export data with a date range exceeding 31 days admin"),
    T35 ("Users download data with a date range exceeding 31 days admin"),
    T36 ("Refresh"),

    //Modul 6 (Return Sales)
    T37 ("Return page sales"),
    T38 ("Return with valid start and end date sales"),
    T39 ("User reset return data sales"),
    T40 ("User search a data"),
    T41 ("Reset"),
    T42 ("Next page"),
    T43 ("Previous page"),
    T44 ("User selects different options for the number of entries to display"),
    T45 ("Bottom to top page"),
    T46 ("View data"),
    T47 ("Logout sales"),
    ;



    private String testCaseName;
    TestCases(String value){

        testCaseName = value;
    }

    public String getTestCaseName(){

        return testCaseName;
    }
}
