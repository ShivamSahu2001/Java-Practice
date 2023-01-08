/*package lecture4_Pattern;
import java.util.Scanner;
public class CharacterPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
		}
	}
}*/
package lecture4_Pattern;
import java.util.Scanner;
public class CharacterPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			char StartingChar=(char)('A'+i-1);
			for(int j=1;j<=n;j++) {
				System.out.print((char)(StartingChar+j-1));//StartingChar+1
			}                                              //StartingChar=(char)(StartingChar+1)
			System.out.println();
		}
	}
}

