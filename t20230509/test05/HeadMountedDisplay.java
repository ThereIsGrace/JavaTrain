package t20230509.test05;

import t20230509.test01.Wearable;
import t20230509.test02.Skinnable;

//헤드마운트 디스플레이 클래스
public class HeadMountedDisplay implements Wearable, Skinnable {
	private int skin;  //      스킨
	//스킨 변경
	@Override
	public void changeSkin(int skin) {
		this.skin = skin;
		
	}
	//착용
	@Override
	public void putOn() {
		System.out.println("디스플레이를 착용했습니다.");
		
	}
	//해제
	@Override
	public void putOff() {
		System.out.println("디스플레이를 벗었습니다.");
	}
	
	//현재 스킨 표시
	public void putSkin() {
		switch(skin) {
		case BLACK: System.out.println("BLACK DISPLAY"); break;
		case RED: System.out.println("RED DISPLAY"); break;
		case GREEN: System.out.println("GREEN DISPLAY"); break;
		case BLUE: System.out.println("BLUE DISPLAY"); break;
		case YELLOW: System.out.println("YELLOW DISPLAY"); break;
		}
	}
}
