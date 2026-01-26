package DemoArray;

public class FindMaxArray {

	public static void main(String[] args) {
       int arr[]= {30, 45, 23, 12, 584, 90, 124, 33, 10};
       int max=arr[0];
       
       for(int i=1; i<arr.length; i++)
       {
    	   if(arr[i]>max)
    	   {
    		   max = arr[i];
    	  }
       }
       System.out.println("Maximum Element in The Array :"+ max);
	}

}
