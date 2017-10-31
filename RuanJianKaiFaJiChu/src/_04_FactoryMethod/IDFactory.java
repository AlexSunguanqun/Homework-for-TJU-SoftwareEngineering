package _04_FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDFactory extends Factory{
	private List<String> owners = new ArrayList();
	@Override
	protected Product creatProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void signProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	

}
