import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapThing {

	public static void main(String[] args) {
		String text = "Hello I am working on Stream API flatmap !";

		// Split the text to characters and put in a list

		List<String> characters = Arrays.stream(text.split(" ")).flatMap(word -> Arrays.stream(word.split("")))
				.collect(Collectors.toList());
		System.out.println(characters);
		
		
		// Example - 2
		String[][] animalsArr = {
				{"Donkey", "Horse", "Bull"},
				{"Cat, Lion, Cheetah"},
				{"Dog, Wolf"}
				};
		
		Stream<String[]> animalsStream = Arrays.stream(animalsArr);
		
		// Make a list of all animals
		
		List<String> list = animalsStream.flatMap(a -> Stream.of(a)).collect(Collectors.toList());
		System.out.println("\n All : " + list);
	}

}
