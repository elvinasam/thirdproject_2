package ny;

public class Candy extends Sweets{
    private String sort;

    public Candy(String name, Double weight, Double price, String sort) {
        super(name, weight, price);
        this.sort=sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", sort: " + sort + "]";
    }
}
