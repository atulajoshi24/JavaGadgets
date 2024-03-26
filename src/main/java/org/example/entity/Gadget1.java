package org.example.entity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

public class Gadget1 implements Serializable {

    private String name;

    public Gadget1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gadget1{" +
                "name='" + name + '\'' +
                '}';
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        System.out.println("Triggering custom Deserialization Behaviour !!");
        this.name = this.name.toUpperCase();
        System.out.println("Customised Tile !! "+this.name);
        runCommand();
    }

    private void runCommand() throws IOException {
        Map<String, String> envMap = System.getenv();

        for (String envName : envMap.keySet()) {
            System.out.format("%s = %s%n", envName, envMap.get(envName));
        }
    }
}
