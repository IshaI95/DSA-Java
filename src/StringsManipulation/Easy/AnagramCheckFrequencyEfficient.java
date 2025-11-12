package StringsManipulation.Easy;

public class AnagramCheckFrequencyEfficient {

    public static void main(String[] args) {

        boolean isAnagram = true;

//        String s1 = "listen";
//        String s2 = "silent";

        String s1 = "hello";
        String s2 = "heliu";

        s1 = s1.replaceAll("\\s+", "").trim().toLowerCase();
        s2 = s2.replaceAll("\\s+", "").trim().toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];

        for(char c: s1.toCharArray()) freq[c-'a']++;
        for(char c: s2.toCharArray()) freq[c-'a']--;

        for(int n:freq) {
            if(n!=0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println("isAnagram = " + isAnagram);
    }
}
