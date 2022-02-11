import java.util.Arrays;
import java.util.*;
// import java.util.Collections;
public class KthMinAndMaxOfArray {
    public static void main(String[] args) {
       KthMinAndMaxOfArray obj=new KthMinAndMaxOfArray();
       
       Integer [] arr2 = { 13, 7, 6, 45, 21, 9, 100, 103 };
       int k=2;
       int ans=obj.normalApproch(arr2,k);  //will get 2nd max
       System.out.println(ans);

       int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
       //6 7 9 13 21 45 101 102
       int ans2=obj.optimalSortingApproch(arr,k);  //will get 2nd  min
       System.out.println(ans2);
    }

    private int optimalSortingApproch(int [] arr,int k) {
        // arr=mergeSort(arr,0,arr.length-1); most efficient for linked list
        // return arr[k-1];      //worst case nlogn good but more space consuming 

        quickSort(arr,0,arr.length-1);   //most efficient for arrays
        return arr[k-1];        //will get 2nd  min
        //worst case n^2 but less space consuming
        // System.out.println(Arrays.toString(arr));
    }

    

    private int[] mergeSort(int[] arr,int si,int ei) {
        devide(arr,si, ei);
        return arr;
    }
    private void devide(int[] arr, int si, int ei) {
        int mid=si+(ei-si)/2;
        if(si>=ei)
            return;
        devide(arr,si,mid);
        devide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }

    private void conquer(int[] arr, int si, int mid, int ei) {
        int idx1=si;
        int idx2=mid+1;
        int[] merged=new int[ei-si+1];
        int count=0;
        while(idx1<=mid && idx2<=ei){
                if(arr[idx1]<=arr[idx2]){
                    merged[count++]=arr[idx1++];
                }
                else{
                    merged[count++]=arr[idx2++];
                }
        }
        while(idx1<=mid){
            merged[count++]=arr[idx1++];   
        }
        while(idx2<=ei){
            merged[count++]=arr[idx2++];   
        }

        for(int i=0, j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    private  void quickSort(int[] arr,int low,int high) {
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    private int partition(int[] arr, int low, int high) {
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
                if(arr[j]<pivot){
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;  // or we can write arr[high]
        arr[high]=temp;
        return i;
    }

    private int normalApproch(Integer [] arr,int k) {
        /* for normal sort wa can have int but for reverse sort we need to use Integer class
        It's not directly possible to reverse sort an array of primitives (i.e., int[] arr = {1, 2, 3};) 
        using Arrays.sort() and Collections.reverseOrder() because those methods
        require reference types (Integer) instead of primitive types (int). */
        // Arrays.sort(arr);
        // return arr[arr.length-k];
        Arrays.sort(arr, Collections.reverseOrder()); 
        return arr[k-1];
        // for reverse order Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));
    }

    //with priority queue /max heap approch
    // public int findKthLargest(int[] nums, int k) {
        
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
    //     for (int num: nums) {
            
    //         pq.add(num);
            
    //         if (pq.size() > k) {
    //             pq.poll();
    //         }
    //     }
    //     return pq.poll();      // show top value  
    // }
}
