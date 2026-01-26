package DemoArray;

public class FindMinArray {

	public static void main(String[] args) {
       int arr[]= {30, 45, 23, 12, 584, 90, 124, 33, 10};
       int min=arr[0];
       
       for(int i=1; i<arr.length; i++)
       {
    	   if(arr[i]<min)
    	   {
    		   min = arr[i];
    	  }
       }
       System.out.println("Minimum Element in The Array :"+ min);
	}

}
