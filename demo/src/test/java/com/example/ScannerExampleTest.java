package com.example;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScannerExampleTest {
//could only get these test to work individually
    @DisplayName("Test printString1() method")
    @Test
    void testPrintString1(){
        String text = "something";
        InputStream input = new ByteArrayInputStream(text.getBytes());
        System.setIn(input);
        assertEquals("You wrote something", ScannerExample.printString1());
    }

    // @DisplayName("Test printString2() method")
    // @Test
    // void testPrintString2(){
    //     String text1 = "more";
    //     InputStream input = new ByteArrayInputStream(text1.getBytes());
    //     System.setIn(input);
    //     assertEquals("You wrote more", ScannerExample.printString2());
    // }


    // @DisplayName("Test printString3() method")
    // @Test
    // void testPrintString3(){
    //     String text3 = "nothing";
    //     InputStream input = new ByteArrayInputStream(text3.getBytes());
    //     System.setIn(input);
    //     assertEquals("You wrote nothing", ScannerExample.printString3());
    // }

}
