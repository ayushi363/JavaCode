//Sum of n even numbers 
import java.util.Scanner;
public class SumOfEven {
    public static  void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = input.nextInt();
        int sum = 0;
        int i=0;
        while(i<=n){
            sum = sum + i;
            i+=2;
        }
        System.out.println(sum);
       
        input.close();
    }
    
}
