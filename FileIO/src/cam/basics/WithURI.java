package cam.basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WithURI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\joraw\\Desktop\\test.txt");
			fos.write(67);
			fos.close();
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
