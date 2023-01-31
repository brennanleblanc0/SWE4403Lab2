package ca.brennanleblanc.SWE4403Lab2.E01;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        timeline.add(component.clone());
    }

}
