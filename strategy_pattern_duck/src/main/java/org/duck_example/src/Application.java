package org.duck_example.src;

import org.duck_example.src.controller.MiniDuckSimulator;
import org.duck_example.src.view.OutputView;

public class Application {
    public static void main(String[] args) {
        new MiniDuckSimulator(new OutputView()).run();
    }
}
