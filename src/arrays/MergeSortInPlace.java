package arrays;

import java.util.Arrays;
public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] a={4,1,30,20,10};
//        int[] a={1,2,3,4,5};
        int n=a.length;
        M_Sort(a,0,a.length);
        System.out.println("Answer: "+ Arrays.toString(a));
        System.out.println();
        System.out.print("Count: "+count);
    }
    static int count=0;
    static void M_Sort(int[] a,int start, int end){
        if(end-start==1){
            return;
        }
        int mid=(start+end)/2;
        M_Sort(a,start,mid);
        M_Sort(a,mid,end);
        merge(a,start,mid,end);
    }
    static void merge(int[] a,int start, int mid,int end){
        int[] mix=new int[end-start];
        int i=start;
        int j=mid;
        int pointer=0;
        while(i<mid && j<end){
            count++;
            if(a[i]<a[j]){
                count++;
                mix[pointer]=a[i];
                count++;
                i++;
                count++;
            }
            else{
                count++;
                mix[pointer]=a[j];
                count++;
                j++;
                count++;
            }
            count++;
            pointer++;
            count++;
        }
        count++;
        while(i<mid){
            count++;
            mix[pointer]=a[i];
            count++;
            i++;
            count++;
            pointer++;
            count++;
        }
        count++;
        while(j<end){
            count++;
            mix[pointer]=a[j];
            count++;
            j++;
            count++;
            pointer++;
            count++;
        }
        count++;
        for(int l=0;l< mix.length;l++){
            count++;
            a[start+l]=mix[l];
            count++;
        }
        count++;
    }
}
