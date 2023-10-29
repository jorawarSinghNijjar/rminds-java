import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; ++i) {
			list.add(i);
		}

		// Stream can be used only once
		Stream<Integer> s = list.stream();
		s.forEach(System.out::print);
//		s.forEach(System.out::print); // Will throw exception as it has already been used once

//		addAllWithFor(list);
//		addAllWithReduce(list);
//		addAllWithReduce2(list);
//		addAllEvenNumbers(list);
		findMaxNumber(list);
	}

	// Add all values and return sum

	public static void addAllWithFor(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}

		System.out.println("\nSum = " + sum);
	}

	// Add all with reduce()

	public static void addAllWithReduce(List<Integer> list) {
//		int sum = list.stream().reduce(0, (a,b) -> a+b);
//		int sum = list.stream().reduce(0, (a,b) -> Integer.sum(a, b));
		int sum = list.stream().reduce(0, Integer::sum); // Best and short method
		System.out.println("\nSum = " + sum);
	}

	// Multiply each element with 2 and Add all with reduce()
	public static void addAllWithReduce2(List<Integer> list) {
//		int sum = list.stream().map(i -> i*2).reduce(0, (a,b) -> a+b);
		int sum = list.stream().map(i -> i * 2).reduce(0, Integer::sum);
		System.out.println("\nSum = " + sum);
	}

	// Add all elements even numbers

	public static void addAllEvenNumbers(List<Integer> list) {
		int sum = list.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum);
		System.out.println("\nSum = " + sum);
	}

	// Find Max number
	
	public static void findMaxNumber(List<Integer> list) {
//		int max = list.stream().max((a,b) -> a > b ? 1 : -1).orElse(0);
//		int max = list.stream().max((a,b) -> a.compareTo(b)).orElse(0);
		int max = list.stream().max(Integer::compareTo).orElse(0);
		System.out.println("\nMax = " + max);
	}
	

}
