package recursion;

public class Recursion {
	public static void main(String[] args) {
		//printDecreasing(5);
		//printIncreasing(5);
		//printMixed(5);
		//printSkip(5);
		//System.out.println(fact(6));
		//System.out.println(pow(5,3));
		//System.out.println(fib(6));
		//int a[]= {1,2,3,4,5,4};
		//System.out.println(isSorted(a, 0));
	}
	
	// 5 4 3 2 1
	public static void printDecreasing(int n) {
		if(n==0)
			return;
		System.out.println(n);
		printDecreasing(n-1);
	}
	//1 2 3 4 5
	public static void printIncreasing(int n) {
		if(n==0)
			return;
		printIncreasing(n-1);
		System.out.println(n);
	}
	// 5 4 3 2 1 1 2 3 4 5
	public static void printMixed(int n) {
		if(n==0)
			return;
		System.out.println(n);
		printMixed(n-1);
		System.out.println(n);
		
	}
	// 5 3 1 2 4
	public static void printSkip(int n) {
		if(n==0)
			return;
		if(n%2==1)
			System.out.println(n);
		printSkip(n-1);
		if(n%2==0)
			System.out.println(n);
		
	}
	
	
	public static int fact(int n) {
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static int pow(int x,int n) {
		if(n==0)
			return 1;
		return x*pow(x,n-1);
	}
	public static int fib(int n) {
		if(n==0 || n==1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	
	public static boolean isSorted(int a[],int i) {
		if(i==a.length-1)
			return true;
		if(a[i]>a[i+1])
			return false;
		else
			return isSorted(a, i+1);
	}

}
