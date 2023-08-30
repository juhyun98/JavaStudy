package 상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 상품 만들어보기
//		Product g1 = new Product();
//		g1.setName("만년필");
//		g1.setUnitPrice(150000);;
//		g1.setAmount(10);
		
//		System.out.println(g1.getName());
//		System.out.println(g1.getUnitPrice());
//		System.out.println(g1.getAmount());
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> list = new ArrayList<>();
		
		while (true) {
			System.out.print("[1]물건추가 [2]예상 판매량 조회 + [3]종료 >> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("물건 이름 : ");
				String name = sc.next();
				System.out.print("단가 : ");
				int unitPrice = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				
				Product g = new Product(name, unitPrice, amount);
				list.add(g);
				
				
			}else if (menu == 2) {
				
				System.out.println("제품명\t단가\t수량");
				int sum = 0;
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getName());
					System.out.print("\t");
					System.out.print(list.get(i).getUnitPrice());
					System.out.print("\t");
					System.out.print(list.get(i).getAmount());
					System.out.println();
					
					sum += list.get(i).getUnitPrice() * list.get(i).getAmount();
				}
				
				System.out.println("판매 시 매출 : " + sum + "원");
				
			}else if (menu == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}sc.close();
		
		
		
		
//		Product[] productList = new Product[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < productList.length; i++) {
//			System.out.println("[1]물건 추가" + "[2]예상 판매량 조회" + "[3]종료 >> ");
//			int num = sc.nextInt();
//			if (num == 3) {
//				System.out.println("프로그램 종료");
//				break;
//			}else if (num == 1) {
//				System.out.print("물건 이름 : ");
//				String name = sc.next();
//				System.out.print("단가 : ");
//				int price = sc.nextInt();
//				System.out.println("수량 : ");
//				int amount = sc.nextInt();
//				name = productList[i].getName();
//				price = productList[i].getUnitPrice();
//				amount = productList[i].getAmount();
//			}else if (num == 2) {
//				System.out.println("제품명  " + "  단가  " + "  수량");
//				System.out.println(productList[i]);
//				
//			}
//			
//		}
//		
//		
//		
//
	}

}
