package t20230509.test03;

public class Parallelogram extends Shape implements Plane2D {
	private int width;      //밑변의 너비
	private int height;     //높이
	
	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int getArea() {return width * height;}   //면적 구하기

	@Override
	public String toString() {  //문자열 표현
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	@Override
	public void draw() {   //그리기
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height-i; j++)System.out.print(' ');
			for(int j = 1; j <= width; j++) System.out.print('#');
		}
	}
}
