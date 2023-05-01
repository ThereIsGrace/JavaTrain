package t20230428.test06;

import java.util.Scanner;
//2차원 좌표 클래스 Coordinate(Ver.1) 사용 예(방법1)
public class CoordinateTester1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("x좌표:"); double x = stdIn.nextDouble();
		System.out.print("y좌표:"); double y = stdIn.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + "," + p.getY() + ")");
		Coordinate q = p;
		q.set(9.9, 9.9);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("q = (" + q.getX() + ", " + q.getY() + ")");
	}
}