package Algorithm;

import java.util.Arrays;

public class binarySearch {
    public static void main(String args[]){
        int a[]={2,4,6,8,9,0,12,3,5};
        int target=2;
        int idx=findbinarySearch(a,target);
        System.out.println("the val "+target+" found at the location "+idx);
    }

    private static int findbinarySearch(int[] a, int target) {
        Arrays.sort(a);
        int f=0;
        int l=a.length-1;
        while (f<=l){
            int mid=(f+l)/2;
            if(a[mid]==target){
                return mid+1;
            }else if(target>a[mid]){
                f=mid+1;
            }else if(target<a[mid]){
                l=mid-1;
            }
        }
        return 0;
    }
}
