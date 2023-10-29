import java.util.function.Predicate;

public class PredicateApplication {

	public static void main(String[] args) {
		
		int[] x = {3,25,36,20,23,78,51,32,69,41,231,21,02};
		
		Predicate<Integer> p = i -> i > 50;
		
		Predicate<Integer> p2 = i -> (i % 2 == 0);
		
		// One predicate
		
		filter(p,x);
		
		// And predicates
		
		filter(p.and(p2), x);
		
		// OR predicates
		
		filter(p.or(p2), x);
	}

	private static void filter(Predicate<Integer> p, int[] x) {
		
		for (int i : x) {
			if(p.test(i)) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
	}

}
