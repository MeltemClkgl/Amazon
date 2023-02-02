package com.amazon.scenarios;


import com.amazon.ClassObjects;

public class Select_Phone extends ClassObjects {
    public static void main(String[] args) throws InterruptedException {


        testStepMethods.launchChromeBrowser_and_navigateToTheUrl();
        testStepMethods.searchForThePhone();
        testStepMethods.submitButton();

        testStepMethods.choosePhone();
        testStepMethods.getPrice();
        testStepMethods.stockAvailablity();
        testStepMethods.getColor();
        testStepMethods.getMemoryStorage();





    }
}