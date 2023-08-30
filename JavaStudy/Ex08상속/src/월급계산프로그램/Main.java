package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		
		TempEmployee e1 = new TempEmployee("SMHRD001", "박문수", 3000);
		System.out.println(e1.print());
		System.out.println(e1.getMoneyPay() + "만원");
		
		RegularEmployee r1 = new RegularEmployee("SMHRD002", "홍길동", 4000, 400);
		System.out.println(r1.print());
		System.out.println(r1.getMoneyPay() + "만원");
		
		PartTimeEmployee p1 = new PartTimeEmployee("SMHRD003", "김장독", 10, 10);
		System.out.println(p1.print());
		System.out.println(p1.getMoneyPay() + "만원");
		
		// Employee를 객체로 생성하자
		//Employee emp = new Employee("SMHRD004", "조자연", 500);	
		
				
	}

}
