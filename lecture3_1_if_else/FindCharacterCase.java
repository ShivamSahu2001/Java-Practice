package lecture3_1_if_else;

import java.util.Scanner;

public class FindCharacterCase {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
    char p=str.charAt(0);
    if(p>= 'A' && p<= 'Z' ){
     System.out.println(1);

    }else if(p>= 'a' && p<= 'z'){
     System.out.println(0);
    }
    else{
    System.out.println(-1);
    }

   }
}
