package lecture3_2_while_loop;

import java.util.Scanner;
public class SumOfNNumbers {
    public static void main(String args[]) {
     
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int i=1;// Next num to be added
      int sum=0;
      while(i<=n){
          sum=sum+i;
          i=i+1;
      }
      System.out.println(sum);

    }
}