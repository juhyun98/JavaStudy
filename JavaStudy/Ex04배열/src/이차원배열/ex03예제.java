package 이차원배열;

public class ex03예제 {

	public static void main(String[] args) {
		
//		int[][] arr = new int[5][5];
//		int num = 21;
//		
//		for (int i = 0; i < 5; i++) {			
//			for (int j = 0; j <5; j++) {
//				arr[j][i] = num;
//				num++;
//			}			
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + " ");
//			}System.out.println();
		
		// 21 26 31 36 41 
     	// 22 27 32 37 42 
		// 23 28 33 38 43 
		// 24 29 34 39 44 
		// 25 30 35 40 45 
			
		int[][] arr = new int[5][5];
		int num = 21;
		
//		// 21 ~ 45가 입력되는 방향으로 데이터를 대입 : 입력부
//		for (int i = 0; i < 5; i++) {
//			// i 0 1 2 3 4
//			// 앞에있는 인덱스 값이 0 1 2 3 4
//			arr[i][0] = num;
//			// num은 +1
//			num++;
//		}
		
		for (int j = 0; j < 5; j++) {
			// j: 0 1 2 3 4 -> 5번
			// 00 10 20 30 40
			for (int i = 0; i < 5; i++) {
				// i 0 1 2 3 4
				// 앞에있는 인덱스 값이 0 1 2 3 4
				arr[i][j] = num;
				// num은 +1
				num++; 
			}
		}	

		// 출력부
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
				
			}System.out.println();
		}
		
		
		
		
		
		

	}

}
//}