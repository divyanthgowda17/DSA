import java.util.Scanner;

public class PassFail {
   public PassFail() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter marks:");
      int var2 = var1.nextInt();
      String var3 = var2 > 35 ? "PASS" : "FAIL";
      System.out.println(var3);
      var1.close();
   }
}