import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Input value of Base : ");
        float Base = scan.nextFloat();

        System.out.print(" Input value of Height : ");
        float Height = scan.nextFloat();

        System.out.printf(" Area of a Triangle is %.2f", 0.5 * Base * Height);

        scan.close();
    }

}

