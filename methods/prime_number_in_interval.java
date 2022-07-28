// Java Program to Display Prime Numbers Between Intervals Using Function

class primenumber{
	public static void main(String args[]){
		int first=2,last=50;
		System.out.println("Prime numbers are : ");
		for(int i=first;i<=last;i++){
			if(checkprime(i)){
				System.out.print(i+" ");
			}
		}
	}
	public static boolean checkprime(int first){
		boolean flag=true;
		for(int i=2;i<=first/2;i++){
			if(first%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}
