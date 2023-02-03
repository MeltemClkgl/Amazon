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
                get_price=getDriver().findElement(By.xpath("//*[@id=\"corePrice_feature_div\"]/div/span"));
                element=get_price;break;


            case  "stock_availablity":
                stock_availablity=getDriver().findElement(By.xpath("//*[@id=\"availabilityInsideBuyBox_feature_div\"]/div"));
                element=stock_availablity;break;


            case "get_color":
                get_color=getDriver().findElement(By.xpath("//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[7]/td[2]/span"));
                element=get_color;break;

            case "get_memory_storage":
                get_memory_storage=getDriver().findElement(By.xpath("//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[5]/td[2]/span"));
                element=get_memory_storage;break;





        }
        return element;
    }

}
