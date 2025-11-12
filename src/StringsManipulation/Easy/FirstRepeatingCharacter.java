package StringsManipulation.Easy;

import java.util.LinkedHashMap;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {

        String s = "programming";
//        String s = "programming";
        char ans = 0;

        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();

        for(char ch: s.toCharArray()) {

            freqMap.put(ch, freqMap.getOrDefault(ch, 0) +1);
            if(freqMap.get(ch) > 1) {
                ans = ch;
                break;
            }
        }

        System.out.println("ans = " + ans);
    }
}
