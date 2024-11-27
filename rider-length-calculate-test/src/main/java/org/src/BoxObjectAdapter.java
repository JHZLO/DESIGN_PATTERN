package org.src;

public class BoxObjectAdapter implements Cube{
    private final Box box;

    public BoxObjectAdapter(Box box){
        this.box = box;
    }

    @Override
    public int getHeightCm(){
        return box.getHeight();
    }

    @Override
    public int getVolume(){
        int len = getHeightCm();
        return len * len * len;
    }
}
