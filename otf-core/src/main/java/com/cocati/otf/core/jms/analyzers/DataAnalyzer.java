package com.cocati.otf.core.jms.analyzers;

import com.cocati.otf.core.jms.models.StockReport;

/**
 * Created by marcin on 06.03.17.
 */
public interface DataAnalyzer {

    void analyze(StockReport stockReport);

}
