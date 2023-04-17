
import java.util.*;

//PALINDROME Partitioning PROBLEM (QUESTION LINK - )






public class Palindrome_Partitioning_Recu{
   
    static ArrayList<ArrayList<String>> ans  = new ArrayList<>();
    public static void  part(String s,int index,ArrayList<String> arr){

        if(index==s.length()){
            ArrayList<String> as  = new ArrayList<>();
            as.addAll(arr);
            if(!ans.contains(as)){
                ans.add(as);
            }
            
            return ;
        }
        for(int i=index;i<s.length();i++){
            if(isPali(s,index,i)){

                arr.add(s.substring(index, i+1));

                part(s,index+1,arr);

                arr.remove(arr.size()-1);
                
            }
        }
    }
    
    
    public static boolean isPali(String s,int start,int end){

        while (start <= end) {

            if (s.charAt(start) != s.charAt(end)){
                 return false;
            }
            start++;
            end--;
               
        }
        return true;
    }
    public static void main(String[] args) {
        String s="aabb";
        ArrayList<String> arr = new ArrayList<>();
        part(s, 0, arr);
        System.out.println(ans);
    }
}