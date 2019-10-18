package Day1_solid.solid.oc.good;

public class Food extends Product {

    @Override
    public double calculateTaxIncludedPrice() {
        return getBasePrice() * 1.08;
    }

}
