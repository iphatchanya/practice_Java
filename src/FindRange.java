public class FindRange {
    public static void main(String[] args) {
        int point[] = { 1, 2, 3, 4, 4, 3, 3, 3, 3, 1 };

        int max = point[0];
        int min = point[0];
        int range = 0;

        for (int i : point) {
            if(i >= max) {
                max = i;
            }
            if(i <= min) {
                min = i;
            }
        }

        range = max - min;
        System.out.println("Range = " + range);
    }
}
