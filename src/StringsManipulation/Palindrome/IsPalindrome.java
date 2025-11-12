package StringsManipulation.Palindrome;

public class IsPalindrome {

    public static boolean isPalindrome(String str) {

        String reverse = new StringBuilder(str).reverse().toString();

        if(str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s1 = "madam";
        String s2 = "hello";
        String s3 = "racecar";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }
}
