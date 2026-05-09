import java.util.Scanner;

public class Question2 {
    /**
     * This function removes duplicate letters from a word.
     * 1. The function creates a "charArray" for comparing letters and -->
     * --> "compressedString" StringBuilder for creating the new word
     * 2.It uses a loop for comparing two letters from the string.
     * 3. Adds the letters to "compressedString" if both letters are different
     * 4.
     * @param str the given string
     * @return nothing if nothing was given. Otherwise, the non-duplicate version of given string("compressedString")
     */
    public static String compressString(String str){
        // creates an array char from the size of the array
        StringBuilder compressedString = new StringBuilder();
        char[] charArray = str.toCharArray();
        if (charArray.length == 0){
            return str;
        }
        compressedString.append(charArray[0]);
      for (int i = 0; i < charArray.length-1; i++) {
          if (charArray[i] != charArray[i+1]) {
              compressedString.append(charArray[i+1]);
          }
      }

        return compressedString.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("the  duplicated string is: " + str);
        String newStr = compressString(str);
        System.out.println("the non duplicated string is: " + newStr);
    }

}
