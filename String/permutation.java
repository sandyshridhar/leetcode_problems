package String;

public class permutation {
    public static void main(String args[]){
        String s="123";
        findpermutation(s,0,s.length());
    }

    private static void findpermutation(String s, int start, int end) {
        if(start==end){
            System.out.println(s);
        }else {
            for(int i=start;i<end;i++){
                s=Swap(s,start,i);
                findpermutation(s,start+1,end);
                s=Swap(s,start,i);
            }
        }

    }

    private static String Swap(String s, int i, int j) {
        char ch[]=s.toCharArray();
        char tmp=ch[i];
        ch[i]=ch[j];
        ch[j]=tmp;
        return String.valueOf(ch);
    }
}
