import java.util.Scanner;
public class IncomeTax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income:");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
            System.out.println("No tax on Income below 5 lakhs");
        }

        else if(income >= 500000 && income <= 1000000){
            tax = (int) (income * 0.2);
            System.out.println("20% tax");

        }

        else{
            tax = (int) (income * 0.3);
            System.out.println("30% tax");
        }
        sc.close();

        System.out.println("ypur tax is:" + tax);
    }
}