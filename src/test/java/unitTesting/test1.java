package unitTesting;

import ArrayHW.*;
import REVIEW.testCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

import static ArrayHW.Problem1.sumofnums;

/*
    TestNG testing framework is one that offers several advantages over other frameworks, such as JUnit and NUnit. .
  TestNG is designed to be more flexible and extensible, and it provides features
  that make it easier to write and run tests.

  provide a way to write and run tests. ie MANAGE THE TEST

  CAN MAGAE MULTIPLE PARAMETRS INTO ONE TEST.
  CAN DO PARALLEL TESTING = TEEST ON CHROME, INTERNET EXPLORWE AND EDGE

  offers functionality like test structuring, assestions (to verify test results), and test reporting.

TestNG Java test for Boolean

import org.testng.Assert;
import org.testng.annotations.Test;

public class BooleanTest {

    // Your class with the method to test
    public class NumberChecker {
        public boolean isEven(int number) {
        }
    }

    @Test
    public void testIsEven() {
        // Arrange
        NumberChecker numberChecker = new NumberChecker();

        // Act
        boolean result1 = numberChecker.isEven(4);
        boolean result2 = numberChecker.isEven(7);

        // Assert
        Assert.assertTrue(result1, "4 should be even");
        Assert.assertFalse(result2, "7 should not be even");
    }
}

•	TestNG Java test for string

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTest {

    // Your class with the method to test
    public class StringManipulator {
        public String concatenateStrings(String str1, String str2) {
            return str1 + str2;
        }
    }

    @Test
    public void testConcatenateStrings() {
        // Arrange
        StringManipulator stringManipulator = new StringManipulator();

        // Act
        String result = stringManipulator.concatenateStrings("Hello", "World");

        // Assert
        Assert.assertEquals(result, "HelloWorld", "Concatenation result is incorrect");
    }
}


•	TestNG Java test for integers
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTest {

    // Your class with the method to test
    public class Calculator {
        public int addNumbers(int a, int b) {
            return a + b;
        }
    }

    @Test
    public void testAddNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.addNumbers(3, 5);

        // Assert
        Assert.assertEquals(result, 8, "Addition result is incorrect");
    }
}



   */
public class test1 {

    /*
     @Test
    public void test1() {
        // WRITET TEST IN FRONT
        int a = 10;
        int b = 20;
        int c = 30;

        Assert.assertEquals(30, a + b);
        Assert.assertEquals(a + b, 30);

    }

     */


    @Test
    public void Testsumofnums() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 15;

        int result = Problem1.sumofnums(array);

        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void TestfindMax() {
        // Test case 1: Array with positive integers
        int[] array1 = {1, 2, 8, 9};
        int result1 = Problem2.findMax(array1);
        Assert.assertEquals(result1, 9);

        // Test case 3: Array with a single element
        int[] array3 = {10};
        int result3 = Problem2.findMax(array3);
        Assert.assertEquals(result3, 10);

        // Test case 4: Empty array
        //  int[] array4 = {};
        // int result4 = Problem2.findMax(array4);
    }

    @Test
    public void testFindMin() {
        // Test case 1: Array with positive integers
        int[] array1 = {2, 55, 4, 3, 7};
        int result1 = Problem3.findMin(array1);
        Assert.assertEquals(result1, 2);

        // Test case 2: Array with negative integers
        int[] array2 = {-1, -5, -3, -2};
        int result2 = Problem3.findMin(array2);
        Assert.assertEquals(result2, -5);

        // Test case 3: Array with a single element
        int[] array3 = {10};
        int result3 = Problem3.findMin(array3);
        Assert.assertEquals(result3, 10);

        // Test case 4: Empty array
        // int[] array4 = {};
        //  int result4 = Problem3.findMin(array4);
        //  Assert.assertEquals(result4, Integer.MAX_VALUE); // Assuming Integer.MAX_VALUE for an empty array
    }

