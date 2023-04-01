import java.util.*;

//PRINT ALL SUB-SEQUENCE IN A STRING USING RECUSION  -- (QUESSTION LINK - https://practice.geeksforgeeks.org/problems/power-set4302/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=power-set)

//POWER SET SIMILAR QUESTION ---------*****

//total sub-seq - (2^N)


//VERY IMPORTANT 
public class String_Sub_Seq_Recursion {

    // SUBSEQUENCE ADD IN ARRAYLIST 
    public static ArrayList<String> subSeq(String str){

        ArrayList<String> ans  = new ArrayList<>();
        if(str.length()==0){
          ans.add(" ");
          return ans;
        }
        
        char curr  = str.charAt(0);
        ArrayList<String> smallAns = subSeq(str.substring(1));
    
        for(String ss:smallAns){
          ans.add(ss);
        
          ans.add(curr+ss);
        }
    
        return ans;
    
      }

     //SUB-SEQUENCE PRINT  
      public static void print_subSet(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        char curr = str.charAt(0);
        String remain = str.substring(1);
        print_subSet(remain,ans+curr);
        print_subSet(remain, ans);
  
    }
    
    public static void main(String[] args) {
         String sol="ABC";
         ArrayList<String> arr = subSeq(sol);
        // System.out.println(arr);
        print_subSet(sol, "");
    }
}
