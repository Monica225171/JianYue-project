package com.soft.jianyue.api.service.impl;

import com.soft.jianyue.api.entity.Img;
import com.soft.jianyue.api.service.ImgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImgServiceImplTest {
    @Resource
    private ImgService imgService;

    @Test
    public void selectImgsByAId() {
        List<Img> imgs =new ArrayList<>();
        imgs =imgService.selectImgsByaId(1);
        System.out.println(imgs);
    }
    @Test
    public void insertImg(){
        Img img=new Img ();
        img.setaId ( 1 );
        img.setImgs ( "img7.JPG" );
        imgService.insertImg ( img );
    }
}