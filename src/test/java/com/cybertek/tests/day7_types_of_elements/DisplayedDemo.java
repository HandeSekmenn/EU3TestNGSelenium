package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));

        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

        //TASK
        //verify username input box is not displayed on the screen
        Assert.assertFalse(usernameInput.isDisplayed(), "verify inputbox is NOT displayed");

        //click start button
        //find start button and click in one line
        driver.findElement(By.cssSelector("#start>button")).click();

        //wait until elements displayed
        Thread.sleep(7000);

        //verify username displayed on the screen
        Assert.assertTrue(usernameInput.isDisplayed(),"verify username inputbox is displayed");





    }

}
