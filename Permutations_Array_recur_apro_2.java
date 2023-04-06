import java.util.*;

//Permutations ARRAY APPROACH -2 ( APPROACH -2 **** QUESTION LINK -https://leetcode.com/problems/permutations/  )

//TIME COMPLEXCITY - 0(N!*N)
//SPACE COMPLEXCITY - 0(N)

//TOTAL PERMUTATIONS IS ARRAY OR STRING --- (N!)


public class Permutations_Array_recur_apro_2 {
    
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public static void per(int index,int arr[]){
        if(index>=arr.length){

            ArrayList<Integer> as = new ArrayList<>();
            for(int val:arr){  // all elelment of array as list then add ans list ** 

                as.add(val);
            }
            ans.add(as);
            return; 
        }
        for(int i=index;i<arr.length;i++){

            //swap index to i 
            int t = arr[i];
            int r = arr[index];
            arr[i]=r;
            arr[index]=t;
            
            per(index+1, arr); //recursion call 
            
            //re-swap index to i 
            int tK = arr[i];
            int rK = arr[index];
            arr[i]=rK;
            arr[index]=tK;
           
        }
    }
    public static void main(String[] args) {
         int arr[]=new int [3];
            arr[0]=1;
            arr[1]=2;
            arr[2]=3;
           
            per(0, arr);
            System.out.println(ans);
    }
}
