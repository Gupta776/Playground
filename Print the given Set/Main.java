import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set ar = new LinkedHashSet();
		String[] arr = (br.readLine()).split(",");
       for (int i = 0; i < arr.length; i++) {
           ar.add(arr[i]);
       }
         System.out.println(ar);
         }
    }