    @Test
    public void testRotateNums() {
        // Test case 1: Array with positive integers and rotations
        int[] array1 = {1, 2, 3, 4, 5};
        int rotations1 = 3;
        int[] expectedResult1 = {3, 4, 5, 1, 2};
        Problem4.rotatenums(array1, rotations1);
        Assert.assertEquals(array1, expectedResult1);

        // Test case 2: Array with negative integers and rotations
        // int[] array2 = {-1, -2, -3, -4, -5};
        // int rotations2 = 2;
        //  int[] expectedResult2 = {-3, -4, -5, -1, -2};
        //  Problem4.rotatenums(array2, rotations2);
        //   Assert.assertEquals(array2, expectedResult2);

        // Test case 3: Array with a single element and rotations
        //  int[] array3 = {10};
        //   int rotations3 = 1;
        //    int[] expectedResult3 = {10};
        //    Problem4.rotatenums(array3, rotations3);
        // Assert.assertEquals(array3, expectedResult3);

        // Test case 4: Empty array and rotations
        //   int[] array4 = {};
        //    int rotations4 = 0;
        //   int[] expectedResult4 = {};
        //   Problem4.rotatenums(array4, rotations4);
        //   Assert.assertEquals(array4, expectedResult4);
    }

    @Test
    public void testSort() {
        // Test case 1: Array with unordered positive integers
        int[] array1 = {5, 2, 1, 7, 4, 0};
        int[] expectedResult1 = {0, 1, 2, 4, 5, 7};
        Problem5.Sort(array1);
        Assert.assertEquals(array1, expectedResult1);

        // Test case 2: Array with unordered negative integers
        int[] array2 = {-5, -2, -1, -7, -4, 0};
        int[] expectedResult2 = {-7, -5, -4, -2, -1, 0};
        Problem5.Sort(array2);
        Assert.assertEquals(array2, expectedResult2);

        // Test case 3: Array with a single element
        int[] array3 = {10};
        int[] expectedResult3 = {10};
        Problem5.Sort(array3);
        Assert.assertEquals(array3, expectedResult3);

        // Test case 4: Empty array
        // int[] array4 = {};
        // int[] expectedResult4 = {};
        //  Problem5.Sort(array4);
        //   Assert.assertEquals(array4, expectedResult4);
    }

    @Test
    public void testReverseArray() {
        // Test case 1: Array with positive integers
        int[] array1 = {6, 7, 8, 9, 10};
        int[] expectedResult1 = {10, 9, 8, 7, 6};
        Problem6.reverseArray(array1);
        Assert.assertEquals(array1, expectedResult1);

        // Test case 2: Array with negative integers
        int[] array2 = {-6, -7, -8, -9, -10};
        int[] expectedResult2 = {-10, -9, -8, -7, -6};
        Problem6.reverseArray(array2);
        Assert.assertEquals(array2, expectedResult2);

        // Test case 3: Array with a single element
        int[] array3 = {10};
        int[] expectedResult3 = {10};
        Problem6.reverseArray(array3);
        Assert.assertEquals(array3, expectedResult3);

        // Test case 4: Empty array
        int[] array4 = {};
        int[] expectedResult4 = {};
        Problem6.reverseArray(array4);
        Assert.assertEquals(array4, expectedResult4);
    }

    @Test
    public void testDupesInString() {
        // Test case 1: Array with duplicate elements
        int[] array1 = {4, 1, 5, 7, 6, 9, 4, 1, 5, 7, 6, 9};
        Problem7.DupesinString(array1);

        // Test case 2: Array without duplicate elements
        int[] array2 = {1, 2, 3, 4, 5};
        Problem7.DupesinString(array2);

        // Test case 3: Array with a single element
        int[] array3 = {10};
        Problem7.DupesinString(array3);

        // Test case 4: Empty array
        int[] array4 = {};
        Problem7.DupesinString(array4);
    }

    @Test
    public void testEvenOdd() {
        // Test case 1: Array with even and odd numbers
        int[] array1 = {40, 33, 2, 7, 5, 9, 88};
        Problem8.EvenOdd(array1);

        // Test case 2: Array with only even numbers
        int[] array2 = {2, 4, 6, 8, 10};
        Problem8.EvenOdd(array2);

        // Test case 3: Array with only odd numbers
        int[] array3 = {1, 3, 5, 7, 9};
        Problem8.EvenOdd(array3);

        // Test case 4: Array with a single element
        int[] array4 = {10};
        Problem8.EvenOdd(array4);

        // Test case 5: Empty array
        int[] array5 = {};
        Problem8.EvenOdd(array5);
    }

