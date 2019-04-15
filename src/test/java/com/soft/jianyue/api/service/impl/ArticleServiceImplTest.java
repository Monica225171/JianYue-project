package com.soft.jianyue.api.service.impl;

import com.soft.jianyue.api.entity.Article;
import com.soft.jianyue.api.entity.Img;
import com.soft.jianyue.api.entity.vo.ArticleVO;
import com.soft.jianyue.api.mapper.ArticleMapper;
import com.soft.jianyue.api.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleService articleService;

    @Test
    public void selectAll() {
        /*List<ArticleVO> list = new ArrayList<>();
        list = articleMapper.selectAll();
        System.out.println(list);*/

        List<ArticleVO> articles = articleMapper.selectAll();
        for (ArticleVO articleVO : articles) {
            articleVO.setImgs(articleMapper.selectImgByaId(articleVO.getId()));
        }
        System.out.println(articles);
    }

    @Test
    public void getArticleById() {
        ArticleVO articleVO = articleMapper.getArticleById(1);
        List<Img> imgList;
        imgList = articleMapper.selectImgByaId(1);
        articleVO.setImgs(imgList);
        System.out.println(articleVO);
    }

    @Test
    public void selectImgByaId() {
        List<Img> list = new ArrayList<>();
        list = articleMapper.selectImgByaId(1);
        System.out.println(list);
    }
    @Test
    public void insertArticle(){
        Article article=new Article ();
        article.setuId ( 2 );
        article.setTitle ("刘少奇" );
        article.setContent ("刘少奇冤案");
        article.setCreateTime ( new Date (  ) );
        articleMapper.insertArticle ( article );
    }
    @Test
    public void selectByPage(){
        List<Article> articleList=articleService.selectByPage(2,3);
        articleList.forEach(article -> System.out.println(article.getId()+"\t"+article.getTitle()));
    }
}