package org.src;

public class HexahedronFactory {
    private static BoxClassAdapter instance;

    private HexahedronFactory() {}

    public static synchronized BoxClassAdapter getInstance() {
        if (instance == null) {
            instance = new BoxClassAdapter();
        }
        return instance;
    }
}
