
public class CodeExecutionOrder {
	static int staticVar = 1;
	int instanceVar = 2;

	static {
		System.out.println("Static block is executed first.");
		staticVar = 10;
	}

	// Instance Initialization Block
	{
		System.out.println("Instance block is executed before constructor.");
		instanceVar = 20;
	}

	// Constructor
	public CodeExecutionOrder() {

		System.out.println("Constructor is executed after instance block.");
	}

	public static void staticMethod() {
		System.out.println("Static method is executed without creating an instance.");
		System.out.println("Static variable value: " + staticVar);
	}

	public static void main(String[] args) {
		CodeExecutionOrder example = new CodeExecutionOrder();
		staticMethod();
	}
}
