package programme;
import java.util.Collection;
import java.util.HashSet;
import strategy.TVA1;
import strategy.TVA2;
import strategy.TVA3;

/**
 * Liste des vendeurs
 * @author Cavron Jérémy
 *
 */
public interface Vendors {
	
	public static Collection<VendorInter> getVendors(){
		Collection<VendorInter> col = new HashSet<VendorInter>();
		
		VendorInter v0 = new Vendor("Sensi Seed");
		VendorInter v1 = new Vendor("amsterdamseedcenter");
		VendorInter v2 = new Vendor("JeremSeedBrain");
		
		ProductCategory cat0 = new Category("Féminisé");
		ProductCategory cat1 = new Category("Auto-Floraison");
		ProductCategory cat2 = new Category("CBD");
		
		//Ajout des TVA
		cat0.setStrategyTVA(new TVA1());
		cat1.setStrategyTVA(new TVA2());
		cat2.setStrategyTVA(new TVA3());
		
		/*Document doc;
		try {
			doc = Jsoup.connect("https://sensiseeds.com/fr/filter/fr/graines-feminisees").get();
			Elements product = doc.getElementsByClass("product-name");
	        Elements price = doc.getElementsByClass("price_amount");
	       
	        String[] lstProduct = product.html().split("\n");
	        String[] lstPrice = price.html().split("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
		
		v0.addProduct(new Product("White Skunk", 14.00, cat0));
		v0.addProduct(new Product("Purple Bud", 14.00, cat0));
		v0.addProduct(new Product("Jamaican Pearl", 27.50, cat0));
		v0.addProduct(new Product("Afghani", 27.00, cat1));
		v0.addProduct(new Product("White Haze", 29.00, cat1));
		v0.addProduct(new Product("Shiva Skunk", 30.00, cat1));
		v0.addProduct(new Product("E-liquide 50mg", 14.96, cat2));
		v0.addProduct(new Product("E-liquide 200mg", 39.95, cat2));
		v0.addProduct(new Product("Capsules d'huile", 29.95, cat2));
		v0.addProduct(new Product("Pure Power Plant", 98.00, cat1));
		
		v1.addProduct(new Product("White Skunk", 13.00, cat0));
		v1.addProduct(new Product("Purple Bud", 15.00, cat0));
		v1.addProduct(new Product("Jamaican Pearl", 27.50, cat0));
		v1.addProduct(new Product("Afghani", 24.00, cat1));
		v1.addProduct(new Product("White Haze", 30.00, cat1));
		v1.addProduct(new Product("Shiva Skunk", 30.00, cat1));
		v1.addProduct(new Product("E-liquide 50mg", 14.92, cat2));
		v1.addProduct(new Product("E-liquide 200mg", 39.95, cat2));
		v1.addProduct(new Product("Capsules d'huile", 25.95, cat2));
		v1.addProduct(new Product("Pure Power Plant", 101.00, cat1));
		
		v2.addProduct(new Product("White Skunk", 11.00, cat0));
		v2.addProduct(new Product("Purple Bud", 13.00, cat0));
		v2.addProduct(new Product("Jamaican Pearl", 23.50, cat0));
		v2.addProduct(new Product("Afghani", 21.00, cat1));
		v2.addProduct(new Product("White Haze", 38.00, cat1));
		v2.addProduct(new Product("Shiva Skunk", 30.20, cat1));
		v2.addProduct(new Product("E-liquide 50mg", 19.92, cat2));
		v2.addProduct(new Product("E-liquide 200mg", 39.98, cat2));
		v2.addProduct(new Product("Capsules d'huile", 23.95, cat2));
		v2.addProduct(new Product("Pure Power Plant", 80.00, cat1));
		col.add(v0);
		col.add(v1);
		col.add(v2);
		return col;
	}

}
