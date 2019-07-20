package overloadingOveriding;

//overriding - concept for implementation 
public class Rohit{

	public static void main(String[] args) {
		Rohit obj=new Rohit();
		obj=null;
		new Rohit();
		
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hi this is my own garbage collector");
	}

	
}
