package com.tplus.gwland.cmm.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tplus.gwland.bbs.repository.BoardRepository;
import com.tplus.gwland.bbs.service.BoardServiceImpl;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@SessionAttributes({"ctx", "bbs"})
public class HomeController {
	final HttpSession session;
	final HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@GetMapping("/")
	public String home() {
		String ctx = request.getContextPath();
		session.setAttribute("ctx", ctx);
		session.setAttribute("bbs", ctx+"/resources/bbs");
		return "public";
	}
	@GetMapping("/{dir}/{page}")
	public String move(@PathVariable String dir,@PathVariable String page) {
		return dir+":"+page;
	}
}





