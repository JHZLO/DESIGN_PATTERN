package org.src;

public class Controller {
    public void run(){
        Box box = new Box();

        BoxClassAdapter hexahedron = HexahedronFactory.getInstance();

        System.out.println("Hexahedron Width (cm): " + hexahedron.getWidthCm() + "cm");
        System.out.println("Hexahedron Height (cm): " + hexahedron.getHeightCm() + "cm");
        System.out.println("Hexahedron Length (cm): " + hexahedron.getLengthCm() + "cm");
        System.out.println("Hexahedron Volume (cm³): " + hexahedron.getVolume() + "cm³");

        System.out.println();

        BoxObjectAdapter cube = CubeFactory.getInstance(box);

        System.out.println("Cube Height (cm): " + cube.getHeightCm() + "cm");
        System.out.println("Cube Volume (cm³): " + cube.getVolume() + "cm³");
    }
}
