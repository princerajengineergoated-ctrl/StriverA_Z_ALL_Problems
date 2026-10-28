public class index116 {

    public static boolean rotateString(String s, String goal) {

        // If lengths are different, rotation is impossible
        if (s.length() != goal.length()) {
            return false;
        }

        // Check whether goal exists inside s + s
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        boolean result = rotateString(s, goal);

        System.out.println("s = " + s);
        System.out.println("goal = " + goal);
        System.out.println("Can rotate? " + result);
    }
}