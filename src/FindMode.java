public class FindMode {
    public static void main(String[] args) {
        int point[] = { 1, 2, 3, 4, 4, 3, 3, 3, 3, 1 };

        int maxValue = 0;
        int maxCount = 0;

        for (int i = 0; i < point.length; ++i) {
            int count = 0;
            for (int j = 0; j < point.length; ++j) {
                if (point[j] == point[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = point[i];
            }
        }
        System.out.println("Mode = " + maxValue);
    }
}
