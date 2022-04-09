package com.luckylau.event.driven.service.jdk;

import java.util.Observable;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class JdkPaymentStatusUpdateSubject extends Observable {

    public void updatePaymentStatus() {
        System.out.println("用户支付成功");
        // 需要调用一下表示被观察者状态变更
        this.setChanged();
        this.notifyObservers();
    }
}
