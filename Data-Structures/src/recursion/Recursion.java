package recursion;

public class Recursion {
	public static void main(String[] args) {
		//printDecreasing(5);
		//printIncreasing(5);
		//printMixed(5);
		printSkip(5);
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

}
