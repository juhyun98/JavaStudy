package ex01변수;

public class Ex02변수의종류 {

	public static void main(String[] args) {
	
		// 정수형 데이터 타입
		// byte - 1byte (-128 ~ 127)
		byte num1 = 127;
		
		// short - 2byte
		short num2 = 5000;
		
		// int - 4byte
		int num3 = 244444444;
		
		// long - 8byte
		long num4 = 3000000000L;
		
		// 실수형 데이터 타입
		// float - 4byte
		float num5 = 14.3F;
		float num6 = (float)14.3;
		
		// double - 8byte
		double num7 = 3.14;
		
		// 논리형
		// boolean - 1 bit or 1 byte
		boolean isCheck = true;
		
		// 문자형
		// char - 2byte
		char text = 'A'; // 65

		System.out.println(text + 1);
		System.out.println((char)99);
		
		// 변수의 규칙
		/* 특수문자는 '_'와 '$'만 허용한다.
		   숫자로 시작 할 수 없다. */
		
		
	}

	

}
