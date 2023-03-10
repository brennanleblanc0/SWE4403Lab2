package ca.brennanleblanc.SWE4403Lab2.E01;

public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hello");
        Clip clip = new Clip();
        Audio audio = new Audio();

        System.out.println("Duplicating Text");
        timeline.add(text);
        System.out.println("Duplicating Clip");
        timeline.add(clip);
        System.out.println("Duplicating Audio");
        timeline.add(audio);

        ContextMenu menu = new ContextMenu(timeline);
        menu.duplicate(text);
        menu.duplicate(clip);
        menu.duplicate(audio);

        System.out.println(timeline);

    }
}
