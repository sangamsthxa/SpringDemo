package org.sangam.SpringDemo;

public class Alien {

    private int age;

    private String name;

    private Laptop laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alien() {
        System.out.println("Alien object created");
    }
    public void code(){
        System.out.println("I'm coding..");
    }
}
