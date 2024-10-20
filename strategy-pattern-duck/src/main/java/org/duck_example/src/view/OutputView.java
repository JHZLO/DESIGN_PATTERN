package org.duck_example.src.view;

import org.duck_example.src.domain.model.Duck;

public class OutputView {
    public void printDisplay(Duck duck) {
        System.out.println(duck.display());
    }

    public void printFly(Duck duck) {
        System.out.println(duck.fly());
    }

    public void printQuack(Duck duck) {
        System.out.println(duck.quack());
    }

    public void printSwim(Duck duck) {
        System.out.println(duck.swim());
    }

    public void printNewLine() {
        System.out.println();
    }
}
