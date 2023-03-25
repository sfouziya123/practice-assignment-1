class HelloWorld {
    
    public static String str="mom bob hello banana racecar dad water ";
    
    public static char[] arr = str.toCharArray();
    
    public static void main(String[] args)
    {
      int count=0;
      if(ReverseSubString(0 , arr.length-1 , arr))
      {
 	  count+=1;
      }
       
      int wordStart=0;
      int wordend=0;
      while((wordend=wordcount(wordStart,arr))!=-1)
      {
      if(ReverseSubString(wordStart, wordend-1,arr))
      {
 	  count+=1;
      }
          wordStart=wordend+1;
      }
          System.out.println(count);
    }
    public static int wordcount(int start ,char[] arr)
    {
     if(start >= arr.length)
     {
            return -1;
     }
     int wordEnd = start;
     while( wordEnd<arr.length && arr[wordEnd] != ' ')
     {
          wordEnd++;
     }
  	   return wordEnd;
    }
    
    public static boolean ReverseSubString(int start , int end ,char[] arr)
    {
     if(arr == null)
     {
            return false;
     }
     boolean bag=true;
     while (start <= end)
     {
        if(arr[start]!=arr[end])
        {
	    bag=false;
             break;
                
        }
	    start ++;
            end --;
     }
 	  return bag;
    }
    
}
