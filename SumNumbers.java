import java.util.*;
public class SumNumbers
{
  // This method will return true if s is a numeric
  public static boolean isNumber(String s)
  {
    // Try to convert s to integer if it is success return true
    // If it is fail, then we get into catch block and return false
    try
    {
      Integer.parseInt(s);
      return true;
    }catch(Exception e){return false;}
  }
  public static void main(String[] args)
  {
    String str;
    int x;
    int length;
    int start = 0;
    int num;
    int lastSpace = -1;
    int sum = 0;
    String partStr;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a series of integers separated by spaces >> ");
    str = in.nextLine();
    length = str.length();
    for(x = 0; x < length; ++x)
    {
      if(str.charAt(x) == ' ')
      {  
        partStr = str.substring(lastSpace + 1, x);
        // If partStr is numeric then only convert it into integer and sum it up
        if(isNumber(partStr))
        {
          num = Integer.parseInt(partStr);
          System.out.println(" " + num);
          sum += num; 
        }
        lastSpace = x; 
      }
    }
    partStr = str.substring(lastSpace + 1, length);
    // If partStr is numeric then only convert it into integer and sum it up
    if(isNumber(partStr))
    {
      num = Integer.parseInt(partStr);
      System.out.println(" " + num);
      sum += num; 
    }
    System.out.println(" -------------------"+" The sum of the integers is " + sum);
  }
}