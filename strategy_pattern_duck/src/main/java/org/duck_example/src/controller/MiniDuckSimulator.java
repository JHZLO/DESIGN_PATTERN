package org.duck_example.src.controller;

import org.duck_example.src.domain.Ducks;
import org.duck_example.src.domain.model.Duck;
import org.duck_example.src.domain.model.MallardDuck;
import org.duck_example.src.domain.model.RedHeadDuck;
import org.duck_example.src.domain.model.DecoyDuck;
import org.duck_example.src.domain.model.RubberDuck;
import org.duck_example.src.view.OutputView;

public class MiniDuckSimulator {
    private final OutputView outputView;

    public MiniDuckSimulator(OutputView outputView) {
        this.outputView = outputView;
    }

    public void run() {
        Ducks ducks = new Ducks();
        createDuck(ducks);
        printDuckStatus(ducks);
    }

    private void createDuck(Ducks ducks) {
        ducks.addDuck(new MallardDuck());
        ducks.addDuck(new RedHeadDuck());
        ducks.addDuck(new DecoyDuck());
        ducks.addDuck(new RubberDuck());
    }

    private void printDuckStatus(Ducks ducks) {
        for (final Duck duck : ducks.getDucks()) {
            outputView.printDisplay(duck);
            outputView.printFly(duck);
            outputView.printQuack(duck);
            outputView.printSwim(duck);
            outputView.printNewLine();
        }
    }
}
