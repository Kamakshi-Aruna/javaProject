package myPrograms;

public class sample2 {
    public static void main(String[] args) {
        String str="malayalam";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if(reverse.equals("malayalam")){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
