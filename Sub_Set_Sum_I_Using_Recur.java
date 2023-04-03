
import java.util.*;

//ARRAY ALL SUB-SET PRINT USING RECURSION (QUESTION LINK - https://practice.geeksforgeeks.org/problems/subset-sums2234/1)

//TIME COMPLEXCITY = 0(2^N);
//SPACE COMPLEXCITY = 0(2^N);

//TOTAL SUB-SET IS - 2^N 

public class Sub_Set_Sum_I_Using_Recur {

    public static void sub_set_1(int in,int arr[],int sum ){
        if(in>=arr.length){
            System.out.println("Subset sum is "+ sum );
            return ;
        }
        sum = sum+arr[in];
        sub_set_1(in+1, arr, sum);
        sum=sum-arr[in];
        sub_set_1(in+1, arr, sum);
    }
    public static void main(String[] args) {
        int arr[]=new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=5;
      
        int n = arr.length;
        sub_set_1(0, arr, 0);
        
    }
}
