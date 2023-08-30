package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 난수를 뽑는 방법
		Random rd = new Random();

		System.out.println("====Plus Game====");
		// 틀렸을때는 기존 문제를
		// 성공했을때는 새로운 문제를 출력
		
		// 첫 게임을 시작할때는 3개의 목숨이 주어진다
		// 문제의 답을 틀렸을때는 목숨을 하나씩 차감하며
		// 클라이언트에게 알려준다
		// 예 - 첫번째 문제 틀렸을 시 ) 남은목숨 2개
		// 마지막으로 목숨이 0이 되는 순간 게임은 종료된다
		
		// 정답 맞출떄마다 카운트를 한다
		// 마지막 게임 종료시 최종 맞춘 개수를 보여준다
		// 정답횟수 : 00개
		
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		int life = 3;
		int point = 0;
		
		while (true) {
			System.out.print(num1 + "+" + num2 + "=");
			int inputNum = sc.nextInt();

			// 정답확인
			int answer = num1 + num2;
			if (inputNum == answer) {
				System.out.println("Success!!!");
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
				point++;
			} else {
				System.out.println("Fail....");
				life--;
				System.out.println("남은목숨 : " + life);
				if (life == 0) {
					System.out.println("정답횟수 : " + point);
					System.out.println("Game Over");
					break;
				}
				
			}
			
		}sc.close();

	}

}
