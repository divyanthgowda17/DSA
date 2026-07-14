import java.util.Scanner;
public class Sum{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = (a+b);

    System.out.print("SUM ="+sum);
    sc.close();
    }
}