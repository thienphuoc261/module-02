package Shoppee;

public class Category {
    int id;
    String name;
    String image;

    public Category(int id, String name, String image){
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
