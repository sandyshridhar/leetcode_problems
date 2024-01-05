package String;

public class stringToInt {
    public static void main(String args[]){
        String  s="Abcsd@# 23 aa2";
        int val = convertStringtoInt(s);
        System.out.println("converted val "+val);
    }

    private static int convertStringtoInt(String s) {
        char c[]=s.toCharArray();
        int rev=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>='0'&&c[i]<='9'){
                rev=rev*10+c[i]-'0';
            }
        }
        return rev;
    }
}
