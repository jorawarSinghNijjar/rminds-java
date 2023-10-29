
public class Demo {

	public static void main(String[] args) {
		Operation<Integer> add = ( x, y) -> x + y;
		
		Operation<Double> multiply = ( x, y) -> x * y;
		
		Operation<String> concat = (x,y) -> x+y;
		
		System.out.println(add.result(3,5));
		
		System.out.println(multiply.result(3d,5d));
		
		System.out.println(concat.result("Hello"," Bye"));
	}

}
