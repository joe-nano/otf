package com.cocati.otf.core.jms.providers;

import com.cocati.otf.core.jms.models.StockReport;

/**
 * Created by marcin on 06.03.17.
 */
public interface DataProvider {

    void sendStockReport(StockReport stockReport);

}
