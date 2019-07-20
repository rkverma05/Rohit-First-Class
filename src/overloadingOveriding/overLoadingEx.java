package overloadingOveriding;

public class overLoadingEx {
public static void main(String[] args) {
	overLoadingEx obj=new overLoadingEx();
	obj.abc(5);
}

public void abc() {
	
}

public void abc(int a) {
	System.out.println(a);
}

public void abc(int a,int b) {
	
}

public void abc(String s) {
	
	
	
}

}
