package org.src;

public class BoxClassAdapter extends Box implements Hexahedron {
    private static final double INCH_TO_CM_CONVERSION = 2.54;

    @Override
    public int getWidthCm() {
        return convertToCm(getWidth());
    }

    @Override
    public int getHeightCm() {
        return convertToCm(getHeight());
    }

    @Override
    public int getLengthCm() {
        return convertToCm(getLength());
    }

    @Override
    public int getVolume() {
        return getWidthCm() * getHeightCm() * getLengthCm();
    }

    private int convertToCm(int inchValue) {
        return (int) Math.round(inchValue * INCH_TO_CM_CONVERSION);
    }
}
