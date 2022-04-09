package com.luckylau.event.driven.spring;


import org.springframework.context.ApplicationEvent;

/**
 * @Author luckylau
 * @Date 2022/4/9
 */
public class PaymentStatusUpdateEvent extends ApplicationEvent {

    public PaymentStatusUpdateEvent(PaymentInfo source) {
        super(source);
    }
}
