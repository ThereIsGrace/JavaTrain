package t20230503.test06;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;
//절댓값, 제곱근, 원의 넓이 구하기
public class MathMethods {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		out.print("실 수:");
		double x = stdIn.nextDouble();
		
		out.println("절댓값:" + abs(x));
		out.println("제곱근:" + sqrt(x));
		out.println("넓 이:" + PI*x*x);
	}
}
