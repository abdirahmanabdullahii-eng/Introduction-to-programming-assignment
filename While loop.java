import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int counter = 1;

        while (counter <= number) {
            System.out.println(counter);
            counter++;
        }

        input.close();
    }
}
