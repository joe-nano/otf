package com.cocati.otf.dataprovider.poc;

import com.cocati.otf.core.jms.models.StockInfo;
import com.cocati.otf.core.jms.models.StockReport;
import com.cocati.otf.core.jms.providers.AbstractBaseDataProvider;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 * Created by marcin on 06.03.17.
 */
@Stateless
public class BossaProvider extends AbstractBaseDataProvider {

    @Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)
    public void generateData() {
        StockReport report = new StockReport();
        for(int i = 0 ; i < 20 ; ++i) {
            StockInfo info = new StockInfo("stock" + i, Math.random() * 100 * i);
            report.getStockInfos().add(info);
        }
        sendStockReport(report);
    }

}
