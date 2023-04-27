package t20230427;

import java.util.Scanner;

//2차원 배열의 복사본 생성
public class Test06 {
	//---2차원 배열 a의 복사본을 생성해서 반환---//
	static int[][] aryClone2(int[][] a){
		int[][] c = new int[a.length][];
		for(int i = 0; i < a.length; i++) {
			c[i] = new int[a[i].length];
			for(int j = 0; j < c[i].length; j++)
				c[i][j] = a[i][j]; 
		}
		return c;
	}
	
	//--- 행렬 n의 모든 요소를 표시 ---//
	static void printMatrix(int[][] a) {
		for(int i = 0; i< a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("행렬의 행 수:");int height = stdIn.nextInt();
		System.out.print("행렬의 열 수:");int width = stdIn.nextInt();
		
		int[][] a = new int[height][width];
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d]:",i, j);
				a[i][j] = stdIn.nextInt();
			}
		
		int[][] ca = aryClone2(a);
		System.out.println("행렬 a");
		printMatrix(a);
		
		System.out.println("행렬 a의 복사본");
		printMatrix(ca);
	}

}
