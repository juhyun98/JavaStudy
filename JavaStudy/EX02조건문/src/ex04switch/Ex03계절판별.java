package ex04switch;

import java.util.Scanner;

public class Ex03계절판별 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1 :
		case 2 :
		case 12 :
			System.out.println(num + "월은 겨울입니다!");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄 입니다.");
			break;
		case 6, 7, 8:
			System.out.println("여름 입니다.");
			break;
		case 9, 10, 11 :
			System.out.println("가을 입니다.");
			break;
		default:
			System.out.println(num + "월은 없습니다.");
		
		}
		sc.close();
		

	}

}
