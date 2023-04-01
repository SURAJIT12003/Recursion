
import java.util.*;


public class combination_SUM_II {

    public static void combi_sum_II(int i,int target,int arr[],ArrayList<Integer> as,int n ){
        
            if(target==0){
                ArrayList<Integer> a = new ArrayList<>();
                a.addAll(as);
                System.out.println(a); return ;
            }

           
      
       
            for(int in=i;in<=n;in++){
               
                if(in>i && arr[in]==arr[in-1]){
                    continue;
                }
                if(arr[i]>target){
                    break;
                }
                as.add(arr[in]);
                combi_sum_II(i+1, target-arr[in], arr, as, n);
                as.remove(as.size()-1);

            }
           
      

        // i=i+1;
        // combi_sum_II(i, target, arr, as, n);

    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=2;
        arr[4]=2;
        int n = arr.length;
        int k = 4;
        ArrayList<Integer> a = new ArrayList<>();
        combi_sum_II(0, k, arr, a, n-1);
    }
}
