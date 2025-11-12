package StringsManipulation.Medium;

import java.util.*;

public class NthMostFrequentCharacterList {

    public static void main(String[] args) {

        //Input string and n = 3rd most frequent character
        String s = "mississipppinnnggzz";
        int n = 3;

        ArrayList<Character> ans = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        //frequency map for each character
        for(char ch:s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("frequency map = " + map);

        // convert map to list of map entries for sorting purpose
        ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        // custom sorting -> descending order based on value, sorting entry(k,v)
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("sorted freq desc list = " + list);

        // get distinct frequencies in a set,
        // insertion order is preserved using linked hash set -->
        // not using, difficult to access specific element using index
        // list for accesing element using index
        ArrayList<Integer> distFreqList = new ArrayList<>();

        for(Map.Entry<Character,Integer> entry: list) {
            int freq = entry.getValue();
            if(!distFreqList.contains(freq)) {
                distFreqList.add(entry.getValue());
            }
        }

        System.out.println("distFreqList = " + distFreqList);

        // check if nth frequency exist
        if(n > distFreqList.size()) return;
        int targetFreq = distFreqList.get(n-1);

        // get list of all 3rd most frequent character
        for(Map.Entry<Character,Integer> entry:list) {
            if(entry.getValue() == targetFreq) {
                ans.add(entry.getKey());
            }
        }

        System.out.println("nth: " + n + " most frequent character list = " + ans);
    }

}
