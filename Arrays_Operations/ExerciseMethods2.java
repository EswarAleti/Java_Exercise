public class ExerciseMethods2
{

    public static boolean isPair(int[] nums, int value)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            //If value not existed in pair then return false
            if(nums[i]!=value && nums[i+1]!=value)
            {
                return false;
            }
        }
        return true;
    }

    public static int[] inFront(int[] numbs, int front)
    {
        //Index of front
        int index=0;
        for(int i=0;i<numbs.length;i++)
        {
            //If value occured then move to index
            if(numbs[i]==front)
            {
                for(int j=i;j>index;j--)
                {
                   numbs[j]=numbs[j-1];
                }
                numbs[index]=front;
                index++;
            }
        }
        return numbs;
    }

    public static boolean threeInARow(int[] numbs)
    {
        for(int i=0;i<numbs.length-2;i++)
        {
            //If numbs[i], numbs[i]+1, numbs[i]+2 occured then return true
            if(numbs[i]==numbs[i+1]-1 && numbs[i+1]==numbs[i+2]-1)
            {
               return true;
            }
        }
        return false;
    }

    public static String[] intoStringArray(int n)
    {
        //Create a new string artray
        String[] strs=new String[n];
        for(int i=0;i<n;i++)
        {
            //Convert (i+1) to String and insert into array
            strs[i]=""+(i+1);
        }
        return strs;
    }

    public static int slots(int n1, int n2, int n3)
    {
        //If all 3 are equal and winning numbers
        if(n1==n2 && n2==n3 && (n1==1 || n2==5 || n3==10))
        {
            return n1*100;
        }
        //If any n1,n2 numbers equal and winning numbers
        if(n1==n2 && n2!=3 && (n1==1 || n1==5 || n1==10))
        {
            return n1;
        }
        //If any n2,n3 numbers equal and winning numbers
        if(n1!=n2 && n2==n3 && (n2==1 || n2==5 || n2==10))
        {
            return n2;
        }
        //If any n1,n3 numbers equal and winning numbers
        if(n1==n3 && n1!=n2 && (n1==1 || n1==5 || n1==10))
        {
            return n1;
        }
        return 0;
    }
    
    public static char ticTacToe(char[][] board)
    {
        //First row
        if(board[0][0]==board[0][1] && board[0][1]==board[0][2])
        {
            return board[0][0];
        }
        //First column
        if(board[0][0]==board[1][0] && board[1][0]==board[2][0])
        {
            return board[0][0];
        }
        //TopLeft to BottomRight Diagonal
        if(board[0][0]==board[1][1] && board[1][1]==board[2][2])
        {
            return board[0][0];
        }
        //Last column
        if(board[0][2]==board[1][2] && board[1][2]==board[2][2])
        {
            return board[0][2];
        }
        //Last row
        if(board[2][0]==board[2][1] && board[2][1]==board[2][2])
        {
            return board[2][0];
        }
        //TopRight to BottomLeft diagonal
        if(board[0][2]==board[1][1] && board[1][1]==board[2][0])
        {
            return board[0][2];
        }
        return 'c';
    }

    public static int helperSum(int firstNum, int secondNum, int thirdNum)
    {
        return helperRound(firstNum)+helperRound(secondNum)+helperRound(thirdNum);
    }

    public static int helperRound(int n)
    {
        //If last digit is between [5,9]
        if(n%10>=5 && n%10<=9)
        {
            //Increment by (10 - n%10)
            return (n)+(10 - n%10);
        }
        //If last digit is between [1,4]
        else if(n%10>=1 && n%10<=4)
        {
            //Decrement by (n%10)
            return n-(n%10);
        }
        return n;
    }

    public static double extraMoney(double amount)
    {
        //Take integer part and add 1 and then substract amound from the result
        double extraAmount = ((int)amount+1)-amount;
        //Round two 2 decimal places
        extraAmount = Math.round(extraAmount*100.0)/100.0;
        return extraAmount;
    }

    public static String keepTheChange(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber )
    {
        double totalExtraMoney = extraMoney(firstNumber)+extraMoney(secondNumber)+extraMoney(thirdNumber)+extraMoney(fourthNumber);
        return "$"+totalExtraMoney;
    }

    public static String keepTheChange(double firstNumber, double secondNumber, double thirdNumber)
    {
        double totalExtraMoney = extraMoney(firstNumber)+extraMoney(secondNumber)+extraMoney(thirdNumber);
        return "$"+totalExtraMoney;
    }

    public static String keepTheChange(double firstNumber, double secondNumber)
    {
        double totalExtraMoney = extraMoney(firstNumber)+extraMoney(secondNumber);
        return "$"+totalExtraMoney;
    }

    public static String keepTheChange(double firstNumber)
    {
        double totalExtraMoney = extraMoney(firstNumber);
        return "$"+totalExtraMoney;
    }
    
    public static boolean hasIt(int number, int digit)
    {
        //Extract each digit
        while(number>0)
        {
            //If digit occured then return true
            if(number%10==digit)
            {
               return true;
            }
            //Reduce number by dividing with 10
            number/=10;
        }
        return false;
    }

    public static boolean hiBob(String bob)
    {
        //Convert bob to lower case
        bob=bob.toLowerCase();
        for(int i=0;i<bob.length()-2;i++)
        {
            //If first and third characters are b then return true
            if(bob.charAt(i)=='b' && bob.charAt(i+2)=='b')
            {
               return true;
            }
        }
        return false;
    }

    //Main function
    public static void main(String[] args) 
    {
        int nums[]={1,2,2,1,2,3,2};
        System.out.println( isPair(nums, 2));

        int numbs[]={1,2,2,1,2,3,2};
        inFront(numbs, 2);
        for(int i=0;i<numbs.length;i++)
        {
            System.out.print(numbs[i]+" ");
        }
        System.out.println();

        int numbs2[]={1,2,4,9,15,16,17,45};
        System.out.println( threeInARow(numbs2));

        int n=4;
        String[] strs=intoStringArray(n);
        for(int i=0;i<n;i++)
        {
            System.out.print(strs[i]+", ");
        }
        System.out.println();

        System.out.println(slots(8, 8, 10));

        char board[][]={{'x','o','x'},{'o','x','x'},{'o','x','o'}};
        System.out.println(ticTacToe(board));

        System.out.println( helperSum(2, 4, 6));

        System.out.println(keepTheChange(1.99, 1.99, 1.99, 1.99));

        System.out.println( hasIt(7585, 3));

        System.out.println(hiBob("abbbvbbbc"));
    }
}