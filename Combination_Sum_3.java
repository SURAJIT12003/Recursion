import java.util.*;

//COMBINATION SUM-3 USING RECURSION (Question Link -(LEETCODE ) https://leetcode.com/problems/combinations/description/)

//QUESTION LINK = (GFG)(https://practice.geeksforgeeks.org/problems/combination-sum-iii/1?page=1&status[]=unsolved&category[]=Recursion&sortBy=difficulty)


// Expected Time Complexity: O(2K)
// Expected Auxiliary Space: O(K)



public class Combination_Sum_3 {
    public  static void sub_seq(int index,ArrayList<Integer> ans,int arr[],int n,int k ,  ArrayList<ArrayList<Integer>>  as,int sum ){
        if(index==arr.length){
           ArrayList<Integer> ab = new ArrayList<>();
           ab.addAll(ans);
           if(sum==n && ab.size()==k){
               Collections.sort(ab);
               if(!as.contains(ab)){
                   as.add(ab);
               }
           }
            return ;
        }
        ans.add(arr[index]);// add to array list
        sum=sum+arr[index];
        sub_seq(index+1, ans, arr, n, k,as,sum);  // pick an element

        ans.remove(ans.size()-1);// remove from array list
        sum=sum-arr[index];
        sub_seq(index+1, ans, arr, n ,k,as ,sum);// not pick
    }
    public static void main(String[] args) {
        int N = 9;
        int K = 3;
        int arr[]=new int [9];
        for(int i=1;i<=9;i++){
            arr[i-1]=i;
        }
        ArrayList<ArrayList<Integer>>  as = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        sub_seq(0,ans,arr,N,K,as,0);
        System.out.println(as);
    }
}
