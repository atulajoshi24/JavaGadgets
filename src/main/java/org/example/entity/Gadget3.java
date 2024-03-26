package org.example.entity;

import java.io.Serializable;

public class Gadget3 implements Serializable {

    private Gadget2 gadget2;
    private String name;

    public Gadget3(Gadget2 gadget2, String name) {
        this.gadget2 = gadget2;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gadget3{" +
                "gadget2=" + gadget2 +
                ", name='" + name + '\'' +
                '}';
    }


}
