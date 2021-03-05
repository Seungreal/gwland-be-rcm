package com.tplus.gwland.cmm.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tplus.gwland.rev.domain.ReviewDto;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class Crawler extends Proxy {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// private final Vector<ReviewDto> artBag;
	public Vector<ReviewDto> crawling(String url2) {
		String url = "https://www.tripadvisor.co.kr/Hotel_Review-g317129-d10547364-Reviews-Ramada_Gangwon_Sokcho_Hotel-Sokcho_Gangwon_do.html";
		ArrayList<ReviewDto> artBag = new ArrayList<>();
		try {
			Document rawData = Jsoup.connect(url).timeout(10 * 1000).get();
			Elements data = rawData.select("div[class=_2wrUUKlw _3hFEdNs8]");
			ReviewDto review = null;
			System.out.println(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Crawler c = new Crawler();
		c.crawling("");
	}
}