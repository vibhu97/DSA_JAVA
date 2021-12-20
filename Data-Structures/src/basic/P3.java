package basic;

import java.util.*;

public class P3{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     int t=sc.nextInt();
     for(int j=0;j<t;j++){
         int n=sc.nextInt();
         boolean flag=true;
         for(int i=2;i*i<=n;i++){
             if(n%i==0){
                 System.out.println("not prime");
                 flag=false;
                 break;
             }
             
         }
         if(flag)
          System.out.println("prime");
          
     }

 }
}