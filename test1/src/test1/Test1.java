package test1;

public class Test1 {

    public static void main(String[] args) {
        String[] testStrings = {
            "A man, a plan, a canal, Panama!",
            "racecar",
            "hello",
            "Was it a car or a cat I saw?"
        };

        for (String s : testStrings) {
            boolean result = isPalindrome(s);
            System.out.println("\"" + s + "\" is a palindrome: " + result);
        }
    }

    public static boolean isPalindrome(String s) {
        // Clean the string: remove non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Check if the cleaned string is equal to its reverse
        int length = cleaned.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
