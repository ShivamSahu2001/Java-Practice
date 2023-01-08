package Lecture2;

public class TypeCasting {
	public static void main(String[] args) {
		char c = 'a';
		System.out.println(c + 3);
		
		int i = c + 10;
		System.out.println(i);
		
		i = c;           //Implicit Typecasting
		char abc = (char)i;  //Explicit Typecasting
		
		long l = i;
		l = 1633333333;
		l = 16333333334L;
		i = (int)l;
		System.out.println(l);
		System.out.println(i);
		
		double d = i;
		//i = d;
		
		float f = 1.23f;
		//f = d;
		d=f;
	}


}
