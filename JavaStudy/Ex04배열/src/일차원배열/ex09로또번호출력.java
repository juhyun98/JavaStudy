package 일차원배열;
import java.util.Random;
public class ex09로또번호출력 {

	public static void main(String[] args) {
		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!!");
		// 로또번호 출력하는데 단, 중복 값이 없어야한다!
		Random rand = new Random();
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(10)+1;			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
//		for (int i = 1; i < 6; i++) {
//			int ran = rand.nextInt(1, 11);
//			System.out.print(ran + " ");
//		}
		
		
		
		

	}
}
