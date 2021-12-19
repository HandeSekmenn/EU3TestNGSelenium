package com.cybertek.tests.reviews.week2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/index.html");

        //navigate to  Laptops Category
        driver.findElement(By.linkText("Laptops")).click();

        Thread.sleep(1000);


        //Then Sony vaio i7 laptop
        driver.findElement(By.partialLinkText("i7")).click();


        Thread.sleep(2000);
        int expectedPrice = 790;

        WebElement priceTextElement = driver.findElement(By.tagName("chrome"));

        String priceText = priceTextElement.getText();

        System.out.println("priceText = " + priceText);

        //priceText = $790 * includes tax

        String [] arr = priceText.split(" "); //top get the numbers I am dividing the text to pieces

        //arr[0]=$790

        int actualPrice = Integer.parseInt(arr[0].substring(1)); //wrapper class to cast my String into

        //Assertion : Verification ........TestNG comes with assertion methods

        System.out.println("Actual and Expected Price is same : "+(expectedPrice==actualPrice));

        if (expectedPrice==actualPrice){
            System.out.println("Actual and Expected Price is same");
        }else{
            System.out.println("Test Failed,price is not same");
        }



        driver.close();



    }

}
