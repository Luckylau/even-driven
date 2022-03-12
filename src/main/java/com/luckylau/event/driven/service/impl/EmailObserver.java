package com.luckylau.event.driven.service.impl;

import com.luckylau.event.driven.service.Observer;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class EmailObserver implements Observer {
    @Override
    public void update() {
        System.out.println("邮件服务收到通知.");
    }
}
