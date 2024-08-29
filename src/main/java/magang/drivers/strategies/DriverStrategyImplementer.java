package magang.drivers.strategies;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 11/14/2023 2:52 PM
@Last Modified 11/14/2023 2:52 PM
Version 1.0
*/

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy (String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
//            case "firefox":
//                return new Firefox();
            default:
                return null;
        }
    }
}
