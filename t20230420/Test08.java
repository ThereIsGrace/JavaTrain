package t20230420;
public class Test08 {
	public static void main(String[] args) {
		double[] a = new double[5];  // 배열 선언
		for (int i = 0; i < 5; i++)
			a[i] = (i+1) * 1.1;

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "]=" + a[i]);
	}
}
