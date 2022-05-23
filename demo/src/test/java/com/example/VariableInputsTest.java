package com.example;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VariableInputsTest {
    @DisplayName("Test printString() method")
    @Test
    void testPrintString(){
        String text = "something";
        InputStream input = new ByteArrayInputStream(text.getBytes());
        System.setIn(input);
        assertEquals("Your string is something", VariableInputs.printString());
    }
}
    //could not figure out how to do the test for non-String types
    // @DisplayName("Test printInt() method")
    // @Test
    // void testPrintInt(){
    //     int number = 5;
    //     InputStream input = number;
    //     System.setIn(input);
    //     assertEquals("Your int is 5", VariableInputs.printInt());
    // }

    // @DisplayName("Test printDouble() method")
    // @Test
    // void testPrintDouble(){
    //     String expectedResult = "3.14";
    //     InputStream input = new ByteArrayInputStream(expectedResult.getBytes());
    //     System.setIn(input);
    //     assertEquals("Your double is 3.14", VariableInputs.printDouble());
    // }

    // @DisplayName("Test printBoolean() method")
    // @Test
    // void testPrintBoolean(){
    //     String expectedResult = "false";
    //     InputStream input = new ByteArrayInputStream(expectedResult.getBytes());
    //     System.setIn(input);
    //     assertEquals("Your boolean is false", VariableInputs.printBoolean());
    // }

// }
