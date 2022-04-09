package com.luckylau.event.driven.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @Author luckylau
 * @Date 2022/4/9
 */
@Service
public class SpringPaymentStatusUpdateSubject {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void updatePaymentStatus() {
        System.out.println("用户支付成功");
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setStatus("ok");
        paymentInfo.setId(1);
        publisher.publishEvent(new PaymentStatusUpdateEvent(paymentInfo));
    }

}
