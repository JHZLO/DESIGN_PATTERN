package org.example.observer;

import org.example.subject.Display;

public class Observer {
    private Display display;

    public void addAttach(Display display) {
        this.display = display;
    }

    public void myNotify() {
        display.update();
    }
}
