import java.util.Scanner;

public class HeightChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in feet (e.g. 5.8): ");
        double height = input.nextDouble();

        if (height >= 6.0) {
            System.out.println("Tall");
        } else if (height >= 5.7 && height < 6.0) {
            System.out.println("Average");
        } else {
            System.out.println("Short");
        }

        input.close();
    }
}
