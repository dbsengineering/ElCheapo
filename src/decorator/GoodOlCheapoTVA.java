package decorator;

import java.util.Collection;
import java.util.Iterator;
import programme.ElCheapo;
import programme.Offer;
import programme.Product;
import programme.ProductInter;
import programme.VendorInter;
import programme.VendorsActive;

public class GoodOlCheapoTVA extends ElCheapoDecorator {
	

	private Collection<VendorInter> mVendors = VendorsActive.getVendors();
	
	public GoodOlCheapoTVA(ElCheapo composant) {
		super(composant);
	}
	
	protected Offer getBestOfferTVA(String productName) {
		
		Iterator<VendorInter> it = mVendors.iterator();
		Iterator<VendorInter> it2 = mVendors.iterator();
		it2.next();
		Offer offer = null;
		while(it.hasNext()) {
			VendorInter vendor = it.next();
			double price = vendor.getPrice(productName);
			while(it2.hasNext()) {
				VendorInter vend2 = it2.next();
				double price2 = vend2.getPrice(productName);
				if(price >= price2) {
					price = vend2.getPrice(productName);
					ProductInter prod = vend2.getProduct(productName);
					//System.out.println(price);
					offer = new Offer(price, vendor, ((Product)prod).getCategory());
				}
			}
		}
		return offer;
	}
	
	@Override
	public Offer getBestOffer(String productName) {
		super.getBestOffer(productName);
		return this.getBestOfferTVA(productName);
	}
}
