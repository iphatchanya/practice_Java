import java.util.Scanner;

public class Timetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input : ");
        int num = scan.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " * " + num + " = " + (i * num));
        }
    }
}
