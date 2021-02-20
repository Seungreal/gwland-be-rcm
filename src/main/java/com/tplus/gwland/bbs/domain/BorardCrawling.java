package com.tplus.gwland.bbs.domain;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class BorardCrawling {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://m.place.naver.com/my/review/6004dfbc6f7dc20061207174?v=2").get();
		Elements el = doc.getElementsByAttributeValue("class","LinesEllipsis LinesEllipsis--clamped ");
		Elements el2 = doc.getElementsByAttributeValue("class","CVsLec8cBK");
		
		System.out.println(el);
		System.out.println(el2);
		System.out.println("aaa");
	}
}
