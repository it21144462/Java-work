package question_3;

public class circularQueueX {

    private int maxSize;
    private char []queueArray;
    private int front;
    private int rear;
    private int noItems;
    //ArrayList<T> A;

    public circularQueueX(int size){

        maxSize = size;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        noItems = 0;
    }

    public void insert(char val){
        if(maxSize == noItems){
            System.out.println("Queue is full");

        }else{
             
            if(rear +1 == maxSize){
                //jumping to the front cause its a circular queue
                rear = -1;
            }
            queueArray[++rear] = val;
            noItems ++;
            

        }

    }

    public char peekFront(){
        if(noItems == 0){
            System.out.println("Queue is empty");
            return ('@');

        }else{

            System.out.println(queueArray[front] + " peek");
            
            return queueArray[front];
            

        }

    }

    public char remove(){
        if(noItems == 0){
            System.out.println("Queue is empty");
            return ('@');

        }else{
            char temp = queueArray[front++];
            if(front == maxSize){
                //check if the end of the queue is camed or not

                front = 0;
            }
            

            noItems --;
            return temp;

        }

    }

    public boolean isEmpty(){
        return (noItems == 0);
    }

    public boolean isFull(){
        return (maxSize == noItems);
    }
    
}
