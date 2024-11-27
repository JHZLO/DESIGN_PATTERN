package org.src;
public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Hexahedron hexahedron = new BoxClassAdapter(box);

        System.out.println("Volume: " + hexahedron.volume());
    }
}
