package main.products;

public enum Tax {

    VAT8(0.08),VAT23(0.23),VAT5(0.05),NO_VAT(0);

    Tax(double value) {
        this.value = value;
    }

    private double value ;

    @Override
    public String toString() {
        return "Tax with value: "+value;
    }

    public double getValue() {
        return value;
    }
}