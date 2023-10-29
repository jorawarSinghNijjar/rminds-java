package cam.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {
					FileOutputStream fos = new FileOutputStream("C:\\Users\\joraw\\Desktop\\test.txt");
					String greet = "Good Morning Sir/Madam";
					
					fos.write(greet.getBytes());
					fos.close();
					System.out.println("Done");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					FileInputStream fin = new FileInputStream("C:\\Users\\joraw\\Desktop\\test.txt");
					
					int i=0;
					while(i != -1) {
						i=fin.read();
						System.out.print((char) i);
					}
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}

}
