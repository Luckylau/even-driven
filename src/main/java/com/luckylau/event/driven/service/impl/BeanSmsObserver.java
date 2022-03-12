package com.luckylau.event.driven.service.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class BeanSmsObserver implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("短信服务收到通知: " + evt.toString());
    }
}
