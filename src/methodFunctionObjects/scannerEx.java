package methodFunctionObjects;

import java.util.Scanner;

public class scannerEx {
public static void main(String[] args) {
	
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Please input a number");
	int n=sc.nextInt();
	System.out.println("Value input was "+n);
	System.out.println("Please enter your name");
	String s=sc.next();
	System.out.println("Hello mr."+s);*/
	
	Operation();
	
}

public static void Operation()
{
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Please enter First digit");
    
	int a=sc1.nextInt();
	System.out.println("Please enter Second digit");
    int b=sc1.nextInt();

    //Division
int c;
c=a/b;

System.out.println("After Division   "+ c);

c=a*b;

//After Multiplication

System.out.println("After Mulitplication "+c);

}

}
