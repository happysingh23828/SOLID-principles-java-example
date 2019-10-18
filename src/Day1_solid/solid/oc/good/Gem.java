package Day1_solid.solid.oc.good;

public class Gem extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		return getBasePrice();
	}

}
