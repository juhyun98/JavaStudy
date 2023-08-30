package ex02if_else;

import java.util.Scanner;

public class Ex02정보처리기사 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int DB = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int CAL = sc.nextInt();
		System.out.print("OS : ");
		int OS = sc.nextInt();
		System.out.print("데이터통신 : ");
		int DATA = sc.nextInt();
		System.out.print("소프트웨어 공학 : ");
		int SOFT = sc.nextInt();
		
		if (DB + CAL + OS + DATA + SOFT >= 60 && DB >= 8 && CAL >= 8 && OS >= 8 && DATA >= 8 && SOFT >= 8) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}
			sc.close();
		
		

	}

}
