package StringsManipulation.Easy;

public class CountVowelsAndConstants {

    public static void main(String[] args) {

        String str = "delecious";

        // v=5, c=4

        int vowels=0;
        int constants=0;

        for(char ch: str.toCharArray()) {

            if(ch>='a' && ch<='z') { //is a letter

                if("aeiou".indexOf(ch)!=-1) {
                    vowels++;
                } else {
                    constants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels + " and constants = " + constants);
    }
}
