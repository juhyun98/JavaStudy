package 월급계산프로그램;

public abstract class Employee {
	
	// Employee클래스 일반 클래스
	// 1) 추상 메서드를 포함하고 있는 클래스는 반드시 추상 클래스가 되어야한다!
	// 2) 추상 클래스도 일반 메서드 포함할 수 있다!
	// 3) 추상 클래스이지만 추상 메서드가 없을 수도 있다!
	// + 방법 : public abstarct class Employee
	// 4) 추상클래스는 객체 생성(실체화)가 불가능하다!
	// 개념적인 존재이기 때문에 / 공통적인 특징만을 모아놓은 추상적인 개념
	
	
	// Regular/PartTime/TempEmployee가
	// 가지고 있는 공통적인 필드, 메서드가 있음
	
	// Regular/PartTime/TempEmployee가
	// Employee클래스를 상속받을 예정!!!
	
	// private : 데이터 보호에는 좋아요
	// ---> 클래스 내부에 설계되어있는 메서드를 통해서만 접근이 가능하도록 도와준다.
	
	// protected : 상속 관계에 있는 클래스들 끼리 + 같은 패키지에 있는 클래스 들 끼리는
	// 접근이 가능하도록 도와주는 접근제한자.
	
	
	protected String empno; // 사번
	protected String name;  // 이름
	protected int pay;     // 연봉
	
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
    // return 0;
	// 부모 클래스에 있는 getMoneyPay는 자식클래스에서 매번 구현단이 (바디가) 바뀌는 중
	public abstract int getMoneyPay() ;
		// abstract 키뤄드를 통해서 일반메서드를 추상메서드로 만들수있다
		// 추상메서드 : 선언만 되어있고, 바디가 없는 ({}중괄호) 메서드 이다!
		
		
		
		
	
	
	public String print() {
		return this.empno + " : " + this.name + " : " + this.pay;
		
		
	}
	

}
