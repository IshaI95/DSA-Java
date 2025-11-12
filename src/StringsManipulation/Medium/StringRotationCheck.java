package StringsManipulation.Medium;

public class StringRotationCheck {

    public static void main(String[] args) {

        String s1 = "abcd";

        String s2 = "cdab";

        boolean ans = true;

        if(s1.length() != s2.length()) ans= false;

        String s3 = s1 + s1;

        ans = s3.contains(s2);

        System.out.println("ans = " + ans);
    }
}
