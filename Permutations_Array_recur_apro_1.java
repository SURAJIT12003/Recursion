 
 import java.util.*;

  // Permutations of Array or String USING RECURSION (** * VVIP **) (APPROACH -1 ** QUESTION LINK --)

  //TIME COMPLEXCITY - 0(N!*N)

  //SPACE COMPLEXCITY - 0(N!*N)

  //TOTAL PERMUTATIONS IS ARRAY OR STRING --- (N!)
 
 
 
 public class Permutations_Array_recur_apro_1{

    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public static void permutations( ArrayList<Integer> a , int arr[] , boolean map[]  ){

            if(a.size()==arr.length){
                ArrayList<Integer> as = new ArrayList<>();
                as.addAll(a);
                ans.add(as);
                return ;
                
            }

            for(int i=0;i<arr.length;i++){
                if(!map[i]){
                    a.add(arr[i]);
                    map[i]=true;
                    permutations(a, arr, map);
                    a.remove(a.size()-1);
                    map[i]=false;
                }
            }
    }
        public static void main(String[] args) {

            int arr[]=new int [3];
            arr[0]=1;
            arr[1]=2;
            arr[2]=3;

            boolean map[] = new boolean[3]; // here boolean array deafult value is * FALSE *
         
            ArrayList<Integer> a = new ArrayList<>();

            permutations(a, arr, map);
            System.out.println(ans);
        }
 }
