package com.cybertek.tests.reviews.week1;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_CybertekUrlTask {
    /*
    go to http://practice.cybertekschool.com/ website
    verify if the URL contains "cybertekschool"
    verify the title as well "Practice"
     */
    public static void main(String[] args) {

        //initialize my driver object
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to the page
        driver.get("http://practice.cybertekschool.com/");

        //I want to maximize my page, sometimes selenium cannot find element without maximizing the page
        driver.manage().window().maximize();

        String expectedUrlText = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        System.out.println("Verify if the Url contains \"cybertekschool\": "+actualUrl.contains(expectedUrlText));;

        System.out.println();



    }






}
