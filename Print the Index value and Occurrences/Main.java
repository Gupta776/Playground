import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    
       public static void main(String args[]) 
  { 
         Scanner in= new Scanner(System.in);
         String s1 = in.nextLine();
         String s2 = in.nextLine();
    Pattern pattern = Pattern.compile(s1);  // pattern class used to define the pattern
    Matcher m = pattern.matcher(s2); //matcher class used to find the match with the given pattern
  	int c=1;
     //    if( s1.toLowerCase().indexOf(s2.toLowerCase()) != -1){
    while (m.find()) {
      System.out.println("found: "+c+" : " + m.start() +" - " + (m.end())); 
         c=c+1;
       }
           
          if (c==1){
             System.out.println("The given word is not present in the string");
          }
         else{
           System.out.println(c-1);
         }
     //  }
  //else{
   //      System.out.println("The given word is not present in the string");
    //   }
 }
}