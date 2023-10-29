
public class User {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "user";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}
}
