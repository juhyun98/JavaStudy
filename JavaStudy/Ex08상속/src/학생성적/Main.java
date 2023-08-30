package 학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> Student = new ArrayList<>();
		
		System.out.println("============학점 관리 프로그램============");
		
		while(true) {
			System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]프로그램 종료 >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.print("학번 : ");
				String number = sc.next();
				System.out.print("Java점수 : ");
				int scoreJava = sc.nextInt();
				System.out.print("Web점수 : ");
				int scoreWeb = sc.nextInt();
				System.out.print("Android점수 : ");
				int scoreAndroid = sc.nextInt();
				Student s = new Student(name, number, scoreJava, scoreWeb, scoreAndroid);
				
			}else if(num == 2) {
				
				
				if (Student.size() == 0) {
					System.out.println("조회 할 데이터가 없습니다.");
				}
				
				
			}else if(num == 3) {
				
				
			}else if(num == 4) {
				System.out.println("학점 관리 프로그램을 종료합니다");
				break;
				
			}
		}
		

	}

}
