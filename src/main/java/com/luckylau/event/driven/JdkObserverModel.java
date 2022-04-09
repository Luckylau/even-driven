package com.luckylau.event.driven;

import com.luckylau.event.driven.jdk.JdkEmailObserver;
import com.luckylau.event.driven.jdk.JdkPaymentStatusUpdateSubject;
import com.luckylau.event.driven.jdk.JdkSmsObserver;
import com.luckylau.event.driven.jdk.JdkStockObserver;

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
