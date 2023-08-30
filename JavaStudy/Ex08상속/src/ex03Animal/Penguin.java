package ex03Animal;

public class Penguin extends Bird{
	
	// 조류입니다.
	// 알낳고, 이름, 성별, 숨쉬고, 울고, 움직여요
	
	// 펭귄이 움직이는 형태는 "헤엄치다."입니다.
	// 울다 "꿹꿹 울다" 로 출력도록 만들자!
	

	@Override
	public void cry() {
		System.out.println("꿹꿹 운다.");
	}
	@Override
	public void move() {
		System.out.println("헤엄친다~");
	}
	
	
	
	
}
