package org.src;

public class CubeFactory {
    private static BoxObjectAdapter instance;

    private CubeFactory() {}

    public static synchronized BoxObjectAdapter getInstance(Box box) {
        if (instance == null) {
            instance = new BoxObjectAdapter(box);
        }
        return instance;
    }
}
