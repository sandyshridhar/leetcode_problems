package Array;

public class containerWithMostWater {
    public static void main(String args[])
    {
        int arr[]={1,8,6,2,5,4,8,3,7};
        findContainerWithMostWater( arr );
    }

    private static void findContainerWithMostWater( int arr[]) {

        int l=0;
        int r=arr.length-1;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int area = (r-l)*Math.min(arr[l],arr[r]);
            max=Math.max(max,area);
            if(arr[l]<arr[r]){
                l++;
            }else if(arr[l]>arr[r]){
                r--;
            }else{
                l++;
                r--;
            }
        }
        System.out.println(max);
    }
}
