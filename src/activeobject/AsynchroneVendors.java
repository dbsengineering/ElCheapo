package activeobject;

import java.util.concurrent.Future;
import programme.Vendors;

public interface AsynchroneVendors {
	
	Future<Vendors> getValue();

}
