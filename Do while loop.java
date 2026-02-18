import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int storedStudentNumber = 171511; // replace with your student number
        String storedPassword = "Abdura123";

        int studentNumber;
        String password;

        do {
            System.out.print("Enter student number: ");
            studentNumber = input.nextInt();

            System.out.print("Enter password: ");
            password = input.next();

        } while (studentNumber != storedStudentNumber || !password.equals(storedPassword));

        System.out.println("Access Granted");

        input.close();
    }
}