    @Test
    public void testFindMissingNum() {
        // Test case 1: Array with a missing number
        int[] array1 = {3, 1, 0, 4, 6, 2};
        int expectedResult1 = 5;
        int result1 = Problem9.findMissingNum(array1);
        Assert.assertEquals(result1, expectedResult1);

        // Test case 2: Array without a missing number
        int[] array2 = {3, 1, 0, 4, 6, 2, 5};
        int expectedResult2 = 7;
        int result2 = Problem9.findMissingNum(array2);
        Assert.assertEquals(result2, expectedResult2);

        // Test case 3: Array with a single element
        //int[] array3 = {10};
        //    int expectedResult3 = 0;
        // int result3 = Problem9.findMissingNum(array3);
//Assert.assertEquals(result3, expectedResult3);

        // Test case 4: Empty array
        int[] array4 = {};
        int expectedResult4 = 0;
        int result4 = Problem9.findMissingNum(array4);
        Assert.assertEquals(result4, expectedResult4);
    }

    @Test
    public void testRemoveDuplicates() {
        // Test case 1: Array with duplicates
        int[] array1 = {3, 1, 2, 2, 4, 3, 5, 1};
        int[] expectedResult1 = {3, 1, 2, 4, 5};
        int[] result1 = Problem10.removeDuplicates(array1);
        Arrays.sort(result1);
        Arrays.sort(expectedResult1);
        Assert.assertEquals(result1, expectedResult1);
        /*
 // Test case 2: Array without duplicates
        int[] array2 = {1, 2, 3, 4, 5};
        int[] expectedResult2 = {1, 2, 3, 4, 5};
        int[] result2 = Problem10.removeDuplicates(array2);
        Arrays.sort(result2);
        Arrays.sort(expectedResult2);
        Assert.assertEquals(result2, expectedResult2);

        // Test case 3: Array with a single element
        int[] array3 = {10};
        int[] expectedResult3 = {10};
        int[] result3 = Problem10.removeDuplicates(array3);
        Arrays.sort(result3);
        Arrays.sort(expectedResult3);
        Assert.assertEquals(result3, expectedResult3);

        // Test case 4: Empty array
        int[] array4 = {};
        int[] expectedResult4 = {};
        int[] result4 = Problem10.removeDuplicates(array4);
        Arrays.sort(result4);
        Arrays.sort(expectedResult4);
        Assert.assertEquals(result4, expectedResult4);
    }
         */
    }

    @Test
    public void testFindLargest() {
        // Test case 1: Array with odd length
        int[] array1 = {3, 1, 5, 7, 9};
        int expectedResult1 = 9;
        int result1 = testCase.findLargest(array1);
        Assert.assertEquals(result1, expectedResult1);
/*
  // Test case 2: Array with a single element
        int[] array2 = {10};
        int expectedResult2 = 10;
        int result2 = testCase.findLargest(array2);
        Assert.assertEquals(result2, expectedResult2);

        // Test case 3: Array with negative integers
        int[] array3 = {-1, -3, -5, -7, -9};
        int expectedResult3 = -1;
        int result3 = testCase.findLargest(array3);
        Assert.assertEquals(result3, expectedResult3);
 */

    }

    @Test
    public void testRotateLeft() {
        // Test case 1: Array with three elements
        int[] array1 = {1, 2, 3};
        int[] expectedResult1 = {2, 3, 1};
        int[] result1 = testCase.rotateLeft(array1);
        Assert.assertEquals(result1, expectedResult1);
/*
// Test case 2: Array with a single element
        int[] array2 = {10};
        int[] expectedResult2 = {10};
        int[] result2 = testCase.rotateLeft(array2);
        Assert.assertEquals(result2, expectedResult2);

        // Test case 3: Array with negative integers
        int[] array3 = {-1, -2, -3};
        int[] expectedResult3 = {-2, -3, -1};
        int[] result3 = testCase.rotateLeft(array3);
        Assert.assertEquals(result3, expectedResult3);
 */

    }

    @Test
    public void testHas23() {
        // Test case 1: Array contains 2 and 3
        int[] array1 = {2, 3, 5, 6};
        boolean result1 = testCase.has23(array1);
        Assert.assertTrue(result1);
/*
 // Test case 2: Array contains only 2
       // int[] array2 = {2, 7, 8};
        boolean result2 = testCase.has23(array2);
        Assert.assertTrue(result2);

        // Test case 3: Array contains only 3
        int[] array3 = {4, 3, 9};
        boolean result3 = testCase.has23(array3);
        Assert.assertTrue(result3);

        // Test case 4: Array does not contain 2 or 3
        int[] array4 = {1, 4, 5};
        boolean result4 = testCase.has23(array4);
        Assert.assertFalse(result4);
 */

    }

