public class index23{
    public static void Print1toN(int n){
        if(n==0){
            return;
        }
        System.out.println(n+" ");
        Print1toN(n-1);
        
    }
    public static void main(String[] args){
        Print1toN(53);
    }
}