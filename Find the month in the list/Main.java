import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	ArrayList ar = new ArrayList();
    	String[] arr = (br.readLine()).split(",");
    	String comp= br.readLine();
    	int s = arr.length;
      System.out.print("[");
    	 for (int i = 0; i < arr.length; i++) {
             System.out.print( arr[i]  );
           ar.add(arr[i]);
           	if(i<arr.length-1){
              System.out.print(  ", " );
            }
         }
      System.out.println("]");
      	//System.out.println(arr);
    	System.out.println("Size of the linked list: "+s);
      System.out.println("Is LinkedList empty? "+ar.isEmpty());
       System.out.println("Does LinkedList contains "+comp +"?");
       System.out.println(ar.contains(comp));
    }
}