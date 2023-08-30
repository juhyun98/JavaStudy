package 일차원배열;

import java.util.Scanner;

public class ex06배열예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		String[] mel = {"수" , "박"};
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				System.out.print(mel[0]);
			}else {
				System.out.print(mel[1]);
			}
		}sc.close();
		
		
		
		
		
		
		

	}

}
