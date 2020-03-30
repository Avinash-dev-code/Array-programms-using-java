import java.util.Scanner;

class AverageMarks
{
      public static void main(String[] args) {
          System.out.println("Enter the number of Student:");
          Scanner sc=new Scanner(System.in);
          int numberOfStudent=sc.nextInt();
          int n[]=new int[numberOfStudent];
          System.out.println("Enter a marks now:");
        
          for(int i=0;i<numberOfStudent;i++){
                n[i]=sc.nextInt();

          }
          int average=0;
          for(int i=0;i<numberOfStudent;i++){
              average+=n[i];
          }
           average/=numberOfStudent;
           System.out.println("the average marks is :"+average);


          
      }

}