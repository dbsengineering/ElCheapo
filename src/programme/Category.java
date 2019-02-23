package programme;

import strategy.ChoixTVA;
import strategy.TVA1;

public class Category implements ProductCategory{
	
	private String mName;
	private double tva;
	
	public Category(String name) {
		this.mName = name;
	}

	@Override
	public String getName() {
		return this.mName;
	}

	@Override
	public void setName(String name) {
		this.mName = name;
	}
	
	public double getTVA() {
		return this.tva;
	}

	@Override
	public void setStrategyTVA(ChoixTVA choixTVA) {
	    choixTVA.configure(this);
	    choixTVA.execute();
	}

	@Override
	public void setTVA(double tva) {
		this.tva = tva;
	}
}
