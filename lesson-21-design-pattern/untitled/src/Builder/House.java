package Builder;

public class House {
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasProof;
    private String color;

    public House(int walls, int doors, boolean hasPool, boolean hasProof, String color) {
        this.walls = walls;
        this.doors = doors;
        this.hasPool = hasPool;
        this.hasProof = hasProof;
        this.color = color;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public boolean isHasProof() {
        return hasProof;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", hasPool=" + hasPool +
                ", hasProof=" + hasProof +
                ", color='" + color + '\'' +
                '}';
    }
}
