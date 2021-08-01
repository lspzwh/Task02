package uncommon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task {
    class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {
            String[] array1=s1.split(" ");
            String[] array2=s2.split(" ");
            HashMap<String,Boolean> map=new HashMap<>();
            for(String s:array1){
                if(!map.containsKey(s)){
                    map.put(s,true);
                }else {
                    map.put(s,false);
                }
            }
            for(String s:array2){
                if(!map.containsKey(s)){
                    map.put(s,true);
                }else {
                    map.put(s,false);
                }
            }
            ArrayList<String> list=new ArrayList<>();
            for(String m:map.keySet()){
                if(map.get(m)){
                    list.add(m);
                }
            }
            return list.toArray(new String[list.size()]);
        }
    }
}
