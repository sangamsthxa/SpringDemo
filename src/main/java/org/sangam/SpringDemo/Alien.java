package org.sangam.SpringDemo;

public class Alien {

    private int age;

    private String name;

    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
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
        com.compile();
    }
}
