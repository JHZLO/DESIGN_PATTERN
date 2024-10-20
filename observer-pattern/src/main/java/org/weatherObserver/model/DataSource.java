package org.weatherObserver.model;

import java.util.ArrayList;
import org.weatherObserver.view.Display;

public class DataSource {
    ArrayList<Display> displays = new ArrayList<Display>();

    public void addDisplay(Display display){
        displays.add(display);
    }

    public void detachDisplay(Display display){
        displays.remove(display);
    }

    public void myNotify(){
        for(Display myDisplay : displays){
            myDisplay.updateDisplay();
        }
    }
}
