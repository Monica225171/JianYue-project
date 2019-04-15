package com.soft.jianyue.api.mapper;

import com.soft.jianyue.api.entity.Img;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ImgMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "aId", column = "a_Id"),
            @Result(property = "imgs", column="img_url")
    })
    @Select("SELECT * FROM t_img WHERE a_id=#{aId}")
    List<Img> selectImgsByaId(int aId);
    @Insert("INSERT INTO t_img(a_id,img_url) VALUES (#{aId},#{imgs})")
    void insertImg(Img img);
}