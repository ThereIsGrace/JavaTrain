package t20230424;

import java.util.Scanner;

public class Test10 {
	static int signOf(int n) {
		if(n > 0)
			return 1;
		else if (n < 0)
			return -1;
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수x:");
		int x = stdIn.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)는 " + s + "입니다.");
	}
}
