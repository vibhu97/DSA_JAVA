package basic;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		for(int i=low;i<=high;i++) {
			boolean flag=true;
	         for(int j=2;j*j<=i;j++){
	             if(i%j==0){
	                // System.out.println("not prime");
	                 flag=false;
	                 break;
	             }
	             
	         }
	         if(flag)
	          System.out.println(i);
		}
	}

}
