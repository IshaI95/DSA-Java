package StringsManipulation.Easy;

import java.util.LinkedHashMap;
import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "programming";
        char ans = 0;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch: s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){

            if(entry.getValue() == 1) {
                ans = entry.getKey();
                break;
            }
        }

        System.out.println("ans = " + ans);
    }
}
