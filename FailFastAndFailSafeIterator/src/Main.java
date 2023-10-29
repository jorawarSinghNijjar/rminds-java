import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {
		
//		 Fail Fast Iterator
		List<String> phones = new ArrayList<>();
		
		phones.add("Iphone");
		phones.add("Samsung");
		phones.add("Motorola");
		
		
		Iterator<String> itr = phones.iterator();
		
		while(itr.hasNext()) {
			String phone = itr.next();
			System.out.println(phone);
			
			// Will throw ConcurrentModification Exception because we are modifying while iterating
			phones.remove("Motorola");
		}
		
		
		// Fail Safe or Non fail Iterator
		
		List<String> computers = new CopyOnWriteArrayList<>();
		
		computers.add("acer");
		computers.add("dell");
		computers.add("mac");
		
		
		Iterator<String> itr2 = computers.iterator();
		
		while(itr2.hasNext()) {
			String computer = itr2.next();
			System.out.println(computer);
			
			// No exception will be thrown because 
			computers.remove("dell");
		}
		
		System.out.println(computers);
	}

}
