public class Main {
    public static void main(String[] args) {

        int[] responses = {5, 4, 3, 5, 2, 1, 4, 5, 3, 2,
                1, 5, 4, 3, 2, 5, 5, 1, 4, 3,
                2, 1, 5, 4, 3, 2, 5, 1, 4, 3,
                2, 5, 4, 1, 3, 2, 5, 4, 3, 1,
                2, 5, 4, 3, 1, 5, 2, 4, 3, 5};

        int[] freq = new int[6];

        // Count
        for (int rating : responses) {
            freq[rating]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Rating " + i + ": " + freq[i]);
        }
    }
}
