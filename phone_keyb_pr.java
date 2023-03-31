public class phone_keyb_pr {

    // PHONE KEYPAD PROBLEM USING RECURSION (IMPORTANT QUESTION ****)
    public static void key(String dig,String []kp,String res ){

        if(dig.length()==0){
            System.out.println(res);
            return;
        }

        int curr  = dig.charAt(0)-'0';

        String curchoice = kp[curr];

        for(int i=0;i<curchoice.length();i++){
            key(dig.substring(1),kp,res+curchoice.charAt(i));
        } 


    }
    public static void main(String[] args) {

        String keyboard  = "23";

        String digit[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //                 0   1    2      3      4      5      6      7       8        9   > THIS ARE PHONE DIGIT NUMBER **
       
        key(keyboard, digit, "");
        
        
    }
}
