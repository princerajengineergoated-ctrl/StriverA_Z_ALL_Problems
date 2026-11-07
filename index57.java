public class index57 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        System.out.println("Original Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];

                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("\nSorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}