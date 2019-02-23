package programme;

import java.util.Collection;
import java.util.Iterator;

public class GoodOlCheapo implements ElCheapo {
	
	private Collection<VendorInter> mVendors = Vendors.getVendors();
	
	@Override
	public Offer getBestOffer(String productName) {
	
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
					offer = new Offer(price, vendor, ((Product)prod).getCategory());
				}
			}
		}
		return offer;
	}
}
