import java.util.Arrays;
import java.util.*;
public class SortArrayOf0s1s2sWithoutSortingAlgo {
    //time complexity o(n) and space complexity 0(1)
    public static void main(String[] args) {
        int[] arr={0,2,1,2,0};
        int c0=0;
        int c1=0;
        // int c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            // else{
            //     c2++;
            // }
        }
        int i=0;
        while(i<c0){
            arr[i]=0;
            i++;
        }
        i=c0;
        while(i<c0+c1){
            arr[i]=1;
            i++;
        }
        i=c0+c1;
        while(i<arr.length){
            arr[i]=2;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
