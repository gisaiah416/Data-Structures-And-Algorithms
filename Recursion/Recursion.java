package algorithms;

public class Recursion {
	
	public static void main(String[] args) {
		fun(5);
	}
	
	
	static void fun(int n) {
		if (n > 0) {
			System.out.println(n);
			fun(n - 1);
		}
	}

}
