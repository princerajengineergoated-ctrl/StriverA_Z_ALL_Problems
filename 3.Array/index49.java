import java.util.Scanner;

public class index49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 1) {
                count++;

                if (count > max) {
                    max = count;
                }
            } 
            else {
                count = 0;
            }
        }

        System.out.println("Maximum consecutive 1s = " + max);

        sc.close();
    }
}