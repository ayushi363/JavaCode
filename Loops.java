//write a java program to find out whether a student is pass or fail ; if it requires total 40% and atleast 33% in each subject to pass . assume three subjects and take marks as an input
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
            int a = 11;
            if (a==11){
                System.out.println("I am 11");
            }else{
                System.out.println( "I am not 11");
            }
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Subject number");
            int subject1 = scanner.nextInt();

            System.out.println("Enter second Subject number");
            int subject2 = scanner.nextInt();

            System.out.println("Enter third Subject number");
            int subject3 = scanner.nextInt();

            int totalMarks = subject1 + subject2 + subject3;
            double percentage = (totalMarks/300.0)*100;

            boolean isPass = (percentage>=40) && (subject1>=33) && (subject2>=33) && (subject3>=33);
             if (isPass) {
                System.out.println("Student is Pass");
            } else {
                System.out.println("Student is Fail");
            }

            scanner.close();
        }
}
