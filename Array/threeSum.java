package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class threeSum {
    public static void main( String args[]){

        int arr[] = {-1, 0, 1, 2, -1, -4};
        findThreeSum(arr);
    }

    private static void findThreeSum( int arr[] ) {
        Arrays.sort(arr);
        Set set=new HashSet();
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i+1;
            int k=arr.length-1;
            while (j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if (sum==0)
                {
                    set.add(Arrays.asList(arr[i],arr[j++],arr[k--]));
                }else if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }
            }
        }
        System.out.println(set);
        Set set1=new HashSet();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        set1.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }
        System.out.println(set1);
    }
}
