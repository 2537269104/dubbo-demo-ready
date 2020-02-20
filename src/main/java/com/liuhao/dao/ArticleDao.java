package com.liuhao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuhao.pojo.Article;

public interface ArticleDao {

	
	List<Article> list(@Param("condition")String condition);

}
