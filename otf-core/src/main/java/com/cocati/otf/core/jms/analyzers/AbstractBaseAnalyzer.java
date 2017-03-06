package com.cocati.otf.core.jms.analyzers;

import com.cocati.otf.core.jms.models.StockReport;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * Created by marcin on 06.03.17.
 */
public abstract class AbstractBaseAnalyzer implements DataAnalyzer, MessageListener {

    public void onMessage(Message message) {
        ObjectMessage objectMessage = (ObjectMessage) message;
        try {
            StockReport report = objectMessage.getBody(StockReport.class);
            analyze(report);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
