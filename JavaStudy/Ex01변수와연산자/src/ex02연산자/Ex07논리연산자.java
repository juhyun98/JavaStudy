package ex02연산자;

public class Ex07논리연산자 {

	public static void main(String[] args) {
		// 논리연산자 -> 결과가 true or false
		// Not, And, or
		// Not -> boolean 결과를 반대로 보여준다
		boolean isCheck1 = true;
		System.out.println(!isCheck1);
		
		// And (그리고) - 좌항의 결과와 우항의 결과가 true일때만 결과가 true
		// 아니면 전부 false
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		int num4 = 7;
		System.out.println(num1 > num2 && num3 > num4);
		System.out.println(num1 > num2 && num3 < num4);
		
		// Or (또는)
		// 좌항 또는 우항의 결과가 true이면 결과는 true
		// 좌항과 우항 둘다 false면 false
		System.out.println(num1 > num2 || num3 > num4);
		System.out.println(num1 < num2 || num3 > num4);
		
		
		
		
		
		
		

	}

}
