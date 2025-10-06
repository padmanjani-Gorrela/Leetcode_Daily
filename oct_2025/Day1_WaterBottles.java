package oct_2025;

/*
Problem Statement:

There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
The operation of drinking a full water bottle turns it into an empty bottle.
Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

Example 1:
Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.

Example 2:
Input: numBottles = 15, numExchange = 4 
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.

*/
// Logic of the problem
import java.util.*;
public class Day1_WaterBottles{
    public int numWaterBottles(int numBottles, int numExchange){
        int result = numBottles;
        int empty= numBottles;
        while(empty >= numExchange){
            int newBottles = empty  / numExchange;
            result += newBottles;
            empty = empty % numExchange + newBottles;
        }
        return result;
    }

    //Main method to test the function
    public static void main(String[] args) {
        Day1_WaterBottles obj = new Day1_WaterBottles();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();
        System.out.print("Enter number of exchange bottles: ");
        int numExchange = sc.nextInt();
        int result = obj.numWaterBottles(numBottles, numExchange);
        System.out.println("Maximum number of water bottles you can drink: " + result);
        sc.close();
    }

    // Second logic method.
    public int numBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            empty = empty - numExchange;
            result++;
            empty++;
        }
        return result;

        /*
          code explanation:
          
         int result = numBottles;: result stores the total number of bottles drunk.
         Initially, you drink all numBottles you start with.
         int empty = numBottles;: empty stores the current count of empty bottles.
         After drinking the initial numBottles, you will have numBottles empty
         bottles.
         
         Exchange Loop:
         
         while(empty >= numExchange): This loop continues as long as you have enough
         empty bottles (empty) to exchange for a new full bottle (numExchange).
         empty = empty - numExchange;: You use numExchange empty bottles to get a new
         one, so these are deducted from your empty count.
         result++;: You get one new full bottle, drink it, so the total result
         increases by one.
         empty++;: After drinking the new bottle, it becomes an empty bottle, so your
         empty count increases by one.
         Return Value:
         
         return result;: Once you no longer have enough empty bottles to make an
         exchange, the loop terminates, and the final result (total bottles drunk) is
         returned.
         */
}
