import java.util.*;
public class reverseString {
    public static char [] s={'r','a','j'};
    
    
    public static void main(String[] args) {
        //optimal
        reverseString obj=new reverseString();
        obj.optimalSolution();
        //recursive
        obj.recursiveSolution(0,s.length-1,s);
        System.out.println(Arrays.toString(s));
        //normal solution
        obj.SwappingSolution();
        

    }

    public void optimalSolution(){
        int n=s.length;
         for(int i=0;i<n/2;i++){
             char temp=s[i];
             s[i]=s[n-i-1];
             s[n-i-1]=temp;
         }
        System.out.println(Arrays.toString(s));
    }
    
    public void recursiveSolution(int l,int r,char [] s){
        while(l<r){
            char temp;
            temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            recursiveSolution(++l,--r,s);
        }
        
    }
        
    public void SwappingSolution(){
        int l=0,r=s.length-1;
        while(l<r){
            char temp;
            temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(s));
    }

        
}
