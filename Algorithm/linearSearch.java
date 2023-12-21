package Algorithm;

public class linearSearch {
    public static void main(String args[]){
        int a[]={3,5,23,45,6,8,9,0};
        int target=8;
        int idx=findlinearSearch(a,target);
        if(idx!=0)
            System.out.println("the val "+target+" found at the location "+idx);
        else System.out.println("not Found");
    }

    private static int findlinearSearch(int[] a, int target) {
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i+1;
            }
        }
        return 0;
    }
}
