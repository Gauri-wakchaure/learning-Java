package innerclass;

public class InBlockInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int x =5;
		{
			class BlockLocal
			{
				public void show()
				{
					System.out.println("Value of x in Block :"+x);
				}
			}
			BlockLocal b = new BlockLocal();
			b.show();
		}
	}

}
