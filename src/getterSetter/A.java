package getterSetter;

public class A {
	
	//WE use get set property when to need to control some variable value in a program
	//like other programmer could not change the value of my variable 
	//and to assign access to someone to change the value of a variable when needed
	
	private static int i=10;
	public static int getI() {
		return i;
	}
	
	
	public static void main(String[] args) {
		System.out.println(i);
	}
	
	
	
	public static void setI(int i) {
		if(i>=18) {
			A.i = i;	
		}else {
			System.out.println("Please grow up");
		}
		
	}
	
}
