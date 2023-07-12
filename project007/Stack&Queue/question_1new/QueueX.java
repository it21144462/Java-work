package question_1new;

public class QueueX {

    private int maxSize;
    private int []queueArray;
    private int front;
    private int rear;
    private int noItems;

    public QueueX(int size){

        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        noItems = 0;
    }

    public void insert(int val){
        if(maxSize == rear + 1){
            System.out.println("Queue is full");

        }else{

            queueArray[++rear] = val;
            noItems ++;

        }

    }

    public int peekFront(){
        if(noItems == 0){
            System.out.println("Queue is empty");
            return -99;

        }else{

            return queueArray[front];
            

        }

    }

    public int remove(){
        if(noItems == 0){
            System.out.println("Queue is empty");
            return -99;

        }else{

            noItems --;
            return queueArray[front++];

        }

    }

    public boolean isEmpty(){
        return (noItems == 0);
    }

    public boolean isFull(){
        return (maxSize == rear + 1);
    }

    
}
