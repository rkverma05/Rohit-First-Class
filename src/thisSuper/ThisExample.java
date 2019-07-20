package thisSuper;

public class ThisExample {

	public String s="Hello";
	
	public void name(String s) {
		System.out.println("Name is "+s);
		System.out.println("Class level variable s has value = "+this.s);
		this.s=s+" World";
		System.out.println("Class level variable s has value = "+this.s);
		
		
		
	}
	
	public static void main(String[] args) {
		ThisExample obj=new ThisExample();
		obj.name("Rohit");
		
	}
}
