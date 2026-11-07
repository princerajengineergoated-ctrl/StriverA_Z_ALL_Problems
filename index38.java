public class index38{
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        String original = Integer.toString(x);
        String reverse= new StringBuilder(original).reverse().toString();
        return reverse.equals(original);

    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(99121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1281));

    }
}