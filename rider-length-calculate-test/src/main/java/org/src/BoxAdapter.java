package org.src;

public class BoxAdapter implements Hexahedron {
    private static final double INCH_TO_CM = 2.54;
    private final Box box;

    public BoxAdapter(Box box) {
        this.box = box;
    }

    @Override
    public int getWidthCm() {
        return convertToCm(box.getWidth());
    }

    @Override
    public int getHeightCm() {
        return convertToCm(box.getHeight());
    }

    @Override
    public int getLengthCm() {
        return convertToCm(box.getLength());
    }

    @Override
    public int volume() {
        return getWidthCm() * getHeightCm() * getLengthCm();
    }

    private int convertToCm(int inchValue) {
        return (int) Math.round(inchValue * INCH_TO_CM);
    }
}
