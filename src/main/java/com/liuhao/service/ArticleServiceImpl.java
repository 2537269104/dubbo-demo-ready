package com.liuhao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuhao.dao.ArticleDao;
import com.liuhao.pojo.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> list(String condition) {
		// TODO Auto-generated method stub
		return articleDao.list(condition);
	}
}
