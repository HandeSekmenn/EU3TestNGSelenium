package com.cybertek.tests.day6_Css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLocator {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cybertekschool.com/multipe_buttons");

        WebElement dontClick = driver.findElement(By.cssSelector("#disapearing_button"));

        System.out.println(dontClick.getText());

        driver.quit();

        }

    }
