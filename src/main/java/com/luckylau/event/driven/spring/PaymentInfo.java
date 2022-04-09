package com.luckylau.event.driven.spring;

/**
 * @Author luckylau
 * @Date 2022/3/12
 */
public class PaymentInfo {
    private int id;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
