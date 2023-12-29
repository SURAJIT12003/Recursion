
import java.util.*;

// COMBINATION SUM 2   *** VVIP USING RECURSION --- QUESTION LINK (LEETCODE - https://leetcode.com/problems/combination-sum-ii/description/) 
//(GFG QUESTION LINK - https://practice.geeksforgeeks.org/problems/combination-sum-ii-1664263832/1?page=1&sortBy=newest&query=page1sortBynewest)

 //time complexcity =  O(K * 2N)
 //space compplexcity =  O(N)

//contain only unique and sorted subseqence sum ****


public class combination_SUM_II {

    public static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
           List<Integer> a = new ArrayList<>();
            a.addAll(ds);
            ans.add(a);
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]){
                continue;
            }
             
            if (arr[i] > target){
                break;
            } 

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }


   // SAME AS COMBINATION HERE [i] increase every time ******
    static  List<List<Integer>> ans = new ArrayList<>();

    public void recur(int i,int n,int target,int arr[],List<Integer> s){
        if(target==0){
            List<Integer> l = new ArrayList<>();
            l.addAll(s);
           // Collections.sort(l);
            if(ans.contains(l)==false){
                ans.add(l);
            }
            return;
        }

        if(i>=n){
            return ;
        }

        if(arr[i]<=target){
            s.add(arr[i]);
            recur(i+1,n,target-arr[i],arr,s);  // When take condition then i++ .
            s.remove(s.size()-1);
        }

        recur(i+1,n,target,arr,s);

    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> l = new ArrayList<>();
        recur(0,arr.length,target,arr,l);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]=new int [7];
        arr[0]=10;
        arr[1]=1;
        arr[2]=2;
        arr[3]=7;
        arr[4]=6;
        arr[5]=1;
        arr[6]=5;
        int n = arr.length;
        int k = 8;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        findCombinations(0, arr, k, ans, a);
        System.out.println(ans);
    }
}
