package lecture4_Pattern;
import java.util.Scanner;
public class Traiangular_Pattern2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int StartingNumber=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(StartingNumber);
				StartingNumber++;
			}
			System.out.println();
		}
	}
}

