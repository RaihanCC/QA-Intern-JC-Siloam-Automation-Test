package magang.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Chrome implements DriverStrategy {
        @Override
        public WebDriver setStrategy(){
            String path = "F:\\My Tools\\chromedriver19.exe";
            System.setProperty("webdriver.chrome.driver", path);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
            options.addArguments("--no-sanbox");
            return new ChromeDriver(options);
        }
    }
