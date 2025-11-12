package StringsManipulation.Palindrome;

public class ValidPalindromeIgnoreSpaces {

    public static void main(String[] args) {

        String s = "A man a plan a canal Panama";

        boolean isValidPalindrome = true;

        if(s==null) return;

        int left=0;
        int right=s.length()-1;

        while(left<right) {
            char chLeft = Character.toLowerCase(s.charAt(left));
            char chRight = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetterOrDigit(chLeft)) {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(chRight)) {
                right--;
                continue;
            }

            if(chLeft!=chRight) {
                isValidPalindrome = false;
                break;
            }

            left++;
            right--;

        }

        System.out.println("isValidPalindrome = " + isValidPalindrome);

    }

}
