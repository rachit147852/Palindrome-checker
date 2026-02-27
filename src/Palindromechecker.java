import java.util.Scanner;

public class Palindromechecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a;

        System.out.println("Enter string:");
        a = in.nextLine();
         String b="";

        for(int i =a.length()-1;i>=0;i--){
            b+=a.charAt(i);
                }

        if(b.equals(a))
            System.out.println("It is palindrome");
        else
            System.out.println("Not a palindrome");
    }
}