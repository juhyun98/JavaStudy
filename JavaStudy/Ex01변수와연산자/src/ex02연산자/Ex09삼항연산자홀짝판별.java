package ex02연산자;

import java.util.Scanner;

public class Ex09삼항연산자홀짝판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ?
			num + "는(은) 짝수 입니다." :
			num + "는(은) 홀수 입니다.";
		
		System.out.println(result);

		
	}

}
