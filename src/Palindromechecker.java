import java.util.Scanner;

public class Palindromechecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a;

        System.out.println("Enter string:");
        a = in.nextLine();

        boolean isPalindrome = true;

        for(int i = 0; i < a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("It is palindrome");
        else
            System.out.println("Not a palindrome");
    }
}