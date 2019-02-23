package programme;

public interface VendorInter {
	double getPrice(String productName);
	void addProduct(ProductInter product);
	ProductInter getProduct(String productName);
}
