package com.amazon.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.amazon.driver.Driver.getDriver;

public class AmazonWebElements {

    static public WebElement searchBar_textBox;
    static public WebElement choosePhone;

    static public WebElement get_price;
    static public WebElement stock_availablity;
    static public WebElement get_color;
    static public WebElement get_memory_storage;




    public static WebElement getWebElement(String webElement) throws MyWebElementNameIsWrongException {

        WebElement element = null;

        switch (webElement) {
            case "searchBar_textBox":
                element=getDriver().findElement(By.id("twotabsearchtextbox"));break;
            case "submit_button":
            element=getDriver().findElement(By.id("nav-search-submit-button"));break;


            case "choose_phone":
                element=getDriver().findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));break;

            case "get_price":
                element=getDriver().findElement(By.xpath("//*[@id=\"corePrice_feature_div\"]/div/span/span"));break;

            case  "stock_availablity":
                element=getDriver().findElement(By.xpath("//*[@id=\"availability\"]/span"));break;

            case "get_color":
                element=getDriver().findElement(By.xpath("//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[7]/td[2]/span"));break;

            case "get_memory_storage":
                element=getDriver().findElement(By.xpath("//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[5]/td[2]/span"));break;





        }
        return element;
    }

}
