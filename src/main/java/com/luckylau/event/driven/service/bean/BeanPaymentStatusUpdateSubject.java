package com.luckylau.event.driven.service.bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class BeanPaymentStatusUpdateSubject {
    PropertyChangeSupport observers = new PropertyChangeSupport(this);

    public void updatePaymentStatus() {
        System.out.println("用户支付成功");
        observers.firePropertyChange(new PropertyChangeEvent(this, "status", 0, 1));
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        observers.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        observers.addPropertyChangeListener(listener);
    }

}
