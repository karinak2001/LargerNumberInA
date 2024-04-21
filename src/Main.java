import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number (A): ");
        int A = scanner.nextInt();


        System.out.println("Enter a number (B): ");
        int B = scanner.nextInt();


        if (B > A) {
            int temp = A;
            A = B;
            B = temp;
            System.out.println("The numbers are A = " + A + ",B =" + B);
        } else {
            System.out.println("The numbers are A = " + A + ",B =" + B);
        }



    }
}