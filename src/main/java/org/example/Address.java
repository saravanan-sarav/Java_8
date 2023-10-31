package org.example;

public class Address {
    private String block, city, state, country;
    private  int pincode;

    public Address(String block, String city, String state, String country, int pincode) {
        this.block = block;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}
