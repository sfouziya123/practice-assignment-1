//3.Write a java program to check whether a number is armstrong or not.
class armstrong {
    public static void main(String [] args)
    {
        int num = 1634;
	String str= Integer.toString(num);
	int len = str.length();
	AmstrongNumber(num,len);
     }
     public static void AmstrongNumber(int num, int len){
     	int sum = 0;
     	int num1 = num;
     	while ( num > 0){
     		int rem = num % 10;
     		sum += Math.pow(rem,len);
     		num /= 10;
     	}
     	if(sum == num1){
     		System.out.println("amstrong Number");
     	}else {
     		System.out.println("not amstrong number");
     	}
     }
 }
