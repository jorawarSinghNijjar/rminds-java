
public class StringTheory {

	public static void main(String[] args) {
		// Different ways to initialize string
		String s1 = "Welcome";
		
		String s2 = new String("Hello");
		
		char[] c3 = {'B','y','e'};
		String s3 = new String(c3);
		
		byte[] b4 = {105,98,100,106,127};
		String s4 = new String(b4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
