package ca.brennanleblanc.SWE4403Lab2.E01;

public class Clip implements Component{

    @Override
    public Component clone() {
        return new Clip();
    }

    @Override
    public String toString() {
        return "Clip []";
    }
}
