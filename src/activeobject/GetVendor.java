package activeobject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import programme.Category;
import programme.Product;
import programme.ProductCategory;
import programme.Vendor;
import programme.VendorInter;
import strategy.TVA1;
import strategy.TVA2;
import strategy.TVA3;

public class GetVendor implements GetVendorInter {
	
	private final String vendorFile;
	private final String url = "https://raw.githubusercontent.com/dbsengineering/ElCheapo/master/";
	
	public GetVendor(String vendorFile) {
		this.vendorFile = vendorFile;
	}

	@Override
	public VendorInter call() throws Exception {
		List<List<String>> records = new ArrayList<>();
		URL vendorsURL = null;
		try {
			vendorsURL = new URL(url + this.vendorFile);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try (BufferedReader br = new BufferedReader(new InputStreamReader(vendorsURL.openStream()))) {
		    String line;
		    try {
				while ((line = br.readLine()) != null) {
				    String[] values = line.split(",");
				    records.add(Arrays.asList(values));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Iterator<List<String>> it = records.iterator();
		VendorInter v0 = null;
		boolean block = false;
		while(it.hasNext()) {
			List<String> lst = it.next();
			if(!block) {
				v0 = new Vendor(lst.get(0));
				block = true;
			}
			ProductCategory category = new Category(lst.get(1));
			switch(Integer.valueOf(lst.get(4))) {
			case 1:
				category.setStrategyTVA(new TVA1());
				break;
			case 2:
				category.setStrategyTVA(new TVA2());
				break;
			case 3:
				category.setStrategyTVA(new TVA3());
				break;
				default:
					category.setStrategyTVA(new TVA1());
			}
			
			v0.addProduct(new Product(lst.get(2), 
					Double.valueOf(lst.get(3)), 
					category));
		}
		return v0;
	}

}
