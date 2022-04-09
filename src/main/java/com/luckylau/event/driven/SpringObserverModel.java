package com.luckylau.event.driven;

import com.luckylau.event.driven.spring.SpringPaymentStatusUpdateSubject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author luckylau
 * @Date 2022/4/9
 */
public class SpringObserverModel {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.luckylau.event.driven");
        SpringPaymentStatusUpdateSubject springPaymentStatusUpdateSubject = applicationContext.getBean(SpringPaymentStatusUpdateSubject.class);
        springPaymentStatusUpdateSubject.updatePaymentStatus();
    }
}
