package com.example.demo.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Date;

/**
 * Created by Administrator on 2019/9/13.
 */
public class Tanimal {

    private Integer id;
    private String name;
    private Date datea;
    private Integer categoryId;
    private Integer distributionId;

    @Override
    public String toString() {
        return "Tanimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datea=" + datea +
                ", categoryId=" + categoryId +
                ", distributionId=" + distributionId +
                '}';
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatea() {
        return datea;
    }

    public void setDatea(Date datea) {
        this.datea = datea;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Integer distributionId) {
        this.distributionId = distributionId;
    }








}
