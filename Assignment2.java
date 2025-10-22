
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter message Here");
        String message = newScan.nextLine();

        for (int i = 1; i <= 5; i++) {
            printMessage(message);
        }
        newScan.close();

    }

    public static void printMessage(String message) {

        System.out.println(message);
    }

}
