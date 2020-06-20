import java.util.Scanner;
import java.lang.Math.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int x=in.nextInt();
      switch(x){
        case 1:
          	int s=in.nextInt();
          	System.out.println(s*s);
        	break;
        case 2: 
          	System.out.println("2");
          	int l = in.nextInt();
          	int b = in.nextInt();
          	System.out.println(l*b);
        	break;
        case 3:
         // System.out.println("3");
          	int ba = in.nextInt();
          	int h = in.nextInt();
          	System.out.println(0.5*h*ba);
        	break;
        case 4:
         // System.out.println("4");
          	int r=in.nextInt();
          	System.out.println(3.14*r*r);
         	 break;
          	
      }
    }
}