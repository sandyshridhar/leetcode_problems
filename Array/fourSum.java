package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class fourSum {
    public static void main(String args[]){
        int arr[]={1, 0, -1, 0, -2, 2};
        findFourSum(arr);
    }

    private static void findFourSum(int[] arr) {
        Set set=new HashSet();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int k=j+1;
                int l=arr.length-1;
                while (k<l){
                    int sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==0){
                        set.add(Arrays.asList(arr[i],arr[j],arr[k++],arr[l--]));
                    }else if(sum<0){
                        k++;
                    }else if(sum>0){
                        l--;
                    }
                }
            }
        }
        System.out.println(set);

    }
}
