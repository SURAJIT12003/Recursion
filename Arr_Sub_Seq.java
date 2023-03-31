import java.util.*;
/*
 * All possible patters from Subsequence

1. Print All the Subsequence
2. Print all Sq which sums to K
3. Print only 1st Sq which sums to K
4. Print the count of Sq which sums to K\

 */


//ARRAY ALL SUB-SEQUENCE PRINT USING RECURSION **** (VVIP)***

//Time Complexcity - 0(2^N)  because every element two option **

//Space Complexcity - 0(N)  because only N stack empty full and empty **

public class Arr_Sub_Seq {

    ////ARRAY ALL SUB-SEQUENCE PRINT USING RECURSION **** (VVIP)***

    public static void sub_seq(int index,ArrayList<Integer> ans,int arr[],int n  ){
        if(index==arr.length){
            if(ans.size()>0){
                System.out.println(ans);
            }
            if(ans.size()==0){
                System.out.println("null");
            }
            return ;
        }
        ans.add(arr[index]);// add to array list

        sub_seq(index+1, ans, arr, n);  // pick an element

        ans.remove(ans.size()-1);// remove from array list

        sub_seq(index+1, ans, arr, n);// not pick
    }


    
    //ARRAY WHOSE SUB-SEQUENCE IS EQUAL TO SUM THIS IS PRINT USING RECURSION ***

    public static void sub_seq_sum(int in,ArrayList<Integer> a,int sum,int arr[],int n,int k ){
        if(in>=n){
            if(sum==k){
                System.out.println(a);
                
            }
            return;
        }

        a.add(arr[in]);
        sum=sum+arr[in];
       
        sub_seq_sum(in+1, a, sum, arr, n, k);
        a.remove(a.size()-1);
        sum=sum-arr[in];
        sub_seq_sum(in+1,a,sum,arr,n,k);
    }

    //ARRAY IF ONLY ONE  SUB-SEQUENCE IS EQUAL TO SUM THEN RETURN TRUE USING RECURSION  ***
    public static boolean  sub_seq_su(int in,ArrayList<Integer> a,int sum,int arr[],int n,int k ){
        if(in>=n){
            if(sum==k){
                //System.out.println(a);
                return true ;
                
            }
            return false;
        }

        a.add(arr[in]);
        sum=sum+arr[in];
        boolean yt ;
        yt = sub_seq_su(in+1, a, sum, arr, n, k);
        if(yt==true){
            return true ;
        }
        a.remove(a.size()-1);
        sum=sum-arr[in];
        return sub_seq_su(in+1,a,sum,arr,n,k);
    }

    //ARRAY   SUB-SEQUENCE IS EQUAL TO SUM   COUNT THIS SUB-SEQUENCE THEN RETURN TRUE USING RECURSION  ***
    static int count =0;
    public static int  sub_seq_count(int in,ArrayList<Integer> a,int sum,int arr[],int n,int k ){
        if(in>=n){
            if(sum==k){
                //System.out.println(a);
                return 1 ;
                
            }
            return 0;
        }

        a.add(arr[in]);
        sum=sum+arr[in];
       
        int t = sub_seq_count(in+1, a, sum, arr, n, k);
        
        
        a.remove(a.size()-1);
        sum=sum-arr[in];
        int r = sub_seq_count(in+1, a, sum, arr, n, k);
        
        return r+t ;
    }


    public static void main(String[] args) {
        int arr[] = new int [4];
        arr[0]=2;
        arr[1]=3;
        arr[2]=6;
        arr[3]=7;
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
     
        int k = 7;
        int yt =0;
           sub_seq_sum(0, ans,0, arr, n,k);
         //sub_seq_count(0, ans, 0, arr, n, k);
        System.out.println(yt);

    }
}
