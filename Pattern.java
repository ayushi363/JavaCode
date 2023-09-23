import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Pattern Row");
        int row = scanner.nextInt();

        System.out.println("Enter Pattern Column");
        int col = scanner.nextInt();

        for(int i=0; i<col; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }
    
}
