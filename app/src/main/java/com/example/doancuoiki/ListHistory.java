package com.example.doancuoiki;

public class ListHistory {
    private String status;
    private String date;
    private String price;

    public ListHistory(String status, String date, String price) {
        this.status = status;
        this.date = date;
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
