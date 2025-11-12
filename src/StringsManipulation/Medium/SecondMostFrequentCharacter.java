package StringsManipulation.Medium;
import java.util.*;

public class SecondMostFrequentCharacter {

    public static void main(String[] args) {

        String s = "mississippi";
        char ans = 0;

        HashMap<Character,Integer> freqMap= new HashMap<>();

        for(char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freqMap);

//        ArrayList<Integer> ls = new ArrayList<>(List.of(1,0, 20, 15, 4, 45, 89, 9, 60, 65, 31));
//        ls.sort(Comparator.reverseOrder());
//        System.out.println(ls);

        ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(freqMap.entrySet());

        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        System.out.println(list);

        if(list.size()<2) return;

        ans = list.get(1).getKey();

        System.out.println("ans =" + ans);

    }
}
