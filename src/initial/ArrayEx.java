package initial;

public class ArrayEx {
public static void main(String[] args) {
	
	
	int[] arr= {1,2,2,3,4,5};
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" ");
	}
	
	String[] arr2= {"Hello","World"};
	for (int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i]);
	}
	//Reversing a String via for loop
	String s="Rohit";
	char[] ch=s.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		System.out.print(ch[i]);
	}
}
}
