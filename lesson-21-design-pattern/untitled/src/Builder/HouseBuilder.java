package Builder;

public class HouseBuilder implements Builder{
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasProof;
    private String color;

    public HouseBuilder() {
    }

    @Override
    public Builder buildProof(boolean hasProof) {
        this.hasProof = hasProof;
        return this;
    }

    @Override
    public Builder buildPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    @Override
    public Builder buildWalls(int walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public Builder builDoors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public Builder buildColors(String color) {
        this.color = color;
        return this;
    }

    @Override
    public House build() {
        return new House(walls,doors,hasPool,hasProof,color);
    }
}
