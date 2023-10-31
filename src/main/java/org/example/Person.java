package org.example;

import java.util.List;
import java.util.Optional;

public class Person {
    private  String name,gender;

    private int height, kids;

    private double salary;

    private List<String> hobbies;

    private Optional<Address> address;

    public Person(String name, String gender, int height, int kids, double salary, List<String> hobbies) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.kids = kids;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public void setAddress(Optional<Address> address) {
        this.address = address;
    }
}
