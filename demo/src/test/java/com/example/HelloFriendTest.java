package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloFriendTest {
    @DisplayName("Test hiFriend() method")
    @Test
    void testHiFriend(){
        assertEquals("Hi Larry Sprinkle!", HelloFriend.hiFriend("Larry Sprinkle"));
    }
}
