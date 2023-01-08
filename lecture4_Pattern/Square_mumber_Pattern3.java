 package lecture4_Pattern;

import java.util.Scanner;

public class Square_mumber_Pattern3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(n-j+1);
			}
			System.out.println();
		}

	}

}

