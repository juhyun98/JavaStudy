package ex02연산자;

import java.util.Scanner;

public class Ex03시분초구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3723 -> 1시 2분 3초
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");
	    int totalSecond = sc.nextInt();
	    int second = totalSecond % 60; 
	    int min = totalSecond % 3600 / 60;
		int hour = totalSecond / 3600;
		System.out.println(hour + "시 " + min + "분 " + second + "초");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
