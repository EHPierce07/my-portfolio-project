public class BigOExamples {

    public static int getFirst(int[] numbers) {
        return numbers[0];
    }

    public static int binarySearch(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int findLargest(int[] numbers) {

        int largest = numbers[0];

        for (int number : numbers) {

            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void mergeSort(int[] numbers, int left, int right) {

        if (left < right) {

            int middle = (left + right) / 2;

            mergeSort(numbers, left, middle);
            mergeSort(numbers, middle + 1, right);

            merge(numbers, left, middle, right);
        }
    }

    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void merge(int[] numbers, int left,
                             int middle, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {

            if (numbers[i] <= numbers[j]) {
                temp[k++] = numbers[i++];
            } else {
                temp[k++] = numbers[j++];
            }
        }

        while (i <= middle) {
            temp[k++] = numbers[i++];
        }

        while (j <= right) {
            temp[k++] = numbers[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            numbers[left + x] = temp[x];
        }
    }

    public static void printPairs(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                System.out.println(
                    numbers[i] + " - " + numbers[j]
                );
            }
        }
    }

    public static void printTriples(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                for (int k = 0; k < numbers.length; k++) {

                    System.out.println(
                        numbers[i] + ", "
                        + numbers[j] + ", "
                        + numbers[k]
                    );
                }
            }
        }
    }

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void permutations(String word, String result) {

        if (word.length() == 0) {

            System.out.println(result);
            return;
        }

        for (int i = 0; i < word.length(); i++) {

            char current = word.charAt(i);

            String remaining =
                word.substring(0, i)
                + word.substring(i + 1);

            permutations(
                remaining,
                result + current
            );
        }
    }

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("===== BIG O NOTATIONS =====");

        System.out.println("\nO(1) - Constant");
        System.out.println("First element: " + getFirst(numbers));

        System.out.println("\nO(log n) - Logarithmic");

        int[] sortedNumbers = {
            10, 20, 30, 40, 50
        };

        System.out.println(
            "Position of 30: "
            + binarySearch(sortedNumbers, 30)
        );

        System.out.println("\nO(n) - Linear");

        System.out.println(
            "Largest number: "
            + findLargest(numbers)
        );

        System.out.println("\nO(n log n) - Linearithmic");

        int[] unsorted = {
            50, 20, 40, 10, 30
        };

        mergeSort(
            unsorted,
            0,
            unsorted.length - 1
        );

        System.out.print("Sorted array: ");

        for (int number : unsorted) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("\nO(n²) - Quadratic");

        int[] smallNumbers = {
            1, 2, 3
        };

        printPairs(smallNumbers);

        System.out.println("\nO(n³) - Cubic");

        int[] tinyNumbers = {
            1, 2
        };

        printTriples(tinyNumbers);

        System.out.println("\nO(2ⁿ) - Exponential");

        System.out.println(
            "Fibonacci result: "
            + fibonacci(6)
        );

        System.out.println("\nO(n!) - Factorial");

        System.out.println("Permutations of ABC:");

        permutations("ABC", "");
    }
}