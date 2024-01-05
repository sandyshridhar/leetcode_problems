package String;

import java.util.ArrayList;
import java.util.List;

public class combinationOfNum {
    static List list=new ArrayList();
    static String str[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String args[]){
        String input="23";
        findcombination("",0,input,input.length());
        System.out.println(list);
        
    }

    private static void findcombination(String s, int i, String input, int length) {
        if(s.length()==length){
            list.add(s);
            return;
        }
        char ch=input.charAt(i);
        String tmp=str[ch-'0'];
        for(int j=0;j<tmp.length();j++){
            findcombination(s+tmp.charAt(j),i+1,input,input.length());
        }
    }

}
