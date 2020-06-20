import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int a1[][] = new int[r1][c1];
      int a2[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a1[i][j] = in.nextInt();
            }
        }
                for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a2[i][j] = in.nextInt();
            }
        }
      int k=0;
              for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                if( a1[i][j] != a2[i][j])
                {
                  k=1;
                }
            }
        }
      if(k==0)
      {
        System.out.print("Yes");
      }
      else
         {
        System.out.print("No");
      }
    }
   
}