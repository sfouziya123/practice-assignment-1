// Write a java program to calculate sum of two element in a array is equal to target Value

 public class target 
 {
    public static void main(String[] args)
    {
         int[] arr= {1,12,8,2,18,20,};
         
	     int target=24;//target is 24
	     
	     System.out.println(targetValue(target,arr));//print the output
    }
    //implement the function
    public static boolean targetValue(int target,int[] arr)
    {
    boolean temp = false;
    //we using the loops to checking the target value
    
    for(int i = 0 ; i < arr.length - 1; i++)
    {
      for(int j = i + 1; j < arr.length; j++)
       {
       //adding the two values in a target
       
         if(arr[i] + arr[j] == target)
          {
		temp = true;
		break;
		  	        
	  }
      }
    }   
      //return the temp
	  return temp;
    }
}


