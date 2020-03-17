package com.soft1851.spring.ioc.entity;

/**
 * @Author: zw_w
 * @Date: 2020/3/17 9:52
 * @Description:
 */
public class Phone {
    private double price;
    private String name;

    public Phone() {
    }

    public Phone(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
