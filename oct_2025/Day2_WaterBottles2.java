package oct_2025;

//Leetcode Problem 3100

/* 
Problem Statement:

You are given two integers numBottles and numExchange.
numBottles represents the number of full water bottles that you initially have. In one operation, you can perform one of the following operations:
Drink any number of full water bottles turning them into empty bottles.
Exchange numExchange empty bottles with one full water bottle. Then, increase numExchange by one.
Note that you cannot exchange multiple batches of empty bottles for the same value of numExchange. For example, if numBottles == 3 and numExchange == 1, you cannot exchange 3 empty water bottles for 3 full bottles.
Return the maximum number of water bottles you can drink.

Example 1:
Input: numBottles = 13, numExchange = 6
Output: 15
Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.

Example 2:
Input: numBottles = 10, numExchange = 3
Output: 13
Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.
 
*/

// Logic of the problem
import java.util.*;
public class Day2_WaterBottles2{
    public int numWaterBottles(int numBottles, int numExchange){
        int result = numBottles;
        int empty = numBottles;
        while( empty >= numExchange){
            empty = empty - numExchange;
            result++;
            empty++;
            numExchange++;
        }
        return result;
    }
    // Main method to test the function
    public static void main(String[] args) {
        Day2_WaterBottles2 obj = new Day2_WaterBottles2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();
        System.out.print("Enter number of exchange bottles: ");
        int numExchange = sc.nextInt();
        int result = obj.numWaterBottles(numBottles, numExchange);
        System.out.println("Maximum number of water bottles you can drink: " + result);
        sc.close();
    }
}
