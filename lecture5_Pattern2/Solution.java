package lecture5_Pattern2;
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	     
	        int n1 = (n+1)/2;
	        int n2 = (n-1)/2;
	        for(int i=1;i<=n1;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
                
       		// Lower triangle
			/*for(int i=1;i<=n2;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=2*i-1;j>=1;j--){
                    System.out.print("*");
                }
                System.out.println();
            }*/

	            
		
        
    }
}