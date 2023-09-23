import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();//AyushiGautam
        System.out.println(str.toUpperCase()); //AYUSHIGAUTAM
        System.out.println(str.toLowerCase()); //ayushigautam
        System.out.println(str.trim()); //AyushiGautam
        System.out.println(str.length());//12
        System.out.println(str.charAt(0));//A
        System.out.println(str.substring(0,2)); //Ay
        System.out.println(str.substring(2));//ushiGautam
        System.out.println(str.substring(2,4));//us
        //replace character
        System.out.println(str.replace('a','z'));//AyushiGzutzm
        //replace string
        System.out.println(str.replace("a","z"));//AyushiGzutzm
        //replace substring
        System.out.println(str.replace("a","z"));//AyushiGzutzm
        System.out.println(str.startsWith("ayu"));//return true if the substring starts with ayu //case sensitive //false
        System.out.println(str.endsWith("ayu"));//false
        System.out.println(str.contains("ayu"));//false
        System.out.println(str.indexOf("ayu"));//return -1 because this string is not available 
        System.out.println(str.lastIndexOf("ayu"));//return -1
        System.out.println(str.equals("ayu"));//false
        System.out.println(str.compareTo("ayu"));
        System.out.println(str.compareToIgnoreCase("ayu"));
        System.out.println(str.substring(2,4).compareToIgnoreCase("ayu"));
        System.out.println(str.equalsIgnoreCase("ayu"));
        input.close();

    }
}
