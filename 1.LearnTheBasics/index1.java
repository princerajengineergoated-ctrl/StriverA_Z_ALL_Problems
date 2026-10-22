import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class index1{
    public static void main(String[] args) throws IOException{
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your principle , year of interest , interst");
        // float principle = scanner.nextFloat();

        // int yoi = scanner.nextInt();
        // float interest = scanner.nextFloat();
        // float simple_interest = (principle*yoi*interest)/100;
        // System.out.println("Your simple interest is "+ simple_interest);



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println(name);
    }}