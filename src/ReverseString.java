import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) {
        String input = "";
        System.out.println("Enter a input String");
        try{
            BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
            input = bf.readLine();
            char[] try1 = input.toCharArray();
            for(int i = try1.length-1 ; i >= 0 ; i-- ){
                System.out.print(try1[i]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
