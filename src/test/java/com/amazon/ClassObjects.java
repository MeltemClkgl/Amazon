package com.amazon;

import com.amazon.ReusableMethods.WaitUtility;
import org.openqa.selenium.interactions.Actions;

import static com.amazon.driver.Driver.getDriver;

public class ClassObjects {
    public static TestSteps testStepMethods = new TestSteps();
    public static WaitUtility waitUtil = new WaitUtility();
    public static Actions actions=new Actions(getDriver());

}
