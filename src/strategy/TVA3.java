package strategy;

import programme.ProductCategory;

public class TVA3 implements ChoixTVA {

	private ProductCategory category;

	@Override
	public void execute() {
		this.category.setTVA(1.20);
	}

	@Override
	public void configure(ProductCategory category) {
		this.category = category;
	}
}
