package day59;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;
// import  org.junit.jupiter.api.Assertions.assertEquals;

public class MethodReturnTypesTest {
    
    @DisplayName("test of returnStr() method")
    @Test
    void testReturnStr(){
        assertEquals("String of text", MethodReturnTypes.returnStr());
}

    @DisplayName("test of returnNum() method")
    @Test

    void testReturnNum(){
        assertEquals(5, MethodReturnTypes.returnNum());
    }

    @DisplayName("test of returnBoolean() method")
    @Test

    void testReturnBoolean(){
        assertEquals(false, MethodReturnTypes.returnBoolean());
    }

}
