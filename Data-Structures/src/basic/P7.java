package basic;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tem=n;
		int c=0;
		while(tem!=0) {
			tem=tem/10;
			c++;
		}
		int div=(int)Math.pow(10, c-1);
		while(div!=0) {
			int num=n/div;
			n=n%div;
			System.out.println(num);
			div=div/10;
		}
		
	}

}
