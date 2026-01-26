package wrapperclass;

public class UnBoxingTask {

	public static void main(String[] args) {

		// Unboxing of Primitive Datatypes
		Byte b=10;
		byte obj1=b.byteValue();
		System.out.println("Object1 is :"+obj1);
		
		Short s1=20;
		short obj2=s1.shortValue();
		System.out.println("Object2 is :"+obj2);
		
		Integer I1=30;
		int obj3=I1.intValue();
		System.out.println("Object3 is :"+obj3);
		
		Long l1= 50L;
		long obj4=l1.longValue();
		System.out.println("Object4 is :"+obj4);
		
		Float f1=60.0f;
		float obj5=f1.floatValue();
		System.out.println("Object5 is :"+obj5);
		
		Double d1=70.0D;
		double obj6=d1.doubleValue();
		System.out.println("Object6 is :"+obj6);
		
		Character c1='A';
		char obj7=c1.charValue();
		System.out.println("Object7 is :"+obj7);
		
		Boolean b1=true;
		boolean obj8=b1.booleanValue();
		System.out.println("Object8 is :"+obj8);
		
		

	}

}
