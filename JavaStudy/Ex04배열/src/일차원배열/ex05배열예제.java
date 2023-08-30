package 일차원배열;

import java.util.Scanner;

public class ex05배열예제 {

	public static void main(String[] args) {
		
		// 1) 입력하는 도구 가져오기
		
		// 2) 사용자가 입력한 5개의 점수들을 배열에 저장
		// 배열의 이름 : score
		
		// 3) 입력된 점수들을 모두 출력하기
		
		// 4) 최고 점수, 최저 점수 출력하기
		// 5) 총합, 평균 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 숫자 : ");
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		int max = score[0];
		int min = score[0];
		
		System.out.println(" ");
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}System.out.println("최고점수 : " + max);
		
		for (int i = 1; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];
			}
		}System.out.println("최저점수 : " + min);
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (sum + 0.0) / score.length;
		System.out.println("평균 : " + avg);
		
		sc.close();
	}

}


/* 1. 선언 및 초기화
   자료형[] 배열명 = new 자료형 [배열의 크기]

   + 같은 자료형만 관리 할 수 있다
   주소값(레퍼런스형변수)
   int[] number = new int[3];
   number[0] ---> 인덱스값은 0부터 시작한다
   number[1]
   number[2]
   number[3] ---> 예외상황

   for문
   배열의 크기 number.length
   for (int i = 0; i < number.length; i++)*/