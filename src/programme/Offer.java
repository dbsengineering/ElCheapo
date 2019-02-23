package programme;

public class Offer {
	public double price;
	public VendorInter vendor;
	public ProductCategory category;

	/**
	 * 
	 * @param price
	 * @param vendor
	 * @param category
	 */
	public Offer(double price, VendorInter vendor, ProductCategory category) {
		this.price = price*category.getTVA();
		this.vendor = vendor;
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public VendorInter getVendor() {
		return vendor;
	}

	public void setVendor(VendorInter vendor) {
		this.vendor = vendor;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	
	
}
