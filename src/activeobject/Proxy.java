package activeobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import programme.VendorInter;


public class Proxy implements AsynchroneVendors {
	
	@Override
	public Collection<VendorInter> getVendors() {
		Collection<VendorInter> lstVendors = new HashSet<VendorInter>();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		List<String> lstVend = new ArrayList<String>();
		lstVend.add("vendor1.csv");
		lstVend.add("vendor2.csv");
		lstVend.add("vendor3.csv");
		
		//Boucle sur mes vendeurs disponibles
		for (String vendorFile : lstVend) {
			Callable<VendorInter> task = new GetVendor(vendorFile);
			//List<Callable<Vendor>> callables = new ArrayList<>();

			//callables.add(new Download(vendorFile));

			//List<Future<Vendor>> futures = executor.invokeAll(callables);
			Future<VendorInter> future = executor.submit(task);
			VendorInter vendor = null;
			try {
				while(!future.isDone()) {
				    System.out.println("Download Vendors...");
				    Thread.sleep(300);
				}
				vendor = future.get();
			} catch (InterruptedException | ExecutionException e) {
				// ... Exception handling code ...
			}
			lstVendors.add(vendor);
		}
		executor.shutdown();
		return lstVendors;
	}
}
