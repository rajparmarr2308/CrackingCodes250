import java.util.Arrays;

class moveAllNagativeToOneSideOfArray{
    public static void main(String[] args) {
        // int[] arr={4,-4,9,-2,0,5,-20};
        // int pivot=arr[4];

        // if 0 is not present
        int[] arr={4,-4,9,-2,5,-20};  
        int n=arr.length;
        int pivot=0;
        int i=-1;
        for(int j=0;j<n;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // if zero is present
        // i++;
        // int temp=arr[i];
        // arr[i]=arr[4];
        // arr[4]=temp;
        // System.out.println(Arrays.toString(arr));
        int[] arr2 = { -12, 11, -13, -5,
            6, -7, 5, -3, 11 };
        moveAllNagativeToOneSideOfArray obj= new moveAllNagativeToOneSideOfArray();
        obj.pointerApproch(arr2,n);
    }

    private void pointerApproch(int[] arr, int n) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]>0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(arr[left]<0 && arr[right]<0){
                left++;
            }
            else if(arr[left]>0 && arr[right]>0){
                right--;
            }
            else{
                left++;
                right--;
                
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}