public class index20{
    public static void printntime(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Hello World!");
        printntime(i+1, n);
    }
    public static void main(String[] args){
        int n = 18;
        printntime(1, n);
    }
}