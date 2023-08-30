package ex01while;

import java.util.Scanner;

public class Ex03다이어트 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("현재몸무게 : ");
//		int kg = sc.nextInt();
//		System.out.print("목표몸무게 : ");
//		int gokg = sc.nextInt();
//		
//		int week = 1;
//		while(kg - gokg >= 0) {
//			System.out.print(week + "주차 감량 몸무게 : ");
//			week++;
//			int diet = sc.nextInt();
//			kg -= diet;
//			if(kg <= gokg) {
//				System.out.println(kg + "kg 달성!! 축하합니다!");
//				break;
//			}
//		}sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int nowKg = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goalKg = sc.nextInt();
		
		int cnt = 1; // 주차를 기록할 변수
		while(nowKg > goalKg) {
			int minus = 0;
			System.out.print(cnt + "주차 감량 몸무게 : ");
			minus = sc.nextInt();
			cnt++;
			// nowKg = nowKg - minus;
			nowKg -= minus;
			
		}
		
		System.out.println(nowKg + "kg 달성!! 축하합니다!");
		
		sc.close();
		
	}

}
