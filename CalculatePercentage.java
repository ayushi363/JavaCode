import java.util.Scanner;

public class CalculatePercentage{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);

        int d = 7;
        System.out.println((++d)*8);

        float g = (7/4*9/2);
        System.out.println(g);

        char a = 'B';
        System.out.println(++a);//returns C

        String formula = "X-Y/2";
        System.out.println(formula);

        System.out.println("Enter first subject marks:");
        int subject1 = s.nextInt();

        System.out.println("Enter second subject marks:");
        int subject2 = s.nextInt();

        System.out.println("Enter third subject marks:");
        int subject3 = s.nextInt();

        System.out.println("Enter fourth subject marks:");
        int subject4 = s.nextInt();

        System.out.println("Enter fifth subject marks:");
        int subject5 = s.nextInt();

        int sumOfSubject = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (sumOfSubject/5.0);

        System.out.println("Percentage is " + percentage + "%");

        s.close();


    }
    
};
