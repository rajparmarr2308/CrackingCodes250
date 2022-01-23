public class MaxMinwithLessComparisonArray {
    public static void main(String args[]){
        MaxMinwithLessComparisonArray obj=new MaxMinwithLessComparisonArray();
        int [] a={3,5,1,2,7};
        int l=a.length;
        obj.linearApproch(a,l);
        //with less comparison
        obj.optimalApproch(a,l);

    }

    private void optimalApproch(int[] a,int l) {
        if(l==0)return;
        int max,min,i;
        if(l==1)
        {
            max=a[0];
            min=a[0];
        }
        if(l%2==0){
            if(a[0]>a[1]){
                max=a[0];
                min=a[1];
            }
            else{
                min=a[0];
                max=a[1];
            }
            i=2;
        }
        else{
            max=a[0];
            min=a[1];
            i=1;
        }

        while(i<=l-1){
            if(a[i]>a[i+1]){
                if(a[i]>max){
                    max=a[i];
                }
                if(a[i+1]<min){
                    min=a[i+1];
                }
            }
            else{
                if(a[i+1]>max){
                    max=a[i+1];
                }
                if(a[i]<min){
                    min=a[i];
                }
            }
            i=i+2;
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
    }

    private void linearApproch(int[] a,int l) {
        if(l==0)return;
        int max,min;
        if(l==1){
            max=a[0];
            min=a[0];
        }
        else{
            if(a[0]>a[1]){
                max=a[0];
                min=a[1];
            }
            else{
                min=a[0];
                max=a[1];
            }
        }
        for(int i=2;i<l;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
    }

}
