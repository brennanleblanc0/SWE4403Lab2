package ca.brennanleblanc.SWE4403Lab2.E01;

public class Audio implements Component{

    @Override
    public Component clone() {
        return new Audio();
    }

    @Override
    public String toString() {
        return "Audio []";
    }
}
