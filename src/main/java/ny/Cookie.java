package ny;

public class Cookie extends Sweets{
    private String filling;

    public Cookie(String name, Double weight, Double price, String filling) {
        super(name, weight, price);
        this.filling=filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Cookie [" + super.toString() + ", filling: " + filling + "]";
    }
}
