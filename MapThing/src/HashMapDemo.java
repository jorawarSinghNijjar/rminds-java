import java.util.AbstractList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(2, "Anna");
		hm.put(42, "Tanker");
		hm.put(6, "Xander");
		hm.put(12, "Parth");
		
		System.out.println(hm);
		
		Set<Integer> keys = hm.keySet(); //keySet returns a Set
		
		System.out.println("Keys:\n" + keys);
		
		Collection<String> values = hm.values(); // values() return Collection
		
		System.out.println("Values:\n" + values);
		
		for(Integer i: keys) {
			System.out.println("Key: " + i + "  Value: " + hm.get(i));
		}
		
		
		//Identity Hash Map
		// solves this problem of overriding, Galley overrides Anna
		hm.put(2,"Galley");
		
		System.out.println(hm);
		
		System.out.println("--------Implementing identity Hashmap-----");
		
		Map<Integer, String> ihm = new IdentityHashMap<>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(10);
		
		// Allows duplicate keys but as objects
		ihm.put(i1, "Anna");
		ihm.put(i2, "Tanker");
		ihm.put(i3, "Xander");
		
		System.out.println(ihm);
		
		
	}

}
