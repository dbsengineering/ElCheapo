package programme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Vendor implements VendorInter {
	
	private String mName;
	private Set<ProductInter> mLstProducts;
	
	public Vendor(String name) {
		this.mLstProducts = new HashSet<ProductInter>();
		this.mName = name;
	}

	@Override
	public double getPrice(String productName) {
		Iterator<ProductInter> it = this.mLstProducts.iterator();
		while(it.hasNext()) {
			ProductInter prod = it.next();
			if(((Product)prod).getName().equals(productName)) {
				return ((Product)prod).getPrice();
			}
		}
		return 0.0;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Set<ProductInter> getmLstProducts() {
		return mLstProducts;
	}

	public void setmLstProducts(Set<ProductInter> mLstProducts) {
		this.mLstProducts = mLstProducts;
	}

	public void addProduct(ProductInter product) {
		this.mLstProducts.add(product);
	}

	@Override
	public ProductInter getProduct(String productName) {
		Iterator<ProductInter> it = this.mLstProducts.iterator();
		while(it.hasNext()) {
			ProductInter prod = it.next();
			if(((Product)prod).getName().equals(productName)){
				return prod;
			}
		}
		return null;
	}
}
