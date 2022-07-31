
public class mnogomernymassive {
	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		int[][] matrix = {{1,2,3},
						  {4,4,5},           // двумерные массивы
						  {7,8,9}};
		System.out.println(matrix[2][1]);
		System.out.println(matrix[1][0]);
		String[][] str = new String [2][3];
		for (int i = 0; i < matrix.length; i++) {
			for(int x = 0; x < matrix[i].length; x++) {
				System.out.print(matrix[i][x] + " ");
			}
		System.out.println();
		}
	}
	}
