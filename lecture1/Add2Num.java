package lecture1;

import java.util.Scanner;

public class Add2Num {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		
		System.out.println("Sum Of two numbers -: "+(i+j));
		int p=22,r=22,t=23;
		int si=(p*r*t)/100;
		System.out.println("SI is -: "+si);
		 
		Short S=123;  // 2 bytes
		int I=23;   // 4 bytes
		long l=12345;  // 8 bytes
		float f=1.2F;  //By default,float numbers are treated as double in java. // 4 bytes
		double d=1.23;  // 8 bytes
		char c='a';     // 2 bytes
		i=56;
	}

}
