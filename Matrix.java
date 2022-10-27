public class Matrix{

    public static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
	  {
	    // length returns number of rows
	    for (int j = 0; j < matrix[i].length; j++)
	    {
		System.out.print( matrix[i][j]  + "\t");
	     }
	     System.out.println();
	   }
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1,2,3,4 },
					 { 5,6,7,8},
					 { 9,10,11,12},
					 { 13,14,15,16} };
		printMatrix(matrix);
	}
}
