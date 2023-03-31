import java.util.Scanner;

public class recursion_advance {
    //print all permutation a string ***
    public static void printperm(String str ,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return ;
        }

        for (int i=0;i<str.length();i++){
            char t1 = str.charAt(i);
            String newStr = str .substring(0, i) +str.substring(i+1);
            printperm(newStr, permutation + t1 );
        }
    }
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.next();
        //String str = "abc";
        printperm(str, "");
        
    }
    
}
