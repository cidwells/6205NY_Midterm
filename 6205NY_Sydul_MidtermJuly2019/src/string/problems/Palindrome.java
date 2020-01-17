package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String str = "kayak";
        isPalindrome(str);
        }
        public static boolean isPalindrome(String str) {
        int n = str.length();
        for( int i = 0; i < n/2; i++ )
            if (str.charAt(i) != str.charAt(n-i-1)) {
                System.out.println("not a palindrome");
                return false;
            }
            System.out.println("is a palindrome");
        return true;
    }
}
