package t20230502.test06;

import java.util.Scanner;
<<<<<<< Updated upstream

public class MinMaxTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x값:"); int x= stdIn.nextInt();
=======
//최솟값, 최댓값을 구하는 유틸리티 클래스의 테스트 프로그램
public class MinMaxTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x값:"); int x = stdIn.nextInt();
>>>>>>> Stashed changes
		System.out.print("y값:"); int y = stdIn.nextInt();
		System.out.print("z값:"); int z = stdIn.nextInt();
		System.out.print("배열a의 요소 수:");
		int num = stdIn.nextInt();
<<<<<<< Updated upstream
		int[] a = new int[num];       // 요소 수가 num인 배열
		for (int i = 0; i < num; i++) {
=======
		int[] a = new int[num];         //요소 수가 num인 배열
		for(int i = 0; i < num; i++) {
>>>>>>> Stashed changes
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}
		
<<<<<<< Updated upstream
		System.out.printf("x, y의 최솟값은 %d입니다.\n", MinMax.min(x,y));
		System.out.printf("x, y의 최댓값은 %d입니다.\n", MinMax.max(x,y));
		System.out.printf("x, y, z의 최솟값은 %d입니다.\n", MinMax.min(x,y,z));
		System.out.printf("x, y, z의 최솟값은 %d입니다.\n", MinMax.max(x,y,z));
=======
		System.out.printf("x,y의 최솟값은 %d입니다.\n", MinMax.min(x,y));
		System.out.printf("x,y의 최댓값은 %d입니다.\n", MinMax.max(x,y));
		System.out.printf("x,y,z의 최솟값은 %d입니다.\n", MinMax.min(x,y,z));
		System.out.printf("x,y,z의 최댓값은 %d입니다.\n", MinMax.max(x,y,z));
>>>>>>> Stashed changes
		System.out.printf("배열 a의 최솟값은 %d입니다.\n", MinMax.min(a));
		
		int xmin[] = MinMax.minIndexArray(a);
		System.out.print("인덱스는{");
		for(int i = 0; i < xmin.length; i++)
<<<<<<< Updated upstream
			System.out.print(xmin[i] + " "); 
		System.out.println("}입니다.");
		int xmax[] = MinMax.maxIndexArray(a);
		System.out.print("인덱스는 {");
		for(int i = 0; i < xmax.length; i++)
			System.out.print(xmax[i] + " ");
=======
			System.out.print(xmin[i] + " "); System.out.println("}입니다.");
		System.out.printf("배열 a의 최댓값은 %d입니다.\n",MinMax.max(a));
		int xmax[] = MinMax.maxIndexArray(a);
		System.out.print("인덱스는{");
		for(int i = 0; i < xmax.length; i++)
			System.out.print(xmax[i] + " "); 
>>>>>>> Stashed changes
		System.out.println("}입니다.");
	}
}
