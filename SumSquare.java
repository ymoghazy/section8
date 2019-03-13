public class SumSquare {
	public static void main(String [] args){
		int x = 3;
		int sum = 0;
		while (x <= 33){
			sum += Math.pow(x , 2);
		    System.out.printf("Cumulation results: %-8d :         %-8d *         %-8d%n", sum , x , x );
		    x += 3;
		}
		System.out.print("The SUM of Square of muiples of 3 is " + sum);
	}	  
}

