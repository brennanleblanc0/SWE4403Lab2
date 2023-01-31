package ca.brennanleblanc.SWE4403Lab2.E01;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public String toString() {
        return "Timeline [component=" + components + "]";
    }

}
