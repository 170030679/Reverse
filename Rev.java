import java.til.Scanner;
 
public class Rev
{
    public static void main(String[] args)
    {
        String str = "padmakar";
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
