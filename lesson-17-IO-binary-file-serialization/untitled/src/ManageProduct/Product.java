package ManageProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {
    private int id;
    private String name;
    private int price;
    private String manufacturer;
    private String discription;

    public Product(int id, String name, int price, String manufacturer, String discription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", price =" + price +
                ", manufacturer ='" + manufacturer + '\'' +
                ", discription ='" + discription + '\'' +
                '}';
    }

    public static void writeDataToFile(String file, List<Product> products){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Gạo",15000,"Việt Nam","Lương thực"));
        products.add(new Product(2,"Thịt gà", 70000,"Việt Nam", "Thực phẩm"));
        products.add(new Product(3,"Gối", 150000,"Hàn Quốc", "Đồ dùng"));
        writeDataToFile("src/text.txt",products);

        List<Product> productList = new ArrayList<>();
        productList = (List<Product>) readDataFromFile("src/text.txt");
        for (Product product:productList) {
            System.out.println(product);
        }
    }
}
