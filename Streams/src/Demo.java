import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < 10; ++i) {
			list1.add(i);
		}

		// Print all numbers using iterator

		System.out.println("Print all using iterator:");
		Iterator<Integer> it = list1.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

		// Print all using for enhanced loop
		System.out.println("\nPrint all using for enhaced loop:");
		for (int i : list1) {
			System.out.print(i + "\t");
		}

		// External iterations - for and iterator

		// Internal iterations - stream api

		// Print all using for forEach and Consumer with anonymous class
		System.out.println("\nPrint all using for forEach and Consumer with anonymous class");
		Consumer<Integer> c1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				System.out.print(i + "\t");
			}
		};

		list1.forEach(c1);

		// Print all using for forEach and Consumer with lambda
		System.out.println("\nPrint all using for forEach and Consumer with anonymous class");
		Consumer<Integer> c2 = i -> System.out.print(i + "\t");

		list1.forEach(c2);

		// Print all using for forEach and Lambda
		System.out.println("\nPrint all using for forEach and Lambda");
		list1.forEach(i -> System.out.print(i + "\t"));

		// Print all using for forEach and method reference
		System.out.println("\nPrint all using for forEach and method reference");
		list1.forEach(System.out::print); // Cannot concat "\t" because it is method reference, so no parameters

		// Print all using for forEach and method reference with additional method to modify
		System.out.println("\nPrint all using for forEach and method reference with additional method to modify");
		list1.forEach(Demo::printWithTab);

		// Filter out only even numbers
		List<Integer> list2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("\nEven numbers: " + list2);

		// Add all numbers

	}
	
	public static void printWithTab(int i) {
		System.out.print(i + "\t");
	}

}
