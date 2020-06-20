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
                a2[j][i] = a1[i][j];
            }
        }
      for(int i = r1-1; i >=0; i--){
            for(int j = 0; j < c1; j++){
                System.out.print(a2[i][j] + " ");
            }
        System.out.println();
        }
    }}
      