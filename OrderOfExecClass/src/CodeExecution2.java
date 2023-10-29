
public class CodeExecution2 {
	
	// 5
	public CodeExecution2() {
		this.y  = 12;
	}
	
	int  y = 8;
	
	// 1
	static int x = 5;
	
	// 4
	{
		this.y = 10;
	}
	
	// 2
	static {
		x = 15;
	}
	
	// 3
	int z = 30;
	
	// 6
	static void getX() {
		System.out.println(x);
	}
	
	
	void getY() {
		System.out.println(this.y);
	}
	
	void getZ() {
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		CodeExecution2 c1 = new CodeExecution2();
		
		CodeExecution2.getX();
		c1.getY();
		c1.getZ();

	}

}
