package com.liuhao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liuhao.pojo.Article;
import com.liuhao.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(Model model,String condition) {
		System.out.println("-------------------------------------");
		List<Article> articleList = articleService.list(condition);
		
		model.addAttribute("condition", condition);
		model.addAttribute("articleList", articleList);
		return "list";
	}
}
