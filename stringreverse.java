//1.Write a java program to reverse a string.
class code

{
    public static String str="fouziya";
    
    public static char[] arr=str.toCharArray();
    
    public static void main(String[] args)
    
    {
    
   	  //printing the output 
     
       	  System.out.println(arr);
         
       	  ReverseSubString(0,arr.length-1,arr);
         
          System.out.println(arr);
         
    }
    
    //implement the function
   
    public static void ReverseSubString(int start,int end, char[] arr)
    
    {
       while (start <= end)
       {
       //checking the arr start and end is correct or not
         char temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
       
       //return the increment and decrement
       
     	  start++;
          end--;
       }
    }
}









           
        
         
