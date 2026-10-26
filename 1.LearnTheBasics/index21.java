public class index21{
    public static void printntime(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Prince Raj!");
        printntime(i+1, n);
    }
    public static void main(String[] args){
        int n = 18;
        printntime(1, n);
    }
}