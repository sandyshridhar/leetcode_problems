import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a[]={1,4,1,3,2,5,1};
        Arrays.sort(a);
        int i=0;int j=i+1;
        int n=a.length;
        while (i<n && j<n){

            if(a[i]==a[j]){
                j++;
            }else if(a[i]!=a[j]){
                a[i+1]=a[j];
                i++;
                //j=i+1;
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+",");
        }
    }
}