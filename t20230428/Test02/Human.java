package t20230428.Test02;

public class Human {
	private String name;       //이름
	private int height;        //신장
	private int weight;        //체중
	
	//------ 생성자 ------//
	Human(String n, int h, int w){
		name = n; height = h; weight = w;
	}

	public String getName() {  //이름 가져오기
		return name;
	}

	public int getHeight() {   //신장 불러오기
		return height;
	}

	public int getWeight() {   //체중 불러오기
		return weight;
	}
	
	void gainWeight(int w) {weight += w;}     //살이 찐다.
	void reduceWeight(int w) {weight -= w;}   //살이 빠진다.
	
}
