package staticProperty;

public class Car {
    private String name;
    private String engine;
    public static int count;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }
}
