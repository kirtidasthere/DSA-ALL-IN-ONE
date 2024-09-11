package Collections.Map;

import java.util.*;

public class GroupAnagrams
{
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> groupAnagrams=new HashMap<>();
            for(String str:strs)
            {
                char[] chararr=str.toCharArray();
                Arrays.sort(chararr);
                String SortedString=new String(chararr);
                if(!groupAnagrams.containsKey(SortedString))
                {
                    groupAnagrams.put(SortedString, new ArrayList<>());
                }
                groupAnagrams.get(SortedString).add(str);
            }
            return new ArrayList<>(groupAnagrams.values());
        }

    public static void main(String[] args) {
        GroupAnagrams ga=new GroupAnagrams();
        String strs[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(ga.groupAnagrams(strs));
    }

}
