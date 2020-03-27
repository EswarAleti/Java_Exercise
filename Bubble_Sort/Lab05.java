import java.util.Scanner;

public class Lab05
{
  public static void main(String[] args)
  {
    int length = args.length;
    int[] array =new int[length];
    for(int i=0;i<length;i++)
    {
      try 
      {
        array[i]=Integer.parseInt(args[i]);
      }catch (NumberFormatException nfe) 
      {
        System.out.println("Error: Bad integer: <"+args[i]+">");
        System.exit(1);
      }
    }
    IntArrayUtils.intDisplayArray(array);
    IntArrayUtils.intBubbleSort(array);
    IntArrayUtils.intDisplayArray(array);
  }
}