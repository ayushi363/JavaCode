//program to find out the type of website from url 
import java.util.Scanner;

public class TypeOfWeb {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Website URL:");
        String url = input.nextLine();

        if(url.endsWith(".com")){
            System.out.println("Commercial website URL");
        } else if(url.endsWith(".org")){
            System.out.println("Organisation website URL");
        } else if(url.endsWith(".in")){
            System.out.println("Indian website URL");
        }

        input.close();
    }
}
