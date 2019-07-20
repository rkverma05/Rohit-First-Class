package methodFunctionObjects;

public class parameterizeEx {
public static void main(String[] args) {
	
	remainder();
//sum(2, 3);
	//myname("Rohit");
	//System.out.println(difference(5, 2));
	//int result=difference(7, 1);
	//System.out.println(result);
}


public static void sum(int a,int b) {
	System.out.println(a+b);
}

public static void myname(String name) {
	System.out.println("Hi my name is "+name);
}

// Return Type


public static int difference(int a,int b) {
	int result=a-b;
	return result;
}

public static void remainder()
{
	
int a=10,b=2,c;

c= a%b;
System.out.println("Remainder is "+c);

}

}

