package strategy;

import programme.ProductCategory;

public interface ChoixTVA {
	
	public void configure(ProductCategory category);
	public void execute();

}
