import java.util.ArrayList;

// Combination Sum in array (QUESTION LINK - https://practice.geeksforgeeks.org/problems/combination-sum-1587115620/1 )
//TIME COMPLEXCITY = 2(N^K)
//Space Complexcity = k*x
//USING RECURSION 

public class combination_sum {
 
    public static void combination(int i,int target,ArrayList<ArrayList<Integer>> ans ,int arr[],int n ,ArrayList<Integer> as ){
        if(i>=n){
            if(target==0){
                ArrayList<Integer> a = new ArrayList<>();
                a.addAll(as);
                if(!ans.contains(a)){
                    ans.add(a);
                }
                
            }
            return ;
        }
        if(arr[i]<=target){
            as.add(arr[i]);
           
            combination(i, target-arr[i], ans, arr, n, as); 
            as.remove(as.size()-1);
        }  
       
        combination(i+1, target, ans, arr, n, as); 
       
        
    }

    public static void main(String[] args) {
        int arr[]=new int [4];
        arr[0]=2;
        arr[1]=3;
        arr[2]=6;
        arr[3]=7;
        int n = arr.length-1;
        int k = 7;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combination(0, k, ans, arr, n, a);
        System.out.println(ans);
    }
}
