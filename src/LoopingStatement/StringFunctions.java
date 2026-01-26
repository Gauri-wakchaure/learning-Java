package LoopingStatement;

public class StringFunctions {

	public static void main(String[] args) {
      String str1 = "Java Programming";
      String str2 = new String ("AdVanCed Java");
      String str3 = "Java programming";
      
      System.out.println(str1);
      System.out.println(str2);
      
      // Concatination using + operator
      String result = str1+" "+str2;
      System.out.println(result);
      
      // length
      int len = str1.length();
      System.out.println("Length of String :"+len);
      
      // any one character
      System.out.println("one charecter visible :"+str1.charAt(6));
      
      // substring
      System.out.println("Sub String :"+str1.substring(5));
      
      System.out.println("Substring2 :"+str2.substring(2,7));
      
      // uppercase
      System.out.println("uppercase :"+str1.toUpperCase());
      
      //lowercase
      System.out.println("lowercase :"+str2.toLowerCase());
      
      // check contain in string
      System.out.println("contain is :"+str1.contains("pro"));
      
      System.out.println("contain is :"+str1.contains("Pro"));
      
      // check indexing value
      System.out.println("element of :"+str1.indexOf('o'));
      
      //replace the string
      System.out.println("Replace :"+str1.replace('v', 'w'));
      
      System.out.println("Replace :"+str1.replace("Java", "Python"));
      
      //check equality
      System.out.println("check strings are equal or not :"+str1.equals(str2));
      
      System.out.println("check strings are equal or not same character :"+str1.equals(str3));
      
      System.out.println("equal ignore case :"+str1.equalsIgnoreCase(str3));
      
      System.out.println("string3 :"+str3);
      System.out.println("trim string :"+str3.trim());
      
      //reverse string
      StringBuilder s = new StringBuilder(str1);
      System.out.println("Reverse String:"+s.reverse());
      
      String rev ="";
      for(int i=str2.length()-1;i>=0; i--)
      {
    	  rev = rev+str2.charAt(i);
    	  System.out.print(str2.charAt(i));
      }
     
      System.out.println();
      System.out.println(str2.concat(str3));
      
      StringBuilder s1 = new StringBuilder(str1);
      //System.out.println(s1.append(str2));
      
      System.out.println(s1.append(" Language"));

      

	}

}
