package com.tplus.gwland.cmm.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class reviewer {
	
	@Override
	public String toString() {
		return "<"+pceNum+">"+revStar+", "+revNick+ ", " 
				  +revContent+", "+revDate;
	}
	String pceNum;
	String revStar;
	String revNick;
	String revContent;
	String revDate;
	
	public reviewer(
			String pceNum, String revStar, String revNick, 
			String revContent, String revDate){
		super();
		this.revStar = revStar;
		this.revNick = revNick;
		this.revContent = revContent;
		this.revDate = revDate;
		this.pceNum = pceNum;
	}
	public String getRevStar() {return revStar;}
	public void setRevStar(String revStar) {this.revStar = revStar;}
	public String getRevNick() {return revNick;}
	public void setRevNick(String revNick) {this.revNick = revNick;}
	public String getRevContent() {return revContent;}
	public void setRevContent(String revContent) {this.revContent = revContent;}
	public String getRevDate() {return revDate;}
	public void setRevDate(String revDate) {this.revDate = revDate;}
}

public class CrawlerBySele {
	public static List<reviewer> placeAutoUrl(ChromeDriver driver, String url, String number){
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement rev = driver.findElementByClassName("list_evaluation");
		
		List<WebElement> ls = rev.findElements(By.cssSelector("li"));
		List<reviewer> revList = new ArrayList<>();
		for(int i=0;i<ls.size();i++) {
			String revNick = ls.get(i).findElement(By.className("link_user")).getText();
			String revContent = ls.get(i).findElement(By.className("txt_comment")).getText();
			String revStar = ls.get(i).findElement(By.className("num_rate")).getText();
			String revDate = ls.get(i).findElement(By.className("time_write")).getText();
			revList.add(new reviewer(revStar,revNick,revContent,revDate,number));
			System.out.println(revList.get(i).toString());
		}
		return revList;
	}
	/*(예외처리) 6, 가도 가도 또 가고 싶은 여행지의 스테디셀러
	   	       7, 가슴 탁 트이는 속초여행 */
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		placeAutoUrl(driver,"https://place.map.kakao.com/21449945","1");//뉴욕제과
		placeAutoUrl(driver,"https://place.map.kakao.com/19125965","2");//함흥냉면옥
		placeAutoUrl(driver,"https://place.map.kakao.com/10924317","3");//함흥막국수
		placeAutoUrl(driver,"https://place.map.kakao.com/25622898","4");//88생선구이
		placeAutoUrl(driver,"https://place.map.kakao.com/1903622145","5");//YAT(와이에이티)
		placeAutoUrl(driver,"https://place.map.kakao.com/1903622145","5");//
		placeAutoUrl(driver,"https://place.map.kakao.com/1903622145","5");//
		placeAutoUrl(driver,"https://place.map.kakao.com/1903622145","5");//
		placeAutoUrl(driver,"https://place.map.kakao.com/1903622145","5");//
		placeAutoUrl(driver,"https://place.map.kakao.com/1903622145","5");//
		placeAutoUrl(driver,"https://place.map.kakao.com/1903622145","5");//
		
						
		
		
	}
}