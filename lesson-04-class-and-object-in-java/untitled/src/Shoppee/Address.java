package Shoppee;

public class Address {
    String street;
    int number;
    String ward;
    String district;

    public Address(){
        this.street = street;
        this.number = number;
        this.ward = ward;
        this.district = district;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getStreet() {
        return this.street;
    }

    public String getWard() {
        return this.ward;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
}
