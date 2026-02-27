import java.util.Scanner;

class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter 1st int value: ");
      int a = sc.nextInt();
      System.out.println("Enter 2nd int value: ");
      int b = sc.nextInt();

      System.out.println("Enter 1st double value: ");
      double c = sc.nextDouble();
      System.out.println("Enter 2nd double value: ");
      double d = sc.nextDouble();

      System.out.println("Enter boolean value: ");
      boolean e = sc.nextBoolean();

      if(e) {
         int prod = a * b;
         System.out.println("Product is: " + prod);
      } else {
         double div = c / d;
         System.out.println("Division is : " + div);
      }

      sc.close();
   }
}
