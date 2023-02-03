package com.amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import static com.amazon.WebElements.AmazonWebElements.*;
import static com.amazon.driver.Driver.getDriver;

public class TestSteps extends ClassObjects {

    public void launchChromeBrowser_and_navigateToTheUrl() {
        try {
            System.out.println("STEP1-launchChromeBrowser_and_navigateToTheUrl step Initialized");
            getDriver().get(Constants.URL);
            System.out.println("STEP1 -launchChromeBrowser_and_navigateToTheUrl has done!");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("STEP1'DE HATA OLUSMUSTUR!");

        }
    }

     public void searchForThePhone() {
        try {
            System.out.println("STEP2-searchForThePhone Initialized");

            try {

                waitUtil.webDriverWait(searchBar_textBox = getWebElement("searchBar_textBox"), "visibility");//Implicitly wait

                searchBar_textBox.click();
                Thread.sleep(10000);

            } catch (NoSuchElementException e) {
                System.out.println("TESTE DEVAM ET");
            }

            (searchBar_textBox = getWebElement("searchBar_textBox")).sendKeys(Constants.PHONE);


            System.out.println("STEP2-searchForThePhone has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());

            System.out.println("STEP2'DE HATA OLUSMUSTUR!");
        }
    }

    public void submitButton() {

        try {
            System.out.println("STEP 3- submit button initialized!");
            searchBar_textBox.sendKeys(Keys.ENTER);
            System.out.println("STEP3 has done!");
        }catch (Exception e){
            System.out.println("STEP3'TE HATA OLUSMUSTUR!");
        }

    }
    public void choosePhone(){
        try {
            System.out.println("STEP4-choose_phone iPhone13 512 Initialized!");
            waitUtil.webDriverWait("","");
            (choosePhone=getWebElement("choose_phone")).click();
            Thread.sleep(3000);
            System.out.println("STEP4'has done!");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("STEP4'TE HATA OLUSMUSTUR!");
        }

    }
    public void getPrice(){
        try {
            System.out.println("STEP5-get_price initialized!");
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
            String elementText = (String) jsExecutor.executeScript("return arguments[0].innerText",getWebElement("get_price"));
            String price =get_price.getText();

            System.out.println("Step5- \n" +
                    price + elementText );
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("STEP5'TE HATA OLUSMUSTUR!");
        }

    }
    public void stockAvailablity(){
        try {
            System.out.println("Step6- stock_availability initialized!");
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
            String elementText = (String) jsExecutor.executeScript("return arguments[0].innerText",getWebElement("stock_availability"));
            String stock =stock_availablity.getText();
            System.out.println("Step6 \n"+
                   "Only 1 left in stock - order soon."+ stock + elementText);
        }catch (Exception e){
            System.out.println("STEP6'DA HATA OLUSMUSTUR\n" + "Only 1 left in stock - order soon.");
        }

    }
    public void getColor(){
        try{
            System.out.println("Step7 initialized");
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
            String elementText = (String) jsExecutor.executeScript("return arguments[0].innerText",getWebElement("get_color"));
            String color =get_color.getText();

            System.out.println("Step7 \n" +
                    color + elementText);
        }catch (Exception e){
            System.out.println("Step 7 haat almistir");
        }

    }
    public void getMemoryStorage(){
        try {
            System.out.println("Step8 initialized");
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
            String elementText = (String) jsExecutor.executeScript("return arguments[0].innerText",getWebElement("get_memory_storage"));
            String memory =get_memory_storage.getText();

            System.out.println("Step8 \n"+
                    memory + elementText);
        }catch (Exception e){
            System.out.println("Step8 de hata olmustur");
        }

    }


}
