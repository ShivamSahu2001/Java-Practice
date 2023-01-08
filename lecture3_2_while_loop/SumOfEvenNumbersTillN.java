package lecture3_2_while_loop;

import java.util.Scanner;

public class SumOfEvenNumbersTillN {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int i=2,sum=0;
        while(i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
	}

}
