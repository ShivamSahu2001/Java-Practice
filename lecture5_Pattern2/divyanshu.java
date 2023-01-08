package lecture5_Pattern2;

import java.util.Scanner;

public class divyanshu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=s.nextInt();
		int j =i;
		int sum =0;
		while(i>0) {
			int rem = i%10;
			i=i/10;
			sum = sum*10 + rem;
		}
		System.out.println(sum);
		/*if(sum == j) {
			System.out.println("Number is palindrome number ");
		}
		else {
			System.out.println("Number is not palindrome number ");
		}*/
	}

}
