
public class operators{
	public static void main(String args[]) {
		int a=10;
		int b=20;
		//arithmetic operators
		System.out.println("sum= "+(a+b));
		System.out.println("sub= "+(a-b));
		System.out.println("mul= "+(a*b));
		System.out.println("div= "+(a/b));
		System.out.println("mod= "+(a%b));
		
		//assignment operator
		System.out.println("a and b are equal.	 "+(a==b));
		System.out.println("a is not qual to b.	 "+(a!=b));
		System.out.println("a is less than b.	 "+(a<b));
		System.out.println("b is less than a.	 "+(b<a));
		System.out.println("a is greater than b. 	 "+(a>b));
		System.out.println("b is greater than a.	 "+(b>a));
		
		int p=10;
		p+=p;
		System.out.println(p);
		int q=15;
		q-=5;
		System.out.println(q);
		int r=9;
		r*=r;
		System.out.println(r);
		int s=70;
		s/=s;
		System.out.println(s);
		int t=10;
		t%=t;
		System.out.println(t);
		
		//logical operator/boolean
		if(a<b || a==b)
			System.out.println("any of one condition satisfied in OR.");
		if(a<b && a==b)
			System.out.println("BOTH condition must satisfied in OR.");
		if(!(a<b || a==b))
			System.out.println("if condition satisfied then result is false.");
		
		//real time e.g.
		int ageboy=21;
		int agegirl=18;
		if((ageboy>=21) && (agegirl>=18))
			System.out.println("boy and girl can marry legally.");
		else
			System.out.println("cant marry");
		
		
		//ternary operator
		int x=10;					//binary operator
		boolean y = !(4>5);			//(4/5) is unary operand
		System.out.println(y);
		boolean z=(x>=10)?true:false;	//ternary operator
		System.out.println(z);
		
		x = (x>=10) ? 10 : 11;	//ternary operator
		System.out.println(x);
		
		
	}

}
