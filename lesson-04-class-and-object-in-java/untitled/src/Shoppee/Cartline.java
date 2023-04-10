package Shoppee;

public class Cartline {
    int id;
    int product_id;
    int quantity;
    int totalPrice;

    public Cartline(int id, int product_id, int quantity, int totalPrice){
        this.id = id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return this.product_id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
