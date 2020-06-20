import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       TreeMap map = new TreeMap();     
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int x = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of values to be inserted in map:"+x);
      for(int i=0;i<x;i++){
      	String k=br.readLine();
        String v=br.readLine();
        map.put(k,v);
      }
      System.out.println(map);
      String r=br.readLine();
      System.out.println("Enter the index to be removed:"+r);
      map.remove(r);
      System.out.println(map);
      String a1=br.readLine();
      System.out.println("Enter the index to insert:"+a1);
      String a2=br.readLine();
      System.out.println("Enter the value to be inserted:"+a2);
      map.put(a1,a2);
       System.out.println(map);
    }
}