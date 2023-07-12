package Circular_Queue;

public class Main {

    public static void main(String[] args) {

    // int value;
    int size = 5;

    circularQueueX cqueueX = new circularQueueX(size);

    cqueueX.insert(1);
    cqueueX.peekFront();
    cqueueX.insert(2);
    cqueueX.insert(3);
    cqueueX.remove();
    cqueueX.insert(4);
    cqueueX.insert(5);
    cqueueX.remove();
    cqueueX.remove();
    cqueueX.remove();
    System.out.println( " ===============================================================");
    cqueueX.remove();
    System.out.println( " .............................................................");
    cqueueX.peekFront();
    System.out.println( " ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    cqueueX.insert(6);
    cqueueX.insert(7);
    System.out.println( " /////////////////////////////////////////////////////////////");
    cqueueX.insert(8);
    cqueueX.insert(9);
    cqueueX.insert(10);
    cqueueX.insert(11);
    cqueueX.insert(12);

    System.out.println( " \n\nrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    while(!cqueueX.isEmpty()) {
        System.out.println( cqueueX.remove()+ " is deleted.");

    }
    System.out.println( " rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr \n\n");

    
}
}