package question_3;

public class StackX {

     
	private int top;
	private int maxsize;
	private char stackArray[];
	
	public StackX(int s) {
		
		top = -1;
		maxsize = s;
		stackArray = new char[maxsize];
	}
	//insert values to the stack array
	public void push(char val) {
			if(maxsize == top + 1) {

				System.out.println("Error ----------------- Stack is Full.");
				
			}else {

				
				stackArray[++top] = val;
				
			}
			
		}
	//delete the top value
	public char pop() {
		
			if(top == -1) {
				//check array is empty or not
				System.out.println("Error ----------------- Stack is Full.");
				return ('@');
				
			}else
				
				return stackArray[top--];
		
	}
	//view the only the top value
	public char peek() {
		
		if (top == -1) {
			return ('@');
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
