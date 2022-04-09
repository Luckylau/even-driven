package com.luckylau.event.driven.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class PaymentStatusUpdateSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void updatePaymentStatus() {
        System.out.println("用户支付成功");
        // 通知观察者
        this.notifyObservers();
    }
}
