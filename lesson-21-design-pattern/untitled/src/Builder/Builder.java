package Builder;

public interface Builder {
    public Builder buildProof(boolean hasProof);
    public Builder buildPool(boolean hasPool);
    public Builder buildWalls(int walls);

    public Builder builDoors(int doors);
    public Builder buildColors(String color);
    public House build();
}
