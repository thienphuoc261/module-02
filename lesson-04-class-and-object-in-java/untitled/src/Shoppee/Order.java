package Shoppee;

import java.util.Date;
public class Order {
    int id;
    boolean status;
    int totalPrice;
    Address address;
    String receiver;
    Date date;

    public Order(int id, boolean status, int totalPrice, Address address, String receiver, Date date) {
        this.id = id;
        this.status = status;
        this.totalPrice = totalPrice;
        this.address = address;
        this.receiver = receiver;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
