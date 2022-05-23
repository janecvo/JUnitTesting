// package com.example;

// // import org.junit.jupiter.api.*;
// // import org.junit.jupiter.api.Test;
// // import org.junit.jupiter.api.AfterAll;
// // import org.junit.jupiter.api.AfterEach;
// // import org.junit.jupiter.api.BeforeAll;
// // import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.CsvSource;
// // import org.junit.jupiter.params.provider.ValueSource;
// // import org.junit.jupiter.params.provider.EnumSource;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// // import static org.junit.jupiter.api.Assertions.assertNotNull;

// @DisplayName("Should pass the method parameters provided by the @CsvSource annotation")
// class CsvSourceExampleTest {

//     @DisplayName("Should calculate the correct sum")
//     @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
//     @CsvSource({
//             "1, 1, 2",
//             "2, 3, 5"
//     })
//     void sum(int a, int b, int sum) {
//         assertEquals(sum, a + b);
//     }
// }

// @DisplayName("Pass enum values to our test method")
// class EnumSourceExampleTest{
//     @DisplayName("Should pass only the specified enum value as a method parameter")
//     @ParameterizedTest(name = "{index} => pet= ' ' {0} ' ' ")
//     @EnumSource(value = Pet.class, names = {"CAT"})
//     void shouldPassNonNullEnumValueAsMethodParameter(Pet pet){
//         assertNotNull(pet);
//     }
// }

// @DisplayName("Pass enum values to our test method")
// class EnumSourceExampleTest{
//     @DisplayName("Should pass a non-null message to our test method")
//     @ParameterizedTest(name = "{index} => pet= ' ' {0} ' ' ")
//     @EnumSource(Pet.class)
//     void shouldPassNonNullEnumValueAsMethodParameter(Pet pet){
//         assertNotNull(pet);
//     }
// }

// @DisplayName("Pass the method parameters provided by the @ValueSource annotation")
// class ValueSourceExampleTest{
//     @DisplayName("Should pass a non-null message to our test method")
//     @ParameterizedTest(name = "{index} => message= ' ' {0} ' ' ")
//     @ValueSource(strings = {"Hello", "World"})
//     void shouldPassNonNullMessageAsMethodParameter(String message){
//         assertNotNull(message);
//     }
// }

// //four stepup and teardown methods
// //two conditions: return type is void
// //Setup and teardown methods can NOT be private
// //methods annotated with @BeforeAll must be STATIC and runs once before test methods
// //methods annotated with @AfterEach is invoked after each test method
// //method annotated with @AfterAll must be STATIC and runs once after all test methods

// @DisplayName("JUnit 5 Nested Example")
// class JUnit5NestedExampleTest {

//     @BeforeAll
//     static void beforeAll(){
//         System.out.println("Before all test methods");
//     }

//     @BeforeEach
//     void BeforeEach(){
//         System.out.println("Before each test method");
//     }

//     @AfterEach
//     void AfterEach(){
//         System.out.println("After each test method");
//     }

//     @AfterAll
//     static void afterAll(){
//         System.out.println("After all test methods");
//     }

//     @Nested
//     @DisplayName("Tests for the method A")
//     class A{

//         @BeforeEach
//         void beforeEach(){
//             System.out.println("Before each test emthod of the A class");
//         }

//         @AfterEach
//         void afterEach(){
//             System.out.println("After each test method of A class");
//         }

//         @Test
//         @DisplayName("Exmaple test for method A")
//         void sampleTestForMethodA(){
//             System.out.println("Example test for Method A");
//         }
//     }

//     @Nested
//     @DisplayName("When X is true")
//     class WhenX{
//         @BeforeEach
//         void beforeEach(){
//             System.out.println("Before each test method of WhenX class");
//         }

//         @AfterEach
//         void afterEach(){
//             System.out.println("After each test method of WhenX class");
//         }

//         @Test
//         @DisplayName("Example test for method A when X is true")
//         void sampleTestForMethodAWhenX(){
//             System.out.println("Example test for metehod A when X is true");
//         }
//     }
// }


    
//     // @Test
//     // @DisplayName("First test")
//     // void firstTest(){
//     //     System.out.println("First test method");
//     // }

//     // @Test
//     // @DisplayName("Second test")
//     // void secondTest(){
//     //     System.out.println("Second test method");
//     // }

