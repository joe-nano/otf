package com.cocati.otf.core.jms.providers;

import com.cocati.otf.core.jms.models.StockReport;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Message;
import javax.jms.Topic;

/**
 * Created by marcin on 06.03.17.
 */
public abstract class AbstractBaseDataProvider implements DataProvider {

    @Resource(mappedName = "jms/OTFDataProviderTopic")
    protected Topic dataProviderTopic;

    @Inject
    @JMSConnectionFactory("jms/OTFDataSourceConnectionFactory")
    protected JMSContext context;

    public void sendStockReport(StockReport stockReport) {
        Message message = context.createObjectMessage(stockReport);
        context.createProducer().send(dataProviderTopic, message);
    }
}
