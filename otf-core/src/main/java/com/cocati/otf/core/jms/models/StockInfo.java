package com.cocati.otf.core.jms.models;

import java.io.Serializable;

/**
 * Created by marcin on 06.03.17.
 */
public class StockInfo implements Serializable {

    private String name;
    private Double price;

    public StockInfo(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
