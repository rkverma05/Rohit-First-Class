package methodFunctionObjects;

public class functionExs {
public static void main(String[] args) {
	rohit();
	functionExs obj=new functionExs();
	obj.nonstatic1();
	obj.nonstatic2();
}

public static void rohit() {
	System.out.println("hello i am Rohit");
}

public void nonstatic1() {
	System.out.println("Hi i am a nonstatic method number 1");
	functionExs.rohit();
}

public void nonstatic2() {
	System.out.println("Hi i am a nonstatic method number 2");
	nonstatic1();
}
}
