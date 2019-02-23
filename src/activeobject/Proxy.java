package activeobject;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import programme.Vendors;

public class Proxy implements AsynchroneVendors {
	
	private ScheduledExecutorService mSES;

	@Override
	public Future<Vendors> getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
