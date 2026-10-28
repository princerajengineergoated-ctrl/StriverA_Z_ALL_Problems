
public class index112 {

    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        // Reverse the words array
        while (left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        // Build the final answer
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            ans.append(words[i]);

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "the sky is blue";

        String result = reverseWords(s);

        System.out.println("Original: " + s);
        System.out.println("Reversed: " + result);
    }
}