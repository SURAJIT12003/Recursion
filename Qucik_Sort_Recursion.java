public class Qucik_Sort_Recursion {

    public static void quick(int arr[],int low ,int high){

            if(low>=high){
                return;
            }
            
            int pivot = arr[low];

            int partion = sort( pivot,arr,low,high);
            System.out.println(partion+" part ");
            quick(arr, low, partion-1);
            quick(arr, partion+1, high);
    }

    public static int sort(int pivot,int arr[],int low ,int high){
            int i=low;
            int j =high;
            while(j>i){

                while(i<=high && arr[i]<pivot ){
                    i++;
                }

                while(j>=low && pivot<arr[j]){
                    j--;
                }

                if(j>i){
                    int t = arr[i];
                    int r = arr[j];
                    arr[i]=r;
                    arr[j]=t;
                }
                
            }
            return j;
    }
    public static void main(String[] args) {

        int arr[]=new int [7];

        arr[0]=15;
        arr[1]=9;
        arr[2]=25;
        arr[3]=45;
        arr[4]=23;
        arr[5]=12;
        arr[6]=5;
       
        int n = arr.length;
        quick(arr, 0, n-1);
        for(int val:arr){
            System.out.println(val);
        }
    }
}
