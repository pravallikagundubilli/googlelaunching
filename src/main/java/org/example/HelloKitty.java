package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HelloKitty {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
