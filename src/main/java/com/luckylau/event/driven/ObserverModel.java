package com.luckylau.event.driven;

import com.luckylau.event.driven.service.impl.EmailObserver;
import com.luckylau.event.driven.service.impl.PaymentStatusUpdateSubject;
import com.luckylau.event.driven.service.impl.SmsObserver;
import com.luckylau.event.driven.service.impl.StockObserver;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class ObserverModel {
    public static void main(String[] args) {
        PaymentStatusUpdateSubject subject = new PaymentStatusUpdateSubject();
        subject.addObserver(new EmailObserver());
        subject.addObserver(new SmsObserver());
        subject.addObserver(new StockObserver());
        subject.updatePaymentStatus();
    }
}
