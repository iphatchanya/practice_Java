import java.util.Scanner;

public class FindMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        double sum = 0;

        for (int i = 0; i < num; i++) {
            sum += scan.nextInt();
        }
        System.out.println("Mean = " + sum/num);
    }
}
