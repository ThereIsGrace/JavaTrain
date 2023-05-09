package t20230509.test06;

public class DVDPlayer implements ExPlayer{
	@Override
	public void play() {                      // 재생
		System.out.println("■DVD 재생 시작!");
		
	}

	@Override
	public void stop() {                      // 정지
		System.out.println("■DVD 재생 종료!");
		
	}

	@Override
	public void slow() {                      // ○느린 재생
		System.out.println("■DVD 느린 재생 시작!");
	}
}
