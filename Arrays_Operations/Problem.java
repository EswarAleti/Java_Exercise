public class ExerciseMethods2{

        /**
                Boolean function returns true if the given array is structured the given
                number is contained in every adjacent pair of numbers in the array. false otherwise.

                isPair([1,2], 2) returns true
                isPair([3,4,3,5],3) returns true
                isPair([3,4,3,5],5) returns false
                isPair([1,2,2,1,2,3,2],2) returns true
                @param nums int array,
                @param value int,
                @return true if the number is contained in each pair of adjacent
                numbers in the array. False otherwise.
        */
        public static boolean isPair(int[] nums, int value)
        {
                /* your code here */
    return true;
        }//end isPair

        /**
                Method inFront given an array and a number contained in the array,
                returns an array (a new one or the same reorded) with the given numbers
                moved to the front and the rest of the numbers in the order they appeared.
                if the number is not contained in the array, it returns the array unchanged.

                inFront([1,2], 2) returns [2,1]
                inFront([3,4,3,5],3) returns [3,3,4,5]
                inFront([3,4,3,5],5) returns [5,3,4,3]
                inFront([1,2,2,1,2,3,2],2) returns [2,2,2,2,,1,1,3]
                inFront([1,2,2,1,2,3,2],6) returns [1,2,2,1,2,3,2]
                @param nums integer array,
                @param front integer,
                @return An integer array with the number sent moved to the front of the array.
        */
   public static int[] inFront(int[] numbs, int front)
   {
                /* your code here */
                 return numbs;
   }// end inFront

        /**
                Method threeInARow returns true if the given array has 3 integers in a row (each
                incrementd by one). false otherwise,

                threeInARow([1,2,3]) returns true
                threeInARow([1,2,4,9,15]) returns false
                threeInARow([22,2,4,918,15]) returns false
                threeInARow([1,2,4,9,15,16,17,45]) returns true
                @param nums integer array,
                @return eturns true if the given array has 3 integers in a row.
        */
   public static boolean threeInARow(int[] numbs){
                /* your code here */
      return false;
   }// end threeInARow

         /**
                 Method intoStringArray returns an array of strings from "1" to n.
                 if n is 0 or less, it returns an empty string array.

                 intoStringArray(4) returns ["1","2","3","4"]
                 intoStringArray(0) returns []
                 intoStringArray(6) returns ["1","2","3","4","5","6"]
                 @param int n,
                 @return a string array of 1 to n strings.
         */
                 public static String[] intoStringArray(int n)
                 {
                /* your code here */
                                return new String[0];
                 }// end intoStringArray

                 /**
                        Method slots returns winnings if you get a winning combination.
                        Winning numbers are 1, 5, or 10.
                        3 in a row returns 100 * n.
                        2 in a row returns n

                        slots(0, 0, 0) returns 0
                        slots(10, 10, 10) returns 1000
                        slots(10, 0, 10) returns 10
                        slots(5, 10, 5) returns 5
                        slots(7, 7, 7) returns 0
                        slots(1, 1, 1) returns 100
                        slots(1, 5, 10) returns 0
                        slots(8, 8, 10) returns 0
                        @param int n1,
                        @param int n2,
                        @param int n3,
                        @return int value, where value is the winnings.
                */
   public static int slots(int n1, int n2, int n3)
   {
                        /* your code here */
      return 0;
   }//end slots

         /**
                Method ticTacToe returns the winner of a 2 dimentional array of x's and o's.
                If there is no winner, a c is returned. If both have a winner, x goes first, so they win.

                ticTacToe([['x','x','x'],
                                                         ['o','o','x'],
                                                         ['x,'o','o']]) returns 'x'
                ticTacToe([['o','x','o'],
                                                         ['o','x','x'],
                                                         ['x,'o','x']]) returns 'c'
                 ticTacToe([['x','x','o'],
                                                                 ['x','o','x'],
                                                                 ['o,'x','o']]) returns 'o'
                        ticTacToe([['x','o','x'],
                                                                 ['o','x','x'],
                                                                 ['o,'x','o']]) returns 'c'
                @param char[][] board,
                @return returns a charater representing the winner, 'x' , 'o', or, 'c' if
                the game is a tie.
                */
                 public static char ticTacToe(char[][] board)
                 {
                         /* your code here */
                                return 'c';
                 }//end ticTacToe

        /**
                Given three (non negitive) integers, round each numbe to the nearest 10.
                6-14 round to 10. 15-24 round to 20.
                return the sum of the 3 rounded numbers.
                Implement this way for credit:
                create another method directly below this one called helperRound() to round
                each number. Call that method and use the sum of the returned values.

                helperSum(8, 13, 10) returns 30
                helperSum(25, 26, 27) returns 90
                helperSum(2, 4, 6) returns 10
                @param firstNum int number,
                @param secondNum int number,
                @param thirdNum int number,
                @return the sum of the 3 numbers after rounding.
        */
   public static int helperSum(int firstNum, int secondNum, int thirdNum)
   {
     return helperRound(firstNum)+helperRound(secondNum)+helperRound(thirdNum);
   }//end helperSum

         /**
                Method HelperRound will round a number up or down to the nearrest 10.

                @param num int number,
                @return the rounded up or down number.
        */
    public static int helperRound(int n){
                        /* your code here */
                        return 0;
    }//end HelperRound


        /**
                Method keepTheChange returns the coin change to be give back if the
                customer pays for each item in the next whole dollar. The return value is a string in
                the form of "$0.00"  so that 22.99 retturns "$0.01" because we assume the
                customer paid with $23.00.
                This method needs to be overloaded so that it works for 1 to 4 items.

                keepTheChange(21.42) returns "$0.58"
                keepTheChange(15.50, 30.50) returns "$1.00"
                keepTheChange(21.42, 22.50, 23.99) returns "$1.09"
                topSkeepTheChangeum(1.99, 1.99, 1.99, 1.99) returns "$0.04"
                @param firstNumber double number,
                @param secondNumber double number,
                @param thirdNumber double number,
                @param fourthNumber double number,
                @return the sum of the largest two numbers sent.
        */
   public static String keepTheChange(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber )
   {
                 /* your code here */
                        return "done";

   }// end keepTheChange

         /**
          * Do overloaded methods here.
          * to compile, I am adding the method line.
          */

                public static String keepTheChange(double firstNumber, double secondNumber, double thirdNumber)
    {
                        /* your code here */
                        return "done";
    }// end keepTheChange
                public static String keepTheChange(double firstNumber, double secondNumber)
                {
                         /* your code here */
                                return "done";
                }// end keepTheChange
                public static String keepTheChange(double firstNumber)
                {
                        /* your code here */
                         return "done";
                }// end keepTheChange
        /**
                Method hasIt returns true if a digit is contained in the number. False Otherwise.

                hasIt(3, 3) returns true
                hasIt(1, 2) returns false
                hasIt(6314, 1) returns true
                hasIt(7585, 3) returns false
                @param nuber int number,
                @param digit int number,
                @return the sum of the numbers from the first to the second.
        */
        public static boolean hasIt(int number, int digit)
        {
                /* your code here */
           return false;
        }//end hasIt

        /**
                Method hiBob returns true if the string sent contains "bob", ingnoring
                case. Except the middle char 'o' can be any charater.  False otherwise.

                hiBob("bob") returns true
                hiBob("bib") returns true
                hiBob("abbbvbbbc") returns true
                hiBob("bocb") returns false
                @param bob string,
                @return true if any form of "bob" is present, false otherwise.
        */
        public static boolean hiBob(String bob)
        {
                /* your code here */
                return false;
        }//end hiBob

}//end ExerciseMethods2