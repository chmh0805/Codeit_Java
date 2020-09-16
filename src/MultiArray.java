public class MultiArray {
	public static void main(String[] args) {
		int[][] multiArray = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		int[][] multiArray1 = new int[3][4];
		
		for (int i = 0; i < multiArray1[0].length; i++) {
			multiArray1[0][i] = 1 + i;
		}
		
		for (int i = 0; i < multiArray1[1].length; i++) {
			multiArray1[1][i] = 5 + i;
		}
		
		for (int i = 0; i < multiArray1[2].length; i++) {
			multiArray[2][i] = 9 + i;
		}
		
		
		int[][] multiArray2 = new int[3][4];
		
		for (int i = 0; i < multiArray2.length; i++) {
			for (int j = 0; j < multiArray2[i].length; j++) {
				multiArray2[i][j] = i * 4 + 1 + j;
			}
		}
		
		for (int i = 0; i < multiArray2.length; i++) {
			for (int j = 0; j < multiArray2[i].length; j++) {
				System.out.print(multiArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}