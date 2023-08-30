package 월급계산프로그램;

public class RegularEmployee extends Employee{
	
	

	int bonus;   // 보너스
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		// 상속 관계에서 부모클래스가 생성자를 가지고 있으면
		// 반드시 자식클래스에서도 생성자가 있어야한다.
		super(empno, name, pay);
		// 부모클래스 ---> 수퍼클래스
		// super : 부모클래스를 지칭하는 키워드
		// super() : 부모클래스의 생성자를 지칭하는 키워드
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {		
		return (pay + bonus) / 12;
	}
	
	
	

	
	

}
