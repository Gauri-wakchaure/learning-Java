package wrapperclass;

public class UnBoxing2 {

	public static void main(String[] args) {
   // Conversion of Object type to Primitive
		Byte bobj=10;
		byte b3=bobj.byteValue();
		System.out.println("Byte value is :"+b3);
		
		Short sobj=30;
		short s1=sobj.shortValue();
		System.out.println("Short value is :"+s1);
		
		Integer iobj=70;
		int i1=iobj.intValue();
		System.out.println("Integer value is :"+i1);
		
		Long lobj=60L;
		long l1=lobj.longValue();
		System.out.println("Long value is :"+l1);
		
		Float fobj=30.20F;
		float f1=fobj.floatValue();
		System.out.println("Float value is :"+f1);
		
		Double dobj=80.00;
		double d1=dobj.doubleValue();
		System.out.println("Double value is :"+d1);
		
		Character cobj='G';
		char c1=cobj.charValue();
		System.out.println("Character value is :"+c1);
		
		Boolean b1obj=true;
		boolean b4=b1obj.booleanValue();
		System.out.println("Boolean value is :"+b4);
		
	}

}
