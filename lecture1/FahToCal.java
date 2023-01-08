package lecture1;

import java.util.Scanner;

public class FahToCal {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		int C=(5*(f-32))/9;
		//int c=(int)((5.0/9)*(f-32));
		System.out.println(C);
		char c='a';
		System.out.println(c);
		
		//Explicity type cast
		char i=(char)(c+3);
		System.out.println(i);
		s.close();
	
	
	}
	
}