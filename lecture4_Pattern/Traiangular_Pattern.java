/*package lecture4_Pattern;
import java.util.Scanner;
public class Traiangular_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(j);
				//System.out.print(j+i-1);
			}
			System.out.println();
		}
	}
}*/

package lecture4_Pattern;
import java.util.Scanner;
public class Traiangular_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int StartingNumber=i;
			for(int j=1;j<=i;j++) {
				System.out.print(StartingNumber);
				StartingNumber++;
			}
			System.out.println();
		}
	}
}
