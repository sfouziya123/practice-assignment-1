//2.Write a java program to check whether a number is prime or not.
public class primeornot

{
    //public static int number=11;
    
    public static void main(String[] args)
    {
    	//boolean temp=prime(number);
    	System.out.println(prime(6));
    }
    
    public static boolean prime(int number)
    {
    int count=0;
       
       //check the number is prime or not
       
    if (number == 0 || number == 1)
    { 
        return false;
    }
        
       for(int i = 1;i <=number; i++)
       {
         //check for the number is divisible or not
          
          if(number % i == 0)
          {
             count++;
          }
       }  
          //return the true or false
         if(count==2)
         {
            return true;
         }
         else
         {
            return false;
         }
    }
}


