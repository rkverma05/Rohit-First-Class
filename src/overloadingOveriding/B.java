package overloadingOveriding;

public class B extends A{
	public int i=20;
public void abc() {
	System.out.println("Hi i am B's method");
}


public static void main(String[] args) {
	A obj=new B();
	obj.abc();
	System.out.println(obj.i);
}
}
