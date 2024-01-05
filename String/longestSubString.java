package String;

import java.util.HashSet;
import java.util.Set;

public class longestSubString {
    public static void main(String arhs[]){
        String s="abcabcbb";
        int max=findlogestsubString(s);
        System.out.println("length of longest substring "+max);
    }

    private static int  findlogestsubString(String s) {
        Set set=new HashSet();
        int max=0;int j=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max=Math.max(max,set.size());
            }else {
                set.remove(s.charAt(j++));
            }
        }
        return max;
    }
}
