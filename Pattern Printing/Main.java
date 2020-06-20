import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int r =in.nextInt();
      int c =in.nextInt();
      int i,z;
      int[][] a =new int[r][c]; 
for(i=0;i<r;i++) //assign 
{ 
  for(z=0;z<c;z++) 
  { 
   if(z>=i)a[i][z]=(r-i); 
   if(z<i)a[i][z] =(c-z); 
  } 
} 

for(i=0;i<r;i++) //output 
{ 
  for(z=0;z<c;z++) 
  { 
   System.out.print(a[i][ z]); 
  } 
  System.out.printf("\n"); 
} 
    }
}