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
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import programme.Vendors;

public class Proxy implements AsynchroneVendors {
	
	private ScheduledExecutorService mSES;

	@Override
	public Future<Vendors> getVendors() {
		this.mSES = new ScheduledThreadPoolExecutor(1);
		List<List<String>> records = new ArrayList<>();
		URL vendorsURL = null;
		try {
			vendorsURL = new URL("https://raw.githubusercontent.com/dbsengineering/ElCheapo/master/vendor1.csv");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Iterator<List<String>> it = records.iterator();
		it.next();
		while(it.hasNext()) {
			List<String> lst = it.next();
			System.out.println(lst.get(0));
		}
		return null;
	}
}
