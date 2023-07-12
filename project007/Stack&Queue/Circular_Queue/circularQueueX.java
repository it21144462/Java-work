package Circular_Queue;

public class circularQueueX {

    private int maxSize;
    private int []queueArray;
    private int front;
    private int rear;
    private int noItems;

    public circularQueueX(int size){

        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        noItems = 0;
    }

    public void insert(int val){
        if(maxSize == noItems){
            System.out.println("Queue is full");

        }else{
             
            if(rear +1 == maxSize){
                //jumping to the front cause its a circular queue
                rear = -1;
            }
            queueArray[++rear] = val;
            noItems ++;
            System.out.println(val + " inserted");
            System.out.println(front + " r f");

        }

    }

    public int peekFront(){
        if(noItems == 0){
            System.out.println("Queue is empty");
            return -99;

        }else{

            System.out.println(queueArray[front] + " peek");
            System.out.println(front + " f");
            return queueArray[front];
            

        }

    }

    public int remove(){
        if(noItems == 0){
            System.out.println("Queue is empty");
            return -99;

        }else{
            int temp = queueArray[front++];
            if(front == maxSize){
                //check if the end of the queue is camed or not

                front = 0;
            }
            System.out.println(front + " f");
            System.out.println(temp + " removed");

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
