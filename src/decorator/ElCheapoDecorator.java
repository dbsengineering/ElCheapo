package decorator;

import programme.ElCheapo;
import programme.Offer;

public abstract class ElCheapoDecorator {
	
	protected ElCheapo composant;
	
	public ElCheapoDecorator(ElCheapo composant) { 
	    this.composant = composant; 
	}
	
	public Offer getBestOffer(String productName) {
		return composant.getBestOffer(productName);
	}

}
