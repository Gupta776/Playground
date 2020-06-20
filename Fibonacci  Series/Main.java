import java.util.*;
import java.io.*;
import java.lang.*;

class Fibonacci extends Thread
{
  // type your code here
    public void run() 
  { 
     BufferedReader bf=new BufferedReader( new InputStreamReader(System.in));
  int a=0,b=1,c=0,i,m=0; 
   try
 {
  
//System.out.println("Enter the number upto which fibonacci series is displayed");
  m=Integer.parseInt(bf.readLine());
  System.out.println("Enter the limit for Fibonacci: "+m);
  if(m <= 0) {
	  System.out.println("Exception occurred ");
	  //throw excetin;
  }else {
  	System.out.print("The Fibonacci series is :"); 
	  System.out.print(a+" ");  
      System.out.print(b+" "); 
   for(i=1;i<m-1;i++)   
{   
  c=a+b;   
  System.out.print(c+ " ");   
   a=b;   
  b=c;   
}   
  }
 }
 catch(Exception e)
 {
   e.printStackTrace();
 }
        
  } 
}
class Main
{
    public static void main(String[] args)  
  { 
    Fibonacci thread = new Fibonacci(); 
    thread.start(); // intiates the thread
    thread.interrupt(); //if the thread is in sleeping state, it breaks it's state by raising an exception
  } 
}