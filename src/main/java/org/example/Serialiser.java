package org.example;

import org.example.entity.Gadget3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialiser {

    public void serializeGadget3(Gadget3 gadget3) throws IOException {
        try(FileOutputStream fos = new FileOutputStream("gadget3.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(gadget3);
        }

    }

    public Gadget3 deSerializeGadget3(String fileName) throws IOException, ClassNotFoundException {
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            return (Gadget3) ois.readObject();
        }
    }
}
