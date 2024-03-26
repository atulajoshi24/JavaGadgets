package org.example.entity;

import java.io.Serializable;

public class Gadget2 implements Serializable {

    private Gadget1 gadget1;
    private String name;

    public Gadget2(Gadget1 gadget1, String name) {
        this.gadget1 = gadget1;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gadget2{" +
                "gadget1=" + gadget1 +
                ", name='" + name + '\'' +
                '}';
    }
}
