import java.util.Scanner;

public class CountAEIOU {

    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your word.");
        word = scan.nextLine();
        System.out.println("Your word is " + word);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'A' || word.charAt(i) == 'a' ||
                    word.charAt(i) == 'E' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'I' || word.charAt(i) == 'i' ||
                    word.charAt(i) == 'O' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'U' || word.charAt(i) == 'u'
            ) {
                count++;
            }
        }
        System.out.println("Number of AEIOU = " + count);
    }
}