package com.cocati.otf.core.jms.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by marcin on 06.03.17.
 */
public class SellBuyDecision implements Serializable {

    private Map<StockReport, Boolean> decisions = new HashMap<>();

    public Map<StockReport, Boolean> getDecisions() {
        return decisions;
    }

    public void setDecisions(Map<StockReport, Boolean> decisions) {
        this.decisions = decisions;
    }
}
