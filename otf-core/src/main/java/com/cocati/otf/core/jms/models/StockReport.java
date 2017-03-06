package com.cocati.otf.core.jms.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by marcin on 06.03.17.
 */
public class StockReport implements Serializable {

    private Set<StockInfo> stockInfos = new HashSet<>();

    public Set<StockInfo> getStockInfos() {
        return stockInfos;
    }

    public void setStockInfos(Set<StockInfo> stockInfos) {
        this.stockInfos = stockInfos;
    }
}
