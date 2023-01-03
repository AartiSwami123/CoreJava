
public class typecasting {
	public static void main(String args[]) {
		//implicit int to float possible
	
		byte a2 = 127;
		short b2= a2;
		System.out.println("byte to short "+b2);
		
		short a1 =10;
		int b1= a1;
		System.out.println("short to int "+b1);
		
		int val1=100;
		long val2= val1;
		System.out.println("int to long "+val2);
		
		int a3=100;
		float b3= a3;
		System.out.println("int to float "+b3);
		
		float f1=90.0f;
		double d= f1;
		System.out.println("float to double "+d);
		
		
		// cant convert double to float so explicit
		double d1 = 10.00d;
		float ff = (float)d1;
		System.out.println("double to float "+ff);
		
		// float to int not possible do explicitly
		float a=10f;
		int b = (int)a;
		System.out.println("float to int "+b);
		
		//float to long not possible do explicitly
		float aa=10f;
		long bb = (long)aa;
		System.out.println("float to long "+bb); 
		
		
	}

}

