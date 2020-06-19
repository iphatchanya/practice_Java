import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean prime = true;
        System.out.print("Input number to check Prime Number : ");
        int number = scan.nextInt();
        int limit = (int) Math.sqrt(number);

        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(number + " is prime = " + prime);
    }
}