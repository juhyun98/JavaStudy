package 이차원배열;

public class ex05예제 {

	public static void main(String[] args) {
		
		
//		45	40	35	30	25	
//		44	39	34	29	24	
//		43	38	33	28	23	
//		42	37	32	27	22	
//		41	36	31	26	21	

		int[][] arr = new int[5][5];
		int num = 21; // 21 ~ 45
		
		// 21~ 25
		// 44 34 24 14 04
		
		// 입력부
		for (int j =4; j >= 0; j--) {
			// i 4 3 2 1 0 : 5번
			for (int i = 4; i >= 0; i--) {
				arr[i][j] = num;
				num++;
			}
		}
		
		// 출력부
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
			}System.out.println();
		}
		
		
//		for (int i = 4; i >= 0; i--) {
//			// i 4 3 2 1 0 : 5번
//			arr[i][4] = num;
//			num++;
//		}
		

	}

}
