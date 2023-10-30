import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str, rev;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = s.nextLine();
        StringBuffer str1 = new StringBuffer(str);
        rev = str1.reverse().toString();
        if (str.equals(rev)) {            
            System.out.println("Yes, \"" + str + "\" is a palindrome.");
        } 
        else {            
            System.out.println("No, \"" + str + "\" is not a palindrome.");
        }
    }
}
