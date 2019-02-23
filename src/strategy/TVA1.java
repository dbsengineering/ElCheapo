package strategy;

import programme.ProductCategory;

public class TVA1 implements ChoixTVA {
	
	private ProductCategory category;

	@Override
	public void configure(ProductCategory category) {
		this.category = category;
	}

	@Override
	public void execute() {
		this.category.setTVA(1.15);
	}
}
