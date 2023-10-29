import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class TestMap {
	public static void main(String[] args) throws InterruptedException {
//		Map<User, String> hm = new HashMap<>();
		Map<User, String> hm = new WeakHashMap<>();
		
		User u1 = new User();
		
		hm.put(u1, "Harman");
		
		System.out.println(hm);
		
		u1=null;
		
		System.gc();
		Thread.sleep(1000);
		
		System.out.println(hm);
		
	}
}