    @Test
    public void testSwapFirstAndLast() {
        // Test case 1: Array with more than one element
        int[] array1 = {1, 2, 3, 4};
        int[] expectedResult1 = {4, 2, 3, 1};
        int[] result1 = testCase.swapFirstAndLast(array1);
        Assert.assertEquals(result1, expectedResult1);
        Assert.assertEquals(testCase.swapFirstAndLast(array1),expectedResult1);
        // Test case 2: Array with one element
        int[] array2 = {5};
        int[] expectedResult2 = {5};
        int[] result2 = testCase.swapFirstAndLast(array2);
        Assert.assertEquals(result2, expectedResult2);

        // Test case 3: Empty array
        int[] array3 = {};
        int[] expectedResult3 = {};
        int[] result3 = testCase.swapFirstAndLast(array3);
        Assert.assertEquals(result3, expectedResult3);
    }

    @Test
    public void testArrayToString() {
        // Test case 1: Array with multiple elements
        int[] array1 = {1, 2, 3, 4, 5};
        String expectedResult1 = "[1, 2, 3, 4, 5]";
        String result1 = testCase.arrayToString(array1);
        Assert.assertEquals(result1, expectedResult1);

        // Test case 2: Array with a single element
        int[] array2 = {10};
        String expectedResult2 = "[10]";
        String result2 = testCase.arrayToString(array2);
        Assert.assertEquals(result2, expectedResult2);

        // Test case 3: Empty array
        int[] array3 = {};
        String expectedResult3 = "[]";
        String result3 = testCase.arrayToString(array3);
        Assert.assertEquals(result3, expectedResult3);
    }

    @Test
    public void testMakeLast() {
        // Test case 1: Array with multiple elements
        int[] array1 = {1, 2, 3, 4, 5};
        int[] expectedResult1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 5};
        int[] result1 = testCase.makeLast(array1);
        Assert.assertEquals(result1, expectedResult1);

        // Test case 2: Array with a single element
        int[] array2 = {10};
        int[] expectedResult2 = {0, 10};
        int[] result2 = testCase.makeLast(array2);
        Assert.assertEquals(result2, expectedResult2);

    }

    @Test
    public void testArray2ToString() {
        // Test case: Array with multiple elements
        int[] array = {1, 2, 3, 4, 5};
        String expectedResult = "[1, 2, 3, 4, 5]";
        String result = testCase.array2ToString(array);
        Assert.assertEquals(result, expectedResult);

        // Test case: Array with a single element
        int[] singleElementArray = {10};
        String expectedResultSingle = "[10]";
        String resultSingle = testCase.array2ToString(singleElementArray);
        Assert.assertEquals(resultSingle, expectedResultSingle);

        // Test case: Empty array
        int[] emptyArray = {};
        String expectedResultEmpty = "[]";
        String resultEmpty = testCase.array2ToString(emptyArray);
        Assert.assertEquals(resultEmpty, expectedResultEmpty);
    }

    @Test
    public void testCigarParty() {
        // Test case 1: Weekend and enough cigars
        boolean result1 = testCase.cigarParty(45, true);
        Assert.assertTrue(result1);

        // Test case 2: Weekend but not enough cigars
        boolean result2 = testCase.cigarParty(30, true);
        Assert.assertFalse(result2);

        // Test case 3: Not weekend but enough cigars
        boolean result3 = testCase.cigarParty(50, false);
        Assert.assertTrue(result3);

        // Test case 4: Not weekend and not enough cigars
        boolean result4 = testCase.cigarParty(35, false);
        Assert.assertFalse(result4);
    }

    @Test
    public void testCaughtSpeedingWithinLimit() {
        testCase trafficPolice = new testCase();
        int result = trafficPolice.caughtSpeeding(55, false);
        Assert.assertEquals(result, 0);
    }
