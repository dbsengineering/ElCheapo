package strategy;

import programme.ProductCategory;

public class TVA2 implements ChoixTVA{
	
	private ProductCategory category;

	@Override
	public void execute() {
		this.category.setTVA(1.196);
	}

	@Override
	public void configure(ProductCategory category) {
		this.category = category;
	}
}
