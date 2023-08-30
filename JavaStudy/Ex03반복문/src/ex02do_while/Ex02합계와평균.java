package ex02do_while;

import java.util.Scanner;

public class Ex02합계와평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 입력한 숫자를 누적할 변수
		int cnt = 0; // 누적한 횟수를 기록할 변수
		
		do {
			System.out.print("숫자를 입력하세요 >> ");
			int num = sc.nextInt();
			
			if (num > 100) {
				break;
			}
			
			sum += num;
			cnt++;
		}while (true);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / cnt);
		//System.out.println("평균 : " + sum * 1.0 / cnt);
	
		// 평균이 소수점 2자리까지만 나오는방법
//		double temp1 = sum / (double)cnt ;
//		int temp2 = (int)(temp1 * 100);
//		double result = temp2 / 100.0;
//		System.out.println("평균 : " + result);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}


}