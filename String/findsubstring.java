package String;

public class findsubstring {
    public static void main(String args[]){
        String s="sadbutsad";
        String ip="sad";
        int i=0;
        int j=i;int k=0;
        String tmp="";int min=0;
        while (i<s.length()-1){
            if(j==s.length()){
                i++;
                j=i;
                tmp="";
            }
            tmp+=s.charAt(j);
            if(!ip.equals(tmp)){
                j++;
            }else if(ip.equals(tmp)){
                min=Math.min(min,i);
                i=j;
                j=i+1;
                tmp="";k++;
            }
        }
        if(k>1){
            System.out.println(min);
        }else {
            System.out.println("-1");
        }
    }
}
