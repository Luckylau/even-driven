package com.luckylau.event.driven.service.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class JdkSmsObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("短信服务收到通知.");
    }
}
