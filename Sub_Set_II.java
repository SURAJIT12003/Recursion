
//Subset II (QUESTION LINK  - https://practice.geeksforgeeks.org/problems/subset-sum-ii/1)

// ALL UNQUE SUBSET 

import java.util.*;

public class Sub_Set_II {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void sub_set2(int in ,int nums[], ArrayList<Integer> as){
        ArrayList<Integer> a  = new ArrayList<>();
        a.addAll(as);
        ans.add(a);
        
        for(int i=in;i<nums.length;i++){
               
            if(i!=in && nums[i] == nums[i-1]) {
                    continue;
            }
            
            as.add(nums[i]); 
            sub_set2(i+1, nums, as); 
            as.remove(as.size() - 1);
            

        }
    }
    public static void main(String[] args) {
        int arr[]=new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=2;
        // arr[3]=2;
        // arr[4]=2;
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        sub_set2(0, arr, a);
       // [[],[1],[1,2],[1,2,2],[2],[2,2]]
       System.out.println(ans);
    }
   

}
