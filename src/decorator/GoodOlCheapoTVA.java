package decorator;

import programme.ElCheapo;
import programme.Offer;

public class GoodOlCheapoTVA extends ElCheapoDecorator {

	public GoodOlCheapoTVA(ElCheapo composant) {
		super(composant);
	}
	
	protected Offer getBestOfferTVA(String productName) {
		//Offer offer = new Offer(double price, Vendor vendor, ProductCategory category);
		return this.getBestOffer(productName);
	}
	
	@Override
	public Offer getBestOffer(String productName) {
		super.getBestOffer(productName);
		return this.getBestOfferTVA(productName);
	}
}
