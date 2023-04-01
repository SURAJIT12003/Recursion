
import java.util.*;

// COMBINATION SUM 2   *** VVIP USING RECURSION --- QUESTION LINK (LEETCODE - https://leetcode.com/problems/combination-sum-ii/description/) 
//(GFG QUESTION LINK - https://practice.geeksforgeeks.org/problems/combination-sum-ii-1664263832/1?page=1&sortBy=newest&query=page1sortBynewest)

 //time complexcity =  O(K * 2N)
 //space compplexcity =  O(N)

//contain only unique and sorted subseqence sum ****


public class combination_SUM_II {

    public static void combi_sum_II(int i,int target,int arr[],ArrayList<Integer> as,int n ,ArrayList<ArrayList<Integer>> ans ){
            if(target==0){
                ArrayList<Integer> a = new ArrayList<>();
                a.addAll(as);
                ans.add(a);
                return ;
            }

            for(int in=i;in<=n;in++){
               
                if(in>i && arr[in]==arr[in-1]){
                    continue;
                }
                if(arr[i]>target){
                    break;
                }
                as.add(arr[in]);
                combi_sum_II(i+1, target-arr[in], arr, as, n,ans);
                as.remove(as.size()-1);

            }
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=2;
        arr[4]=2;
     
        int n = arr.length;
     
        int target = 4;
     
        Arrays.sort(arr);
     
        ArrayList<Integer> a = new ArrayList<>();
        combi_sum_II(0, target, arr, a, n-1);
    }
}
