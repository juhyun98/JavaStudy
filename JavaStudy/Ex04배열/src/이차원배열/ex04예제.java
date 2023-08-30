package 이차원배열;

public class ex04예제 {

	public static void main(String[] args) {
		
		
//		45	40	35	30	25	
//		44	39	34	29	24	
//		43	38	33	28	23	
//		42	37	32	27	22	
//		41	36	31	26	21	

		
		int[][] arr = new int[5][5];
		int num = 21;
		
		// 21 ~ 25
		// 04 03 02 01 00
		
		for( int j = 4; j >= 0; j--) {
			// i 4 3 2 1 0 --> 5번
			for (int i = 4; i >= 0; i--) {
				arr[i][j] = num;
				num++;
			}
		}	
		
		// 출력부
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "  ");
			}System.out.println();
		}
		
		
//		for (int i = 4; i >= 0; i--) {
//			// i 4 3 2 1 0 --> 5번
//			arr[0][i] = num;
//			num++;
//		}
//		// 26 ~ 30
//		// 14 13 12 11 10
//		for (int i = 4; i >= 0; i--) {
//			arr[1][i] = num;
//			num++;
//		}
		
		
		
		
		
	}

}
