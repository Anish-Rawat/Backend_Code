// Check a armstrong number

class armstrong{
	public static void main(String args[]){
		int num = 153,remainder,sum=0;
		int temp_num=num;
		while(num!=0){
			remainder=num%10;
			sum=sum+remainder*remainder*remainder;
			num=num/10;
		}
		if(sum==temp_num){
			System.out.println(temp_num+" is a armstrong number.");
		}
		else{
			System.out.println(temp_num+" is not a armstrong number.");
		}
	}
}
