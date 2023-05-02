package t20230501.test10;

public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human("홍길동", 170, 60);
		Human chulsu = new Human("김철수", 166, 72);
		
		gildong.putData();        //gildong의 데이터 표시
		System.out.println("번호:" + gildong.getId());
		
		System.out.println();
		
		chulsu.putData();         //chulsu의 데이터 표시
		System.out.println("번호:" + chulsu.getId());
	}
}