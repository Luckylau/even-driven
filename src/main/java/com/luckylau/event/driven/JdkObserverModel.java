package com.luckylau.event.driven;

import com.luckylau.event.driven.service.impl.JdkEmailObserver;
import com.luckylau.event.driven.service.impl.JdkPaymentStatusUpdateSubject;
import com.luckylau.event.driven.service.impl.JdkSmsObserver;
import com.luckylau.event.driven.service.impl.JdkStockObserver;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class JdkObserverModel {
    public static void main(String[] args) {
        JdkPaymentStatusUpdateSubject subject = new JdkPaymentStatusUpdateSubject();
        subject.addObserver(new JdkEmailObserver());
        subject.addObserver(new JdkSmsObserver());
        subject.addObserver(new JdkStockObserver());
        subject.updatePaymentStatus();

    }

}
