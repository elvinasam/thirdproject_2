package ny;

public class Chocolate extends Sweets{
    private String consistency;

    public Chocolate(String name, Double weight, Double price, String consistency) {
        super(name, weight, price);
        this.consistency=consistency;
    }

    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", consistency: " + consistency+ "]";
    }
}
