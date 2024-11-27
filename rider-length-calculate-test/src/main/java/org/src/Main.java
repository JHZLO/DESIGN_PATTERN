package org.src;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        BoxObjectAdapter cube = CubeFactory.getInstance(box);

        System.out.println("Cube 1 Height (cm): " + cube.getHeightCm() + "cm");
        System.out.println("Cube 1 Volume (cm³): " + cube.getVolume() + "cm³");

        
    }
}
