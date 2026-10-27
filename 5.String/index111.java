public class index111{
    
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println(s);
        // StringBuilder sb = new StringBuilder();
        // sb.append("Hello");
        // sb.append("World");

        // for(int i = 0; i < 10; i++) {
        //     sb.append('a');
        // }
        //         System.out.println(sb);


        // 
        
        // String s = "123";
        // int x = Integer.parseInt(s);
        // System.out.println(x*3);
        // String s1 = String.valueOf(x);
        // System.out.println(s1);

        // String s = "banana";
        // int[] freq = new int[26];
        // for(int i =0; i< s.length();i++){
        //     char ch = s.charAt(i);
        //     freq[ch-'a']++;
        // }

        String s = "level";
        int left = 0;
        int right = s.length()-1;
        boolean palindrome= true;    
        while(left<right){
            if(s.charAt(right)!= s.charAt(left)){
                palindrome = false;
                break; 
            }
            left++;
            right--;
        }
        

        System.out.println(palindrome);
    }
}