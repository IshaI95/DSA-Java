package StringsManipulation.Easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharacterFrequency {

    public static void main(String[] args) {

        String s = "Programming";
//        s=s.toLowerCase().trim();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch:s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }

}
