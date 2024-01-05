package String;

public class longestPalindrom {
    public static void main(String arhs[]){
        String s="bcdcbff";
        findlongestPalindrome(s);
    }

    private static void findlongestPalindrome(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String temp=s.substring(i,j+1);
                max = checkpali(temp,max);
            }
        }
        System.out.println("length of longest palindrome "+max);
    }

    private static int  checkpali(String s,int max) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(rev.equals(s)){
            max=Math.max(max,rev.length());
        }
        return max;
    }
}
