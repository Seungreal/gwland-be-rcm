package com.tplus.gwland.cmm.util;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CrawlerBySele{
public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        
        // WebDriver 객체 생성
        ChromeDriver driver = new ChromeDriver( options );
        
        // 탭 목록 가져오기
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        
        // 웹페이지 요청
        driver.get("https://place.map.kakao.com/25584941?service=search_pc");
        
        // 웹페이지에서 글제목 가져오기
        WebElement page1_title = driver.findElementByXPath("//*[@id=\"content\"]/div[1]/div[1]/div/h2");
        if( page1_title != null  ) {
            System.out.println( page1_title.getText() );            
        }
        // 웹페이지 소스 출력
        //System.out.println( driver.getPageSource() );
        
        // 탭 종료
        driver.close();
        
        
        
        // 두번째 탭으로 전환
        driver.switchTo().window(tabs.get(1));
        
        // 웹페이지 요청
        driver.get("https://place.map.kakao.com/25584941?service=search_pc");
        
        // 웹페이지에서 글제목 가져오기
        WebElement page2_title = driver.findElementByXPath("//*[@id=\"content\"]/div[1]/div[1]/div/h1");
        if( page1_title != null  ) {
            System.out.println( page2_title.getText() );            
        }
        
        // 웹페이지 소스 출력
        //System.out.println( driver.getPageSource() );
        
        // 탭 종료
        driver.close();
        
        // 5초 후에 WebDriver 종료
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // WebDriver 종료
            driver.quit();
        }
    }

		
}