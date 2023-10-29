package cam.basics;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("hello.txt");
		
		System.out.println(file.exists());
		
		file.createNewFile();
		
		System.out.println(file.exists());

	}

}
