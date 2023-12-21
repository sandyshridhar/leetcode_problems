package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String args[]){
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        findDuplicate( arr );
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
