import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		
		ls.add("Kamlesh");
		ls.add("Damas");
		ls.add("Kriska");
		ls.add("Zynga");
		
		System.out.println("List: " + ls);
		// map()
		
		List<String> fl = ls.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Capitalized List: " + fl);
		
		// Count 
		int count = (int) ls.stream().filter(s -> s.length() > 5).count();
		
		System.out.println(count);
		
		List<Integer> list2 = new ArrayList<>();

		for(int i=0; i < 10; ++i) {
			list2.add(i);
		}
		
		Collections.reverse(list2);
		System.out.println("List 2: " + list2); 
	
		
		// Compare
		Comparator<Integer> c = (a,b) -> a.compareTo(b);
		
		List<Integer> sortedList = list2.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println("Sorted List: " + sortedList);
		
		// max
		
		int max = list2.stream().max(c).get();
		
		System.out.println("Max Number: " + max);
	}

}
