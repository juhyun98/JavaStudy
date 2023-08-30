package 이차원배열;

public class ex06실습문제 {

	public static void main(String[] args) {

//		21	22	23	24	25	
//		30	29	28	27	26	
//		31	32	33	34	35	
//		40	39	38	37	36	
//		41	42	43	44	45	
		
		int[][] arr = new int[5][5];
		int num = 21;
		
		for (int j = 0; j < 5; j++) {
			// j : 0 1 2 3 4
			// j가 2로 나눴을 때 나머지가 1인지 0인지
			if (j % 2 == 1) {
				// 4 ~ 0 , -1
				for (int i = 4; i >= 0; i--) {
					arr[j][i] = num;
					num++;
				}
			}else {
				// 0 ~ 4 , +1
				for (int i = 0; i < 5; i++) {
					arr[j][i] = num;
					num++;
				}
			}
		}
		
		// 출력부
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
			}System.out.println();
		}
		
		
		// 21 ~ 25
//		for (int i = 0; i < 5; i++) {
//			arr[0][i] = num;
//			num++;
//		}
		
		// 26 ~ 30
		// 14 13 12 11 10
//		for (int i = 4; i >= 0; i--) {
//			arr[1][i] = num;
//			num++;
//		}
		
		
		
		

	}

}
