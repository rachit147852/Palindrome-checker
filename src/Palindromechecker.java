public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long start = System.nanoTime();

        boolean result = isPalindrome(input);

        long end = System.nanoTime();

        long time = end - start;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + time + " ns");
    }

    static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while(start < end) {

            if(str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}