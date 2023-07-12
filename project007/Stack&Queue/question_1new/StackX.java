package question_1new;

public class StackX {

     
	private int top;
	private int maxsize;
	private int stackArray[];
	
	public StackX(int s) {
		
		top = -1;
		maxsize = s;
		stackArray = new int[maxsize];
	}
	//insert values to the stack array
	public void push(int val) {
			if(maxsize == top + 1) {

				System.out.println("Error ----------------- Stack is Full.");
				
			}else {

				
				stackArray[++top] = val;
				System.out.print("                       " +val + " is added.\n");
			}
			
		}
	//delete the top value
	public int pop() {
		
			if(top == -1) {
				//check array is empty or not
				System.out.println("Error ----------------- Stack is Full.");
				return -99;
				
			}else
				
				return stackArray[top--];
		
	}
	//view the only the top value
	public int peek() {
		
		if (top == -1) {
			return -99;
		}else
			
			return stackArray[top];
	}

	public boolean isFull(){
		return (top +1 == maxsize);
	}

	public boolean isEmpty(){
		return (top == -1);
	}
}
