import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirst {
	
	public static void main(String[] args) {
			
		List<String> users = Arrays.asList("Aman","Deepak","James","Jorawar","Jenky","Baldeep");
		
		// Find all users which contain letter J
				
		List<String> res = users.stream().filter(user -> user.indexOf("J") != -1).collect(Collectors.toList());
		System.out.println(res);
		
		// Find the first user which contains letter J
		
		String userJ = users.stream().filter(user -> user.indexOf("J") != -1).findFirst().get(); 
		System.out.println(userJ);
		
		String userJ2 = users.stream().filter(user -> user.indexOf("J2") != -1).findFirst().orElse("Not Found"); 
		System.out.println(userJ2);
	}

}
