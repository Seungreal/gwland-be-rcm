package com.tplus.gwland.cmm.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class MakeCsv {
	public static int createCSV(List<reviewer> list, String title, String filepath) {
		int resultCount = 0;
		try{
			BufferedWriter fw = new BufferedWriter(new FileWriter(filepath + "/" + title + ".csv", true));
			for(reviewer dom:list) {fw.write("\""+dom.getRevStar()+"\",\""+dom.getRevNick()+"\",\""+
											 dom.getRevContent()+"\",\""+dom.getRevDate()+"\"");
			fw.newLine();}
			fw.flush();
			fw.close();
			}catch (Exception e) {
				e.printStackTrace();}
			return resultCount;}}
