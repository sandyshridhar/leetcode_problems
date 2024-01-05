package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String args[]){
        int arr[]={1,1,1,2,2,3,3,4};
        findDuplicate( arr );
        removeDupli(arr);
        removesorteddupli(arr);
    }

    private static void removesorteddupli(int[] arr) {
        int i=0;
        int j=i+1;
        int n=arr.length;
        while (i<n &&j<n){
            if(arr[i]==arr[j]){
               j++;
            }else if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }
        System.out.println();
    }

    private static void removeDupli(int[] arr) {
        int tmp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                tmp[j++]=arr[i];
            }
        }
        tmp[j++]=arr[arr.length-1];
        for(int i=0;i<tmp.length;i++){
            System.out.print(tmp[i]+",");
        }
        System.out.println();
    }

    private static void findDuplicate(int[] arr) {
        Arrays.sort(arr);
        Set set=new HashSet();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
