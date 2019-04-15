package com.soft.jianyue.api.service;

import com.soft.jianyue.api.entity.Img;

import java.util.List;

public interface ImgService {
    List<Img> selectImgsByaId(int aId);
    void insertImg(Img img);
}
