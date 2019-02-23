package programme;

public class Product implements ProductInter {
	
	private String mName;
	private double mPrice;
	private ProductCategory mCategory;
	
	public Product(String name, double price, ProductCategory category) {
		this.mName = name;
		this.mPrice = price;
		this.mCategory = category;
	}

	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public double getPrice() {
		return mPrice;
	}

	public void setPrice(double mPrice) {
		this.mPrice = mPrice;
	}

	public ProductCategory getCategory() {
		return mCategory;
	}

	public void setCategory(ProductCategory mCategory) {
		this.mCategory = mCategory;
	}
}
