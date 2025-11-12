package StringsManipulation.Easy;

public class IsDigit {

    public static void main(String[] args) {

        String s = "1254790";

        boolean is_digit = s.chars().allMatch(Character::isDigit);

        System.out.println("is_digit: " + is_digit);
    }
}
