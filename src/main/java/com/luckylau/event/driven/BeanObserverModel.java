package com.luckylau.event.driven;

import com.luckylau.event.driven.service.impl.BeanEmailObserver;
import com.luckylau.event.driven.service.impl.BeanPaymentStatusUpdateSubject;
import com.luckylau.event.driven.service.impl.BeanSmsObserver;
import com.luckylau.event.driven.service.impl.BeanStockObserver;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class BeanObserverModel {
    public static void main(String[] args) {
        BeanPaymentStatusUpdateSubject subject = new BeanPaymentStatusUpdateSubject();
        subject.addPropertyChangeListener(new BeanEmailObserver());
        subject.addPropertyChangeListener(new BeanSmsObserver());
        subject.addPropertyChangeListener(new BeanStockObserver());
        subject.updatePaymentStatus();
    }
}
