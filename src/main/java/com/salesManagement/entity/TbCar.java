package com.salesManagement.entity;


import java.util.Date;

public class TbCar {
    //车的id
    private Integer id;
    //车的型号
    private String model;
    //颜色
    private String color;
    //价格
    private double price;
    //销量
    private Integer stock;
    //产地
    private String place;
    //状态
    private Integer status;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

    public TbCar() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "TbCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", price=" + price +
                ", stock=" + stock +
                ", place='" + place + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
