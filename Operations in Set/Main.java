import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashSet<String> ar = new LinkedHashSet<String>();
		String[] arr = (br.readLine()).split(",");
       for (int i = 0; i < arr.length; i++) {
           ar.add(arr[i]);
       }
         System.out.println(ar);
      String d =br.readLine();
  		System.out.println("Enter the value to be deleted: "+d);
  		  boolean app=ar.remove(d);
  		System.out.println(ar);
      String ss=br.readLine();
       System.out.println("Enter the value to be added: "+ss);
      ar.add(ss);
      System.out.println(ar);
    }
}