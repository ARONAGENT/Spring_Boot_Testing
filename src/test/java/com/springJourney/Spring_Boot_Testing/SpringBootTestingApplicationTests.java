package com.springJourney.Spring_Boot_Testing;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


class SpringBootTestingApplicationTests {

// Using AssertJ comes with package
// import org.assertj.core.api.Assertions;

//	for Integer
	@Test
	void test3(){
		int a=5;
		int b=6;
		int result = addTwoNumbers(a,b);
		Assertions.assertThat(11).isEqualTo(result).isNotEqualTo(10);
		System.out.println("Test working fine ...");
	}

	//for String
	@Test
	void test4(){
		assertThat("Banana")
				.isEqualTo("Banana")
				.startsWith("Ba")
				.endsWith("a");
		System.out.println("String Matches Successfully ...");
	}


//	 for Boolean
	@Test
	void  test5(){
		assertThat(true).isTrue();
		System.out.println("Boolean test working fine ....");
	}

	@Test
	void test6(){
     assertThat(List.of("apple","banana","mango")).isNotNull();
		System.out.println("List test working fine ....");

	}

	int divideTwoNumber(int a,int b){
		try{
			return a/b;
		}
		catch (ArithmeticException e){
			throw new ArithmeticException("Cannot divide by Zero");
		}
	}

//	@Test
//	void test7Exception(){
//		int a=3;
//		int b=0;
//		// asserting if the test give the correct exception or not
//		assertThatThrownBy(()->
//				divideTwoNumber(a,b))
//				.isInstanceOf(NullPointerException.class)
//				.hasMessage("Cannot divide by Zero");
//		System.out.println("Test gives proper exception if exception occur .....");
//	}


//	  Using Junit Assertions Comes with package ....
//	import org.junit.jupiter.api.*;

//	@Test
//	void TestNumberOne(){
//		int a=5;
//		int b=10;
//		int result= addTwoNumbers(a,b);
//		Assertions.assertEquals(16,result);
//
//	}
	int addTwoNumbers(int a,int b){
		return a+b;
	}


	@BeforeAll
    static void setupOnce(){
		System.out.println("Initializing once ...");
	}

	@AfterAll
	static  void  doneOnce(){
		System.out.println("Terminating once ...");
	}
	@BeforeEach
	void setupTest(){
		System.out.println("Initializing something ...");
	}
	@AfterEach
	void  doneTest(){
		System.out.println("Terminating Test ...");
	}

	@Test
	@DisplayName("firstTest")
	void testNumberOne() {
		System.out.println("Running Test 1 ...");
	}

	@Test
	//@Disabled
	@DisplayName("secondTest")
	void testNumberTwo(){
		System.out.println("Running Test 2 ... ");
	}





}

