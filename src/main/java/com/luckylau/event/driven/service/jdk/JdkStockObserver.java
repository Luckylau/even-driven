package com.luckylau.event.driven.service.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class JdkStockObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("库存服务收到通知.");
    }
}
