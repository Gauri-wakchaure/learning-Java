package testarray;

public class JaggedTest {

	public static void main(String[] args) {
 
		int a[][]= {{2, 4, 5, 6}, {5, 9}, {7, 3, 2, 1}};
		
		for (int i=0; i<a.length; i++)
		{ 
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
