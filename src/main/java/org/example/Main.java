package org.example;

import org.example.entity.Gadget1;
import org.example.entity.Gadget2;
import org.example.entity.Gadget3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Gadget1 gadget1 = new Gadget1("Gadget1");
        Gadget2 gadget2 = new Gadget2(gadget1, "Gadget2");
        Gadget3 gadget3 = new Gadget3(gadget2, "Gadget3");

        Serialiser serialiser = new Serialiser();
        serialiser.serializeGadget3(gadget3);

        gadget3 = serialiser.deSerializeGadget3("gadget3.ser");
        System.out.println("Gadget3 --> "+gadget3);


    }
}