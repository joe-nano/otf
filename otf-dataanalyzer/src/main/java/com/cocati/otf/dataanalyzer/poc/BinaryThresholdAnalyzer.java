package com.cocati.otf.dataanalyzer.poc;

import com.cocati.otf.core.jms.analyzers.AbstractBaseAnalyzer;
import com.cocati.otf.core.jms.models.StockInfo;
import com.cocati.otf.core.jms.models.StockReport;

import javax.ejb.MessageDriven;
import java.util.logging.Logger;

/**
 * Created by marcin on 06.03.17.
 */
@MessageDriven(mappedName = "jms/OTFDataSourceConnectionFactory")
public class BinaryThresholdAnalyzer extends AbstractBaseAnalyzer {

    protected Double threshold = 5.0;

    public void analyze(StockReport stockReport) {

        for(StockInfo info : stockReport.getStockInfos()) {
            if(info.getPrice() >= threshold) {
                Logger.getLogger(getClass().getName()).info("Buying " + info.getName() + " at " + info.getPrice());
            }
        }

    }
}
