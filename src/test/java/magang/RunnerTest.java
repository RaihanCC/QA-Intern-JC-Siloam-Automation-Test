package magang;
/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author Raihan a.k.a. Muhammad Raihan
Java Developer
Created on 11/14/2023 4:36 PM
@Last Modified 11/14/2023 4:36 PM
Version 1.0
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/01Login.feature",
                "src/main/resources/features/02ViewExport.feature",
                "src/main/resources/features/01Login.feature"},
        glue = "magang",
        plugin = {"pretty", "html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
