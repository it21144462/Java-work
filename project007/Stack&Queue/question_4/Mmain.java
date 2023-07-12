package question_4;

import java.util.Scanner;

public class Mmain {

	public static void main(String[] args) {
		
		 int size = 8; //size of stack array
		 //number is in range of 0-255 in binary we need only 8 bits
		 // 0000 0000 - 1111 1111

		 int inputvalue; // get the external value to the variable
		
		StackX stackobj = new StackX(size);
		//stack object creation

		//Scanner class
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter numbers between 0<= x <=255");

		System.out.print("Enter a decimal number : ");
		inputvalue = scn.nextInt();

		scn.close();

		while(!stackobj.isFull()){

			if((inputvalue % 2) == 0){
					stackobj.push(0);
			}else if((inputvalue % 2) == 1){
				stackobj.push(1);
	
			}else if(inputvalue == 0){
				break;
			}

			inputvalue = inputvalue / 2 ;
		}

		System.out.print("\nConverted binary value is :");
		while(!stackobj.isEmpty()){
			System.out.print(stackobj.pop());
		}
		
		
		
		
		

	}

}
