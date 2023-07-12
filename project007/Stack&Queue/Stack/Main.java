package Stack;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 10;

		Stackx stackobj = new Stackx(size);
		Scanner scn = new Scanner(System.in);

		System.out.println("Welcome to the program : stack");
        while(!stackobj.isFull()) {
			System.out.print("Enter a Number :");
			stackobj.push(scn.nextInt());

		}
		scn.close();

		System.out.println();

		while(!stackobj.isEmpty()) {
			System.out.println( stackobj.pop()+ " is deleted.");

		}


	}

}
