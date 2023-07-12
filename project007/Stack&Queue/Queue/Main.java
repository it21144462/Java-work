package Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 int size = 5;
		 int count =1;
		 int value;
		
		QueueX mainQueue= new QueueX(size);
		// QueueX printerQueue= new QueueX(size);
		
		QueueX evenQueue= new QueueX(size);
		QueueX oddQueue= new QueueX(size);
		
		Scanner scn = new Scanner(System.in);
		
		while(!mainQueue.isFull()){
		
				System.out.print("Enter Transaction ID " + count +":");
				value = scn.nextInt();
				mainQueue.insert(value);
				count++;
				
				if((value % 2) == 0){
					
					evenQueue.insert(value);
				}else{
					
					oddQueue.insert(value);
					
				}
		}
		
		scn.close();
		
		System.out.println("\n\nPC 1");
		while(!evenQueue.isEmpty()){
			
			
			System.out.println("Transaction : " +evenQueue.remove());
			
		}
		
		System.out.println("\nPC 2");
	   while(!oddQueue.isEmpty()){
			
			
			System.out.println("Transaction : " +oddQueue.remove());
			
		}
		
		

	}

}
