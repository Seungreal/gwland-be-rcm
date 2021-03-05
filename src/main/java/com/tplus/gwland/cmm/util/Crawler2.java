package com.tplus.gwland.cmm.util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

public class Crawler2 {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "src/main/resources/static/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            driver.get("https://map.kakao.com/");
            
            System.out.println(driver.getPageSource());
        } finally {
            driver.quit();
        }
    }
}