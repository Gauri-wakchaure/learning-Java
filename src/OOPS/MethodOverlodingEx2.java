package OOPS;

class SearchService
{
   public void search(String name)
   {
	   System.out.println("Searching by name : "+name);
   }
   
   public void search(int id)
   {
	   System.out.println("Searching by ID : "+id);
   }
   
   public void search(String name, String City)
   {
	   System.out.println("Searching by name and City :"+name +" "+City);
   }
}

public class MethodOverlodingEx2 {

	public static void main(String[] args) {
		SearchService s = new SearchService();
		s.search("Tab");
		s.search(12345);
		s.search("T-shirt", "Delhi");
		
	}

}
