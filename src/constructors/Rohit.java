package constructors;

public class Rohit {

	public Rohit() {
		
		System.out.println("Hello i am rohit");
	}
	
	public Rohit(int a) {
		System.out.println("Hi i am rohit with param "+a);
	}
	
	public static void main(String[] args) {
		Rohit obj=new Rohit();
		Rohit obj2=new Rohit(20);
	}
}
