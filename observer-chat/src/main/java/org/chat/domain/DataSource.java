package org.chat.domain;

import java.util.ArrayList;
import org.chat.view.Display;

public class DataSource {
    ArrayList<Display> displays = new ArrayList<>();

    public void attach(Display display){
        displays.add(display);
    }

    public void detach(Display display){
        displays.remove(display);
    }

    public void myNotify(){
        for(Display myDisplay : displays){
            myDisplay.update();
        }
    }
}
