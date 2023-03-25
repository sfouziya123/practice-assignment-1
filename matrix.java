//6.Write a java program to calculate the product of all elements in a 2D matrix.  
public class main

{
	public static void main(String[] args)
	{
		int [][]arr={{1,2,3},{4,5,6,},{7,8,9}};
		int row=arr.length;
		int column=arr[0].length;
	       //print the output
		System.out.println(functionOfMatrix(row,column,arr));
	}
	
	//implement the function
	
   	public static int functionOfMatrix(int row,int column,int [][]arr)
	{
	int sum=1;
		
	//the row and colum checking in the loops
	for(int i=0;i<row;i++)
	{
			
	   for(int j=0;j<column;j++)
	   {
	   //checking the rows and columns
		sum*=arr[i][j];
			 	 
	    }
        }
		
		//return the sum
		return sum;
		
   	}

}

