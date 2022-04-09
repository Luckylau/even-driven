package com.luckylau.event.driven.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author luckylau
 * @Date 2022/4/9
 */
@Component
public class SpringSmsObserver implements SmartApplicationListener {
    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == PaymentInfo.class;
    }

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == PaymentStatusUpdateEvent.class;
    }

    @Async
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("短信服务收到通知. " + applicationEvent + " - thread: " + Thread.currentThread().getName());
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
