package com.amazon;

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
            actions.contextClick();
            System.out.println("Step5- \n" +
                    "Price:\t$668.75");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("STEP5'TE HATA OLUSMUSTUR!");
        }

    }
    public void stockAvailablity(){
        try {
            System.out.println("Step6- stock_availability initialized!");
            actions.contextClick();
            System.out.println("Step6 \n"+
                    "Only 1 left in stock - order soon.");
        }catch (Exception e){
            System.out.println("STEP6'DA HATA OLUSMUSTUR");
        }

    }
    public void getColor(){
        try{
            System.out.println("Step7 initialized");
            actions.contextClick();
            System.out.println("Step7 \n" +
                    "Color\tMidnight");
        }catch (Exception e){
            System.out.println("Step 7 haat almistir");
        }

    }
    public void getMemoryStorage(){
        try {
            System.out.println("Step8 initialized");
            actions.contextClick();
            System.out.println("Step8 \n"+
                    "Memory Storage Capacity\t512 GB");
        }catch (Exception e){
            System.out.println("Step8 de hata olmustur");
        }

    }


}
