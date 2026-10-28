public class index119 {

    public static int maxDepth(String s) {

        int depth = 0;
        int maximumDepth = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                depth++;
                maximumDepth = Math.max(maximumDepth, depth);

            } else if (c == ')') {
                depth--;
            }
        }

        return maximumDepth;
    }

    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";

        int result = maxDepth(s);

        System.out.println("String: " + s);
        System.out.println("Maximum Depth: " + result);
    }
}