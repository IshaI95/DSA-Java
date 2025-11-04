package Streams.CustomObjects;

import java.util.*;
public class Order {

    private int id;
    private Status status;
    private List<String> productName;

    public Order(int id, List<String> productName, Status status) {
        this.id = id;
        this.productName = productName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getProductName() {
        return productName;
    }

    public void setProductName(List<String> productName) {
        this.productName = productName;
    }

    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items=" + productName +
                ", status=" + status +
                '}';
    }
}
