package com.amazon.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    static private WebDriver driver;
    static private Driver myObject;

    private Driver()
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
    }

    static public WebDriver getDriver()
    {
        if(driver==null)
            myObject=new Driver();

        return driver;

    }

}
