package ny;

public class Jellybean extends Sweets {
    private String flavor;

    public Jellybean(String name, Double weight, Double price, String flavor) {
        super(name, weight, price);
        this.flavor=flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", flavor: " + flavor + "]";
    }
}
