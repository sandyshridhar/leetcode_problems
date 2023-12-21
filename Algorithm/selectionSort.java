package Algorithm;

public class selectionSort {
    public static void main(String args[]){
        int a[]={9,6,5,4,3,6,2,0,1};
        for(int i=0;i<a.length;i++){
            int pos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[pos]>a[j]){
                    pos=j;
                }
            }
            int temp=a[pos];
            a[pos]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
