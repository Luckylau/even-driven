package com.luckylau.event.driven.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class JdkEmailObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("邮件服务收到通知.");
    }
}
