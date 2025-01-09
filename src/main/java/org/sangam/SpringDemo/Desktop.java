package org.sangam.SpringDemo;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Code compiled in desktop");
    }
}
