
//Write a java program to check whether the middle element present in an array is even or not.
public class main
{
  public static void main(String[] args)
  {
    int[] arr={4,1,7,8,2,9,1,4,7};
    System.out.println(middleElement(arr,arr.length));
  
  
  }
  
  public static boolean functionEvenOrNot(int number)
  {
  //check if number is even or not
  
   if(number % 2 == 0)
   {
 	return true;
   }
   else
   {
   	return false;
   }
     
  }
  public static String middleElement(int []arr,int arrlength)
  {
    //chek the element is middle in the array 
    int result=(arrlength-1)/2;
    if(functionEvenOrNot(arr[result]))
    {
  	 return "even";
    }
  	 return "odd";
  }




}
