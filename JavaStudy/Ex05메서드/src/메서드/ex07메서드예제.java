package 메서드;

public class ex07메서드예제 {

	public static void main(String[] args) {
		
		// 완전수 구하기
		// : 나를 제외한 약수의 합이 나와 같은 수
		// 6의 약수 : 1 + 2 + 3 == 6
		
		// 1단계) 약수인지 아닌지 확인해주는 메서드 만들기
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		
		// is라는 키워드가 붙은 메서드는 리턴타입이 boolean이다.
		
		// 2단계) 약수의 종류가 출력되는 메서드
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
		// 3단계) 약수의 합
		int num = 20;
		int result = getSumOfDivisors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		
		getDivisor(num);
		
		// 4단계) 완전체인지 아닌지를 판단해주는 메서드 isPerfectNumber
		int num3 = 369;
		
		boolean result2 = isPerfectNumber(num3);
		System.out.println("완전수인가요? : " + result2);
		// + 완전수
		// : 자기자신을 제외한 약수들의 합이 자기자신과 같은 수
		// ex) 28의 약수 : 1 2 4 7 14 = 28
		
		// 5단계)
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
		
	}
	
	// 1. isDivisor() : 약수인지 아닌지 판단해서 true/false를 돌려주는 메서드
	// 약수 : 자기 자신을 나누어 떨어지게 하는 수
	public static boolean isDivisor(int num1, int num2) {
		if ( num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
	}
		
	// 2. getDivisor : 전달 받은 하나의 숫자에 대해 모든 약수를 출력하는 메서드
	public static void getDivisor(int num1) {
		System.out.print(num1 + "의 약수 : ");
		for (int i = 1; i <= num1; i++) {
			if ( num1 % i == 0) {
				System.out.print(i + " ");
		//  if(isDivisor(num, i)) {
				
			}else {
				
			}
		}System.out.println();
	} 
	
	// 3. getSumOfDivisors() : 
	public static int getSumOfDivisors(int num) {
		// num의 약수들의 합
		// 1) num을 나누어 떨어지게 하는 수를 판단
		// 2) true라면, 약수 값을 누적
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
			
		}return sum;
	}
	
	// 4. isPerfectNumber : 완전수인지 아닌지 판단해서 true/false를 돌려주는 메서드
	public static boolean isPerfectNumber(int num) {
		if (getSumOfDivisors(num) - num == num) {
			return true;
		}else {
			return false;
		}
	}
	
	// 5. getPerfectNumber : 
	public static void getPerfectNumber(int num1, int num2) {
		System.out.print("2~1000까지의 완전수 : ");
		for (int i = num1; i <= num2; i++) {
			if (isPerfectNumber(i) == true) {
				System.out.print(i + " ");
			}
		}
	
	}
	
	
	
	
}
