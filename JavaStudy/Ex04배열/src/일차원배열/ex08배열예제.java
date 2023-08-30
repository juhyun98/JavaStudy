package 일차원배열;

import java.util.Scanner;

public class ex08배열예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		int[] ans = {1, 4, 3, 2, 1};
		int[] my = new int[5];
		int score = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번답 >> ");
			my[i] = sc.nextInt();
			}System.out.println("정답확인");
		for (int j = 1; j <= 5; j++) {			
			if (ans[(j-1)] == my[j-1]) {
				score += 20;
				System.out.print("O ");
			}else {
				System.out.print("X ");
			}
		}System.out.println("총점 : " + score);
		
		sc.close();
	}

}
