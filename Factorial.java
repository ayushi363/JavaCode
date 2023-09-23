import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int n = Input.nextInt();
        int count = 1;

        for(int i = 1; i<=n ; i++){
            count = count*i;
        }
        System.out.println(count);
        Input.close();
    }
    
}
