import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		
		ls.add("S");
		ls.add("F");
		ls.add("A");
		ls.add("G");
		ls.add("K");
		ls.add("Z");
		
		System.out.println(ls);
		
		Collections.sort(ls);
		
		System.out.println(ls);
		
		int bs2 = Collections.binarySearch(ls, "G");
		System.out.println("G index: " + bs2);
		
		Collections.reverse(ls);
		
		System.out.println(ls);
		

	}

}
