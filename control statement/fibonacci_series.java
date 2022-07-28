// Program of fibonacci series

class fibonacci{
	public static void main(String args[]){
		int first=0,second=1,next=first+second;
		System.out.print("Fibonacci Series : " +first+ " " +second+ " ");
		for(int i=0;i<8;i++){
			System.out.print(next+" ");
			first=second;
			second=next;
			next=first+second;
		}
	}
}
