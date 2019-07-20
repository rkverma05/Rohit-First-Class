package methodFunctionObjects;

import initial.DataTypes;

public class ObjectCreation {
	public static void main(String[] args) {

		// System.out.println(args.length);
		// for (int i = 0; i < args.length; i++) {
		// System.out.println(args[i]);
		// }

		ObjectCreation obj = new ObjectCreation();
		obj.abc();
		DSTypes obj2=new DSTypes();
		obj2.dataTypesFunc();
		DataTypes obj3=new DataTypes();
		obj3.xyz();
	}

	public void abc() {
		System.out.println("Hello");
	}
}
