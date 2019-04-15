package com.soft.jianyue.api.service;

import com.soft.jianyue.api.entity.Article;
import com.soft.jianyue.api.entity.Img;
import com.soft.jianyue.api.entity.vo.ArticleVO;
import java.util.List;

public interface ArticleService {
    /*查询所有*/
    List<ArticleVO> selectAll();

    /*通过文章id查询文章信息*/
    ArticleVO getArticleById(int aId);

    List<Img> selectImgByaId(int aId);

    void insertArticle(Article article);
    /*通过uid查询所有的文章*/
    List<Article> selectByuId(int uId);
    List<Article> selectByPage(int currPage,int count);
}
