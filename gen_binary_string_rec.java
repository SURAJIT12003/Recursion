import java.util.*;

//QUESTION LINK - (https://practice.geeksforgeeks.org/problems/generate-binary-string3642/1)

//GENERATE ALL BINARY STRING USING RECURSION **


public class gen_binary_string_rec {
    
    static ArrayList<String> ans = new ArrayList<>();

    public static void in(StringBuffer str){
        boolean yt = false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='?'){
                yt=true;
                str.setCharAt(i, '0');
                in(str);
                str.setCharAt(i, '?');
                str.setCharAt(i, '1');
                in(str);
                str.setCharAt(i, '?');
            }

        }
        if(!yt){
           if(!ans.contains(str.toString())){
            ans.add(str.toString());
           }
            return;
        }
    }
    public static void main(String[] args) {

        String str="1??0?101";
        StringBuffer s=new StringBuffer();
        s.append(str);
        in(s);
        System.out.println(ans);
        
    }
}
