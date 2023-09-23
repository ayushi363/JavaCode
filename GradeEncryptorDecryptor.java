//write a java program to encrypt a grade by adding 8 to it . decrypt it to show the correct grade.
import java.util.Scanner;

public class GradeEncryptorDecryptor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //check whether a given number is greater than the user entered number or not
        System.out.print("Enter the number: ");
        int enteredNumber = scanner.nextInt();
        if (enteredNumber >= 100) {
            System.out.println("Invalid number");
        }else{
            System.out.println("Valid number");
        }

        System.out.print("Enter the grade to encrypt: ");
        int gradeToEncrypt = scanner.nextInt();

        // Encrypt the grade by adding 8 to it
        int encryptedGrade = encrypt(gradeToEncrypt);

        System.out.println("Encrypted grade: " + encryptedGrade);

        // Decrypt the grade to show the correct grade
        int decryptedGrade = decrypt(encryptedGrade);

        System.out.println("Decrypted grade: " + decryptedGrade);

        scanner.close();
    }

    // Method to encrypt a grade by adding 8 to it
    public static int encrypt(int grade) {
        return grade + 8;
    }

    // Method to decrypt an encrypted grade to get the correct grade
    public static int decrypt(int encryptedGrade) {
        return encryptedGrade - 8;
    }
}


