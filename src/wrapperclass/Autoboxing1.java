package wrapperclass;

public class Autoboxing1 {

	public static void main(String[] args) {
   // Conversion of Primitive to Object type
		byte b=10;
		Byte bobj=b;
		System.out.println("bobj is :"+bobj);
		
		short s=20;
		Short sobj=s;
		System.out.println("sobj is :"+sobj);
		
        int i=30;
		Integer iobj=i;
		System.out.println("iobj is :"+iobj);
		
		long l=10L;
		Long lobj=l;
		System.out.println("lobj is :"+lobj);
		
		float f=10.6F;
		Float fobj=f;
		System.out.println("fobj is :"+fobj);

		double d=50.43F;
		Double dobj=d;
		System.out.println("dobj is :"+dobj);
		
		char c='G';
		Character cobj=c;
		System.out.println("cobj is :"+cobj);
		
     	boolean b1=true;
		Boolean b1obj=b1;
		System.out.println("b1obj is :"+b1obj);
	}

}
