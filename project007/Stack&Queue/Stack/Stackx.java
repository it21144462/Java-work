package Stack;
public class Stackx {
     
	private int top;
	private int maxsize;
	private int stackArray[];
	
	public Stackx(int s) {
		
		top = -1;// Initializing the top value to -1,so values are available 
		maxsize = s;
		stackArray = new int[maxsize];//creation of the array for the stack use
	}
	//insert values to the stack array
	public void push(int val) {
			if(maxsize == top + 1) {
				// push can't work if the stack is full
				System.out.println("Error ----------------- Stack is Full.");
				
			}else {
				//++top ,because initially top = -1 and top is incremented by 1 to match the first
				//index of the array which is stackArray[0]
				
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
			//check if the stack array is empty or not
			return -99;
			
		}else
			
			return stackArray[top];
	}

	public boolean isFull(){
		/*if(top +1 == maxsize ){
			return -99;
		}
		*/
		return (top +1 == maxsize);
	}

	public boolean isEmpty(){
		/*if(top  == -1 ){
			return -99;
		}
		*/
		return (top == -1);
	}
}
