import java.util.*;
  
public class AnyBaseAddition {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("What is the base of the given numbers? -> ");
      int b = scn.nextInt();
      System.out.print("Enter the 1st number : ");
      int n1 = scn.nextInt();
      System.out.print("Enter the 2nd number : ");
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);

      scn.close();
   }
  
   public static int getSum(int b, int n1, int n2){
       int rv = 0;
  
       int c = 0;
       int p = 1;
       while(n1 > 0 || n2 > 0 || c > 0){
          int d1 = n1 % 10;
          int d2 = n2 % 10;
          n1 = n1 / 10;
          n2 = n2 / 10;
  
          int d = d1 + d2 + c;
          c = d / b;
          d = d % b;
  
          rv += d * p;
          p = p * 10;
       }
       System.out.print("The adiition to these number is : ");
       return rv;
   }
  }


    

