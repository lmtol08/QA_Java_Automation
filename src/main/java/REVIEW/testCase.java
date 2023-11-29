package REVIEW;

public class testCase {
    public static void main(String[] args) {
        int[] nums = {3, 5, 9, 2, 7, 1};
        int result = findLargest(nums);
        System.out.println("Largest value: " + result);
        System.out.println("==============================================================================" );

        int[] originalArray = {1, 2, 3};
        int[] rotatedArray = rotateLeft(originalArray);

        // Print the original and rotated arrays
        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
        System.out.println("Rotated Array: " + java.util.Arrays.toString(rotatedArray));
        System.out.println("==============================================================================" );

            int[] nums1 = {2, 3};
            int[] nums2 = {4, 2};
            int[] nums3 = {3, 5};

            System.out.println("Array 1 has 2 or 3: " + has23(nums1));
            System.out.println("Array 2 has 2 or 3: " + has23(nums2));
            System.out.println("Array 3 has 2 or 3: " + has23(nums3));
        System.out.println("==============================================================================" );

        int[] numbs1 = {4, 5, 6};
        int[] numsb2 = {1, 2};

        System.out.println("Original Array 1: " + array2ToString(nums1));
        int[] result1 = makeLast(nums1);
        System.out.println("Result Array 1: " + array2ToString(result1));

        System.out.println("Original Array 2: " + array2ToString(nums2));
        int[] result2 = makeLast(nums2);
        System.out.println("Result Array 2: " + array2ToString(result2));
        System.out.println("==============================================================================" );

        int cigars1 = 30;
        int cigars2 = 45;
        boolean isWeekend = false;

        System.out.println("Cigars: " + cigars1 + ", Weekend: " + isWeekend + " - Can have a cigar party? " + cigarParty(cigars1, isWeekend));
        System.out.println("Cigars: " + cigars2 + ", Weekend: " + isWeekend + " - Can have a cigar party? " + cigarParty(cigars2, isWeekend));

        // If it's a weekend, you can have a cigar party regardless of the number of cigars
        isWeekend = true;
        System.out.println("Cigars: " + cigars1 + ", Weekend: " + isWeekend + " - Can have a cigar party? " + cigarParty(cigars1, isWeekend));
        System.out.println("Cigars: " + cigars2 + ", Weekend: " + isWeekend + " - Can have a cigar party? " + cigarParty(cigars2, isWeekend));
        System.out.println("==============================================================================" );

            int[] swap1 = {1, 2, 3, 4, 5};
            int[] swap2 = {8, 6, 7, 9, 5};
            int[] swap3 = {3, 1};

            System.out.println("Original Array 1: " + arrayToString(swap1));
            swapFirstAndLast(nums1);
            System.out.println("Array 1 after swapping first and last elements: " + arrayToString(swap1));

            System.out.println("Original Array 2: " + arrayToString(swap2));
            swapFirstAndLast(nums2);
            System.out.println("Array 2 after swapping first and last elements: " + arrayToString(swap2));

            System.out.println("Original Array 3: " + arrayToString(swap3));
            swapFirstAndLast(nums3);
            System.out.println("Array 3 after swapping first and last elements: " + arrayToString(swap3));
        System.out.println("==============================================================================" );


        }
    //Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
    public static int findLargest(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

       return Math.max(Math.max(first, middle), last);

        // Compare and find the largest value
      //  int largest = (first > last) ? (first > middle ? first : middle) : (last > middle ? last : middle);

      //  return largest;

    }
    // Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public static int[] rotateLeft(int[] nums) {
        int[] rotatedArray = {nums[1], nums[2], nums[0]};
        return rotatedArray;
    }
// Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

    public static boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3) && (nums[1] == 2 || nums[1] == 3); }

// Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

    public static int[] swapFirstAndLast(int[] swap) {
        if (swap.length >= 2) {
            int temp = swap[0];
            swap[0] = swap[swap.length - 1];
            swap[swap.length - 1] = temp;
        }
        return swap;
    }

    // Utility method to convert an array to a string for printing
    public static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

// Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
public static int[] makeLast(int[] numbs) {
    int[] result = new int[numbs.length * 2];
    result[result.length - 1] = numbs[numbs.length - 1];
    return result;
}

    // Utility method to convert an array to a string for printing
    public static String array2ToString(int[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }


// When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.

    public static  boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }


// You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int speedLimit1 = isBirthday ? 65 : 60;
        int speedLimit2 = isBirthday ? 85 : 80;

        if (speed <= speedLimit1) {
            return 0;
        } else if (speed <= speedLimit2) {
            return 1;
        } else {
            return 2;
        }
    }

// Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    public boolean more20(int n) {
        return (n % 20 == 1) || (n % 20 == 2); }

// Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

    public boolean nearTen(int num) {
        return (num % 10 <= 2) || (num % 10 >= 8); }


// We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0; // bad
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2; // great
        } else {
            return 1; // good
        }
    }

// Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a); }

// Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.

    public String fizzBuzz(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if (startsWithF) {
            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return str;
        }
    }


// Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.

    public boolean less20(int n) {
        return (n % 20 == 18) || (n % 20 == 19); }


// Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {  // Weekdays
                return "10:00";
            } else {  // Weekends
                return "off";
            }
        } else {
            if (day >= 1 && day <= 5) {  // Weekdays
                return "7:00";
            } else {  // Weekends
                return "10:00";
            }
        }
    }


// Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

    public boolean answerCell(boolean isMorning, boolean isMomCalling, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (isMorning && !isMomCalling) {
            return false;
        } else {
            return true;
        }
    }

// Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

    public boolean shareDigit(int a, int b) {
        int aLeftDigit = a / 10;
        int aRightDigit = a % 10;
        int bLeftDigit = b / 10;
        int bRightDigit = b % 10;

        return (aLeftDigit == bLeftDigit || aLeftDigit == bRightDigit ||
                aRightDigit == bLeftDigit || aRightDigit == bRightDigit); }

// You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0; // no
        } else if (you >= 8 || date >= 8) {
            return 2; // yes
        } else {
            return 1; // maybe
        }
    }

// The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

    public boolean squirrelPlay(int temperature, boolean isSummer) {
        int upperLimit = isSummer ? 100 : 90;
        return temperature >= 60 && temperature <= upperLimit; }

}


