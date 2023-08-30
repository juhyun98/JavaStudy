package ex01while;

public class Ex02홀수만출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 홀수만 출력하시오
		// while문을 사용할 것
	
		int num = 1;
		
		while(num <= 100) {
			if(num % 2 == 1) {
				System.out.println(num);
			}
			num++;
//		int num = 1;
//		
//		while(true) {
//			num++;
//			if(num % 2 == 1) {
//				System.out.println(num);
//				
//			}
//			if(num == 100) {
//				break;
//			}
//			if(num >= 100) {
//				break;
//			}
//		while (num <= 100) {
//			System.out.println(num);
//			num += 2;
//		}
	}		
	}

}
