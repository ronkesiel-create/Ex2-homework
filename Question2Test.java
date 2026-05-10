import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2Test {

    @Test
    void compressString2() {
        String str = "hhhiiii";
        String newStr = Question2.compressString(str);
        assertEquals("hi", newStr);
    }
    @Test
    void compressStringEmpty() {
        String str = "";
        String newStr = Question2.compressString(str);
        assertEquals("", newStr);
    }
    @Test
    void compressStringOne() {
        String str = "hh";
        String newStr = Question2.compressString(str);
        assertEquals("h", newStr);
    }
    @Test
    void compressStringTwo() {
        String str = "hi  ,,    hhhooowww aaareee yyoouuu tttoodddaayy";
        String newStr = Question2.compressString(str);
        assertEquals("hi , how are you today", newStr);
    }
}