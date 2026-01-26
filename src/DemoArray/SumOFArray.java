package DemoArray;

public class SumOFArray {

	public static void main(String[] args) {
            int arr[] = {10, 35, 24, 47, 90};
            int sum = 0;
            
            for(int i=0; i<arr.length; i++)
            {
            	System.out.println(arr[i]);
            	sum = sum+arr[i];

            }
            System.out.println("Sum of the Array is :" + sum);
            
	}

}
