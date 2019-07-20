
package getterSetter;

public class B {
	
	//call of setI function
public static void main(String[] args) {
	A obj=new A();
	
obj.setI(10);
	System.out.println(obj.getI());
	
	//setI method will not print the value??
	//System.out.println(obj.setI());
}
}
