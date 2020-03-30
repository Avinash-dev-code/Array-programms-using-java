import java.util.Scanner;

class AdditionOfTwoMatrix
{
      public static void main(String[] args) {
          System.out.println("Enter a number of Matrix:");
        
          Scanner sc=new Scanner(System.in);
          int rows=sc.nextInt();
          int cols=sc.nextInt();
          int a[][]=new int[rows][cols];
          int b[][]=new int[rows][cols];
          System.out.println("Enter a data of first matrix:");
          for(int i=0;i<rows;i++)
          {
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();

            }  
          }
          System.out.println("Enter a data of Second matrix:");

          for(int i=0;i<rows;i++)
          {
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();

            }  
          }
          System.out.println("\n");
          
          int c[][]=new int[rows][cols];
          for(int i=0;i<rows;i++)
          {
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
                

                  System.out.print(c[i][j]+" ");
            }  
        
            
          }
          
          





      }


}