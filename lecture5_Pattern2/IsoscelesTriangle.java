package lecture5_Pattern2;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int SV=i-1;
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(SV);
				SV--;
			}System.out.println();
			
		}

	}

}
