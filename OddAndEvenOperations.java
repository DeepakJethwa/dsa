public class OddAndEvenOperations {

    static int[] OddAndEven(int arr[], int N) {
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            } else {
                arr[i] = arr[i] - 1;
            }

        }
        return arr;
    }
}