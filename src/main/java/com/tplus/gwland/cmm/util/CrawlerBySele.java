package com.tplus.gwland.cmm.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tplus.gwland.rev.domain.ReviewDto;

import lombok.RequiredArgsConstructor;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// @Component @RequiredArgsConstructor

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.time.Duration;

public class CrawlerBySele extends Proxy {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// private final Vector<ReviewDto> artBag;
	public Vector<ReviewDto> crawling(String url2) {
		String url = "https://tickets.interpark.com/goods/20009147";
		logger.info(" URL : " + url);
		ArrayList<ReviewDto> artBag = new ArrayList<>();
		try {
			Document rawData = Jsoup.connect(url).timeout(10 * 1000).get();
			Elements titles = rawData.getElementsByClass("bbsTitle");
			Elements contents = rawData.select("b[class=bbsText]");
			ReviewDto review = null;
			logger.info(" titles.size() " + titles.size());
			for (int i = 0; i < titles.size(); i++) {
				logger.info(" for 내부 ");
				review = new ReviewDto();
				review.setRevContent(contents.get(i).text());
				logger.info("리뷰 번호" + i + "번: " + review.toString());
				artBag.add(review);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws InterruptedException {
		// Optional. If not specified, WebDriver searches the PATH for chromedriver.
		System.setProperty("webdriver.chrome.driver",
				"/usr/local/bin/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://map.naver.com/v5/entry/place/11733192?placePath=%2Freview%2Fvisitor%3Fentry=plt&c=14312298.4872012,4606368.8257065,15,0,0,0,dh");
		System.out.println(driver.getPageSource());

	}
}