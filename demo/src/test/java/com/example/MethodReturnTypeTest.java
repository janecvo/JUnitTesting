package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodReturnTypeTest {
    
    @DisplayName("test of returnStr() method")
    @Test
    void testReturnStr(){
        assertsEquals("String of Text", MethodReturnType.returnStr());
}

    private void assertsEquals(String string, String returnStr) {
    }

    @DisplayName("test of returnNum() method")
    @Test
    void testReturnNum(){
        assertsEquals(5, MethodReturnType.returnNum());
    }

    private void assertsEquals(int i, int returnNum) {
    }

    @DisplayName(" test returnBoolean() method")
    @Test
    void testReturnBoolean(){
        assertEquals(false, MethodReturnType.returnBoolean());
    }

    }
