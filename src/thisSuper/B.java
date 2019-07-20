package thisSuper;

public class B extends A{

	public void Rohit() {
		System.out.println("Hi i am Rohit from Child");
	}
	
	public static void main(String[] args) {
		B obj=new B();
		obj.xyz();
	}
	
	public void xyz() {
		A obj=new B();
		obj.Rohit();
		super.Rohit();
	}
}