/*
@Test
    public void testCaughtSpeedingSmallTicket() {
        testCase trafficPolice = new testCase();
        int result = trafficPolice.caughtSpeeding(70, false);
        Assert.assertEquals(result, 1);
    }
 */


    @Test
    public void testMore20WithRemainder1() {
        testCase numberChecker = new testCase();
        boolean result = numberChecker.more20(21);
        Assert.assertTrue(result);
    }

    @Test
    public void testnearTen() {
        testCase numberChecker = new testCase();
        boolean result = numberChecker.nearTen(21);
        Assert.assertTrue(result);
    }

    @Test
    public void testTeaPartyBad() {
        testCase partyPlanner = new testCase();
        int result = partyPlanner.teaParty(3, 7);
        Assert.assertEquals(result, 0);
    }

    /*
    @Test
        public void testTeaPartyGreat() {
            testCase partyPlanner = new testCase();
            int result = partyPlanner.teaParty(8, 4);
            Assert.assertEquals(result, 2);
        }

        @Test
        public void testTeaPartyGood() {
            testCase partyPlanner = new testCase();
            int result = partyPlanner.teaParty(5, 10);
            Assert.assertEquals(result, 1);
        }



        @Test
        public void testTeaPartyEqualAmounts() {
            testCase partyPlanner = new testCase();
            int result = partyPlanner.teaParty(6, 6);
            Assert.assertEquals(result, 1);
        }

        @Test
        public void testTeaPartyEdgeCase() {
            testCase partyPlanner = new testCase();
            int result = partyPlanner.teaParty(5, 5);
            Assert.assertEquals(result, 1);
        }

     */
    @Test
    public void testTwoAsOneTrue1() {
        testCase numberChecker = new testCase();
        boolean result = numberChecker.twoAsOne(2, 3, 5);
        Assert.assertTrue(result);
    }
/*
 @Test
    public void testTwoAsOneTrue2() {
        testCase numberChecker = new testCase();
        boolean result = numberChecker.twoAsOne(5, 3, 2);
        Assert.assertTrue(result);
    }

    @Test
    public void testTwoAsOneTrue3() {
        testCase numberChecker = new testCase();
        boolean result = numberChecker.twoAsOne(-1, 0, -1);
        Assert.assertTrue(result);
    }

    @Test
    public void testTwoAsOneFalse() {
        testCase numberChecker = new testCase();
        boolean result = numberChecker.twoAsOne(1, 2, 5);
        Assert.assertFalse(result);
    }

    @Test
    public void testTwoAsOneZero() {
        testCase numberChecker = new testCase();
        boolean result = numberChecker.twoAsOne(0, 0, 0);
        Assert.assertTrue(result);
    }
 */


    @Test
    public void testFizzBuzz() {
        testCase fizzBuzzGenerator = new testCase();

        Assert.assertEquals(fizzBuzzGenerator.fizzBuzz("Buzz"), "Buzz");
        //   Assert.assertEquals(fizzBuzzGenerator.fizzBuzz("bar"), "Fizz");
    }

    @Test
    public void testLess20Mod18() {
        testCase numberEvaluator = new testCase();
        boolean result = numberEvaluator.less20(38);
        Assert.assertTrue(result);
    }

    @Test
    public void testWeekdayVacation() {
        testCase alarmClock = new testCase();
        String result = alarmClock.alarmClock(3, true);
        Assert.assertEquals(result, "10:00");
    }
/*
   @Test
    public void testWeekendVacation() {
        testCase alarmClock = new testCase();
        String result = alarmClock.alarmClock(6, true);
        Assert.assertEquals(result, "off");
 */



    @Test
    public void testAnswerCellNotAsleep() {
        testCase phoneAnswerer = new testCase();
        boolean result = phoneAnswerer.answerCell(false, true, false);
        Assert.assertTrue(result);
    }
/*
@Test
    public void testAnswerCellMorningMomCalling() {
        testCase phoneAnswerer = new testCase();
        boolean result = phoneAnswerer.answerCell(true, true, false);
        Assert.assertTrue(result);
    }
 */


    @Test
    public void testShareDigitSameDigits() {
        testCase digitSharingChecker = new testCase();
        boolean result = digitSharingChecker.shareDigit(12, 23);
        Assert.assertTrue(result);
    }
/*
@Test
    public void testShareDigitOneCommonDigit() {
        testCase digitSharingChecker = new testCase();
        boolean result = digitSharingChecker.shareDigit(45, 54);
        Assert.assertTrue(result);
    }

 */

    @Test
    public void testNoFashion() {
        testCase decider = new testCase();
        int result = decider.dateFashion(2, 5);
        Assert.assertEquals(result, 0);
    }

    /*
     @Test
    public void testMaybeFashion() {
        testCase decider = new testCase();
        int result = decider.dateFashion(5, 5);
        Assert.assertEquals(result, 1);
     */

    @Test
    public void testSquirrelPlayInSummer() {
        testCase squirrelPlay = new testCase();
        boolean result = squirrelPlay.squirrelPlay(70, true);
        Assert.assertTrue(result);
    }
/*
 @Test
    public void testSquirrelPlayNotInSummer() {
        testCase squirrelPlay = new testCase();
        boolean result = squirrelPlay.squirrelPlay(85, false);
        Assert.assertTrue(result);
    }
}

 */
}





