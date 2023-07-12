package question_3;

import java.util.Scanner;


public class Main {
    
    public static void main (String []args){

        int count = 0;
        int stackmaxSize = 10;
        int queuemaxsize = 10;
        char inputchar;
        
        Scanner scn = new Scanner(System.in);
        
        StackX testStack = new StackX(stackmaxSize);
        circularQueueX testQueue1 = new circularQueueX(queuemaxsize);
        circularQueueX testQueue = new circularQueueX(queuemaxsize);
        
        for(count = 0;count < 5; count ++){

            System.out.print("Enter a charcter :");
            //inputchar = scn.next();
            //testStack.push('A');
            inputchar = scn.next().charAt(0);
            testQueue1.insert(inputchar);
            testStack.push(inputchar);
            testQueue.insert(inputchar);

            //while(!testStack.isEmpty()){
            //    testQueue.insert(testStack.pop());
            //}

            
        }

        scn.close();

        System.out.print("\nBefore :\n ");
        while(!testQueue1.isEmpty()){
            System.out.print(testQueue1.remove() + " ");
        }

        System.out.print("\n\nAfter :\n ");
        while(!testStack.isEmpty()){
            testQueue.insert(testStack.pop());
        }
        while(!testQueue.isEmpty()){
            System.out.print(testQueue.remove() + " ");
        }
        /** 
        System.out.print("\n\nAfter\n");
        while(!testQueue.isEmpty()){
             System.out.print(testStack.pop() + " ");
        }
        */
    }
}


 