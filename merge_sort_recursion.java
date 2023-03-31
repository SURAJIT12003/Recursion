import java.util.*;

//MERGE SORT USING RECURSION (TIME COMPLEXCITY - O(N LOG N))


public class merge_sort_recursion {

    public static void divide(int arr[],int low ,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left= low ;
        int right = mid+1;
        while(left<=mid && right<=high){
            int t = arr[left];
            int r = arr[right];
            if(t<=r){
                temp.add(t);
                left++;
            }
            else{
                temp.add(r);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while(right<=mid){
            temp.add(arr[right]);
            right++;
        }
        int k =low ;
        for(int i=0;i<temp.size();i++){
            arr[k] = temp.get(i);
            k++;
        }

    }

    public static void print_array(int arr[]){
        for(int val:arr){
            System.out.println(val);
        }
    }


    public static void main(String[] args) {
        int arr[]=new int [4];
        arr[0]=15;
        arr[1]=90;
        arr[2]=25;
        arr[3]=14;
        int n = arr.length;
        divide(arr, 0, n-1); // here high = (arr.length-1)
        print_array(arr);
    }
}
