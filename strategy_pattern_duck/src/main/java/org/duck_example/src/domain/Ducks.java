package org.duck_example.src.domain;

import java.util.ArrayList;
import java.util.List;
import org.duck_example.src.domain.model.Duck;

public class Ducks {
    private final List<Duck> ducks;

    public Ducks(){
        this.ducks = new ArrayList<>();
    }
    public void addDuck(final Duck duck){
        ducks.add(duck);
    }

    public List<Duck> getDucks(){
        return ducks;
    }
}
