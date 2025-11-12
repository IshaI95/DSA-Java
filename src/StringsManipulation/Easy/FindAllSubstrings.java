package StringsManipulation.Easy;

import java.util.ArrayList;
import java.util.*;

public class FindAllSubstrings {

    public static void main(String[] args) {

        String s = "canal";

        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {

                System.out.println(s.substring(i,j));
            }
        }

        LinkedHashSet<String> uniqueSubstrings = new LinkedHashSet<>();

        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++) {
                uniqueSubstrings.add(s.substring(i,j));
            }
        }

        System.out.println(uniqueSubstrings);
    }
}
