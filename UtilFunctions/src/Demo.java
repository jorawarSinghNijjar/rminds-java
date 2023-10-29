import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		// Single arg
		Function<Integer, String> intToString = (i) -> {
			return i + "";
		};
		
		System.out.println(intToString.apply(200));
		
		Function<String, Integer> stringToInt = (s) -> {
			return Integer.parseInt(s);
		};
		
		System.out.println(stringToInt.apply("200") instanceof Integer);
		
		// For two args
		BiFunction<Integer, Integer, String> addAndString = (x,y) -> {
			return x + y + "";
		};
		
		System.out.println(addAndString.apply(10, 20));
		
		// Boolean one argument
		Predicate<Integer> grt20 = x -> x > 20;
		
		System.out.println(grt20.test(30));
		
		// Boolean two argument
		BiPredicate<Integer, Integer> xIsBigger = (x,y) -> {
			return x > y;
		};
		
		System.out.println(xIsBigger.test(10, 30));
	}

}
