//Find Tax based on salary
import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = input.nextInt();
        if(income > 0 && income < 250000 ){
            System.out.println("No tax for this income");
        }else if (income >= 250000 && income < 500000){
            System.out.println("Tax for this income is" + (income * 0.05));
        }else if (income >= 500000 && income < 1000000){
            System.out.println("Tax for this income is" + (income * 0.2));
        }else if(income >= 1000000){
            System.out.println("Tax for this income is" + (income * 0.3));
        } 

        input.close();
    }
    
}
