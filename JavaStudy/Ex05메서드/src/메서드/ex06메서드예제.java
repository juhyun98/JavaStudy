package 메서드;

public class ex06메서드예제 {

	public static void main(String[] args) {
		
		// 2개의 양수를 받아 2개의 숫자 중 더 큰 수를 반환하는 메서드 만들기
		// 단, 두 숫자가 같다면 0을 반환하기
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);
		
		// 1) 메서드 명 : largerNumber
		// 2) 전달인자 : 매개변수 자료형 int 2개
		// 3) 리턴타입이 int 이다.
		
	}
	
	public static int largerNumber(int num1 , int num2) {
		if (num1 < num2) {
			return num2;			
		}else if (num1 > num2) {
			return num1;
		}else {
			return 0;
		}	// else if 문을 사용했으면 반드시 else문으로 닫아줘야한다.
			// : 발생할 수 있는 모든 경우에 대해서 return이 필요하다
			
	}
	

}
