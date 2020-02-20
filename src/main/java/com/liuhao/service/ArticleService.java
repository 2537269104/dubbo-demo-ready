package com.liuhao.service;

import java.util.List;

import com.liuhao.pojo.Article;

public interface ArticleService {

	List<Article> list(String condition);

}
