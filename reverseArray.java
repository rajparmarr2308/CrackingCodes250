import java.util.Arrays;

class reverseArray{
    public static void main(String args[]){
        int[] arr={3,4,2,1,6};
        reverseArray obj=new reverseArray();
        //bruteforce
        obj.iterativeMethod(arr,arr.length); 
        System.out.println(Arrays.toString(arr)); 
        
        //recursive
        int[] arr2={3,4,2,1,7};
        obj.recursiveMethod(0,arr.length-1,arr2);   
        System.out.println(Arrays.toString(arr2));
        
        //optimal
        int[] arr3={3,4,2,1,8};
        obj.optimalMethod(arr3,arr.length);
        System.out.println(Arrays.toString(arr3)); 
    }

    
    //O(n/2)
    public void optimalMethod(int[] arr, int n) {
        int l=0,r=n-1,temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l=l+1;
            r=r-1;

        }
    }

    //O(n/2)
    public void recursiveMethod(int i, int j, int[] arr) {
        while(i<j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            recursiveMethod(++i, --j, arr);
        }
        
    }

    //O(n)
    public void iterativeMethod(int[] arr, int n) {
        int[] newArray=new int[n];
        for(int i=0;i<arr.length;i++){
            newArray[n-1]=arr[i];
            n=n-1;
        }
    }
}

