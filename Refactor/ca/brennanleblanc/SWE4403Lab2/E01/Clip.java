package ca.brennanleblanc.SWE4403Lab2.E01;

public class Clip implements Component{

    public Clip clone() {
        return new Clip();
    }

    @Override
    public String toString() {
        return "Clip []";
    }
}
