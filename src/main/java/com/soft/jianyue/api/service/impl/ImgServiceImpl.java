package com.soft.jianyue.api.service.impl;

import com.soft.jianyue.api.entity.Img;
import com.soft.jianyue.api.mapper.ImgMapper;
import com.soft.jianyue.api.service.ImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImgServiceImpl implements ImgService {
    @Resource
    private ImgMapper imgMapper;

    @Override
    public List<Img> selectImgsByaId(int aId) {
        return imgMapper.selectImgsByaId(1);
    }

    @Override
    public void insertImg(Img img) {
        imgMapper.insertImg ( img );
    }
}