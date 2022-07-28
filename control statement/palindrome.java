// Program of palindrome

import java.util.Scanner;
class palindrome{
	public static void main(String args[]){
		int num=0,remainder=0,reversedNum=0;
		int originalNum;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a three digit number : ");
		num = obj.nextInt();
		originalNum=num;
		while(num!=0){
			remainder=num%10;
			reversedNum=reversedNum*10 + remainder;
			num=num/10;
		}
		if(originalNum==reversedNum){
			System.out.println("Entered number is palindrome.");
		}
		else{
			System.out.println("Entered number is not palindrome");
		}
	}
}
