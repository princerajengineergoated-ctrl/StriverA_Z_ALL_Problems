public class index59{
    public static int[] rearrangeArray(int[] nums) {
        
        
        int[] ans = new int[nums.length];

        int pos = 0;
        int neg = 1;

        for (int x : nums) {

            if (x > 0) {
                ans[pos] = x;
                pos += 2;
            } 
            else {
                ans[neg] = x;
                neg += 2;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] nums = {3,1,-2,-5,2,-4};
        int[] arr = rearrangeArray(nums);
        for(int x:arr){
            System.out.println(x);
        }
    }
}