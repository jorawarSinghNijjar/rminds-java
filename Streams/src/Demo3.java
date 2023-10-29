import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2,3,6);
		List<Integer> l2 = Arrays.asList(8,9,1);
		List<Integer> l3 = Arrays.asList(15,12,36);
		
		List<Integer> list = Stream.of(l1,l2,l3).flatMap(ls -> ls.stream()).collect(Collectors.toList());
		System.out.println(list);
		
		Set<Integer> set = Stream.of(l1,l2,l3).flatMap(ls -> ls.stream()).collect(Collectors.toSet());
		System.out.println(set);
	}

}
