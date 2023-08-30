package 일차원배열;

public class ex02배열 {

	public static void main(String[] args) {
		
		// 정수형 배열 arr을 생성
		// 다음과 같은 값으로 초기화 하기
		// 3, 10, 4, 8, 17, 22, 31
		
		// 1) arr 배열에 들어있는 값을 for문을 사용해서 한번에 출력하기
		int[] num = {3, 10, 4, 8, 17, 22, 31};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		// 2) arr 배열에 들어있는 값들 중에서 짝수만 출력하기
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
			
			
		}
		// 3) arr 배열에 들어있는 값들 중에서 가장 큰 수를 출력하기(선택)
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] - 30 > 0) {
//				System.out.println(num[i]);
//			}
//		}
		
		int max = num[0];
		// max = 0 : 만약에 배열에 들어가있는 모든 값들이 음수라면
		// 정확한 결과값을 받아볼수가 없다!
		// + 배열안에 들어있는 값들로만 비교를 해야한다
		
		for (int i = 1; i < num.length; i++) {
			
			if (num[i] > max) {
				max = num[i];
			}
		
		}
		System.out.println("최대값을 " + max + "입니다.");
	}

}
