package programme;

import strategy.ChoixTVA;

public interface ProductCategory {
	
	public String getName();
	public void setName(String name);
	public double getTVA();
	public void setTVA(double tva);
	public void setStrategyTVA(ChoixTVA choixTVA);
}
