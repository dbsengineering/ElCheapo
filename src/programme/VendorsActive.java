package programme;

import java.util.Collection;
import java.util.HashSet;
import activeobject.Proxy;

public class VendorsActive implements Vendors {
	
	public static Collection<VendorInter> getVendors(){
		Collection<VendorInter> col = new HashSet<VendorInter>();
		Proxy proxy = new Proxy();
		col = proxy.getVendors();
		return col;
	}
}
