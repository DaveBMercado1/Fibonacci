package Test1;


import java.util.Scanner;
public class exam {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int x;
		do {
			System.out.print("Enter a number from 1-20: ");
			x = scan.nextInt();
			
			if(x < 1 || x > 20) {
				System.out.println("Error: Please a number from 1-20");
			}
		}
		while (x < 1 || x > 20);
		
		fibonacci(x);
	}
	
	public static void fibonacci(int counter) {
		int a = 0;
		int b = 1;
		
		for (int c = 0; c < counter; c++) {
			int d = a+b;
			a = b;
			b = d;
			System.out.print(a + " ");
		}
	}

}
