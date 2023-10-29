import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String[] arr = new String[10];
		
		Optional<String> nullable = Optional.ofNullable(null);
		
		if(nullable.isPresent()) {
			String x = arr[5].toLowerCase();
		}
		else {
			System.out.println("String value is not present");
		}
	}
}
