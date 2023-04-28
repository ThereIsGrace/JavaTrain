package t20230428.test07;
//2차원 좌표 클래스 Coordinate(Ver.1) 사용 예(방법1)
class Coordinate {
	private double x;       //X좌표
	private double y;       //Y좌표
	
	//--- 생성자 ---//
	Coordinate(double x, double y){this.x = x; this.y = y;}
	
	double getX() {return x;}           //X좌표 가져오기
	double getY() {return y;}           //Y좌표 가져오기
	
	void setX(double x) {this.x = x;}   //X좌표 설정
	void setY(double y) {this.y = y;}   //Y좌표 설정
	
	void set(double x, double y) {this.x = x; this.y = y;}   // 좌표 설정
}
