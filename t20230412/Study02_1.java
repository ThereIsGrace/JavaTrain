package t20230412;
// 정숫값을 읽어서 절댓값을 표시(방법2)
import java.util.Scanner;
public class Study02_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int n = stdIn.nextInt();
		int abs;
		
		// if (조건식) 실행문 else 실행문
		if (n >= 0)
			abs = n;     // n >= 0이 true일 때 실행한다.
		else
			abs = -n;    // n >= 0이 false일 때 실행한다. 
		System.out.println("절댓값은 " + abs + "입니다.");
	}
}
