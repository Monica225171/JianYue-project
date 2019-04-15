package com.soft.jianyue.api.entity;


import lombok.Data;

@Data
public class Img {
    private Integer id;
    private Integer aId;
    private String imgs;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

}
