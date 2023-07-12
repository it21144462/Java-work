package question_1new;

import java.util.Scanner;


public class Main {
    
    public static void main (String []args){

        int value;
        int maxSize = 5;
        String inputarray;
        int carcount =0,threewheelcount =0,bikecount=0;

        QueueX mainQueue = new QueueX(maxSize);

        ///String[] strarr = new String[5];

        Scanner scn = new Scanner(System.in);

        while(!mainQueue.isFull()){
            
		
            System.out.print("Vehicle code :");
            value = scn.nextInt();
            mainQueue.insert(value);

            
        }
        scn.close();
            ///////////////////////////////////////////////////
            /**for(int i = 0; i<arraysize; i++){
                if(inputarray.charAt(i) == '('){
                    Bstack.push('(');
        
                }else if(inputarray.charAt(i) == ')'){
                    Bstack.pop();
                    }
            }
            */
            /////////////////////////////////////////////////////
        while(!mainQueue.isEmpty()){
            
            int value1;

            value1 = mainQueue.remove();

            inputarray = Integer.toString(value1);
		
            System.out.print("Vehicle code :");
                
               
                if(inputarray.charAt(3) == '1'){
                    System.out.print(value1 + " is a car.\n");
                    carcount++;
         
                }else if(inputarray.charAt(3) == '2'){
                    System.out.print(value1 + " is a tuk-tuk.\n");
                    threewheelcount++;

                    }else if(inputarray.charAt(3) == '3'){
                        System.out.print(value1 + " is a bike.\n");
                        bikecount++;
                    }
            
            /////////////////////////////////////////////
            /** 
            if((value % 10) == 1){

                carQueue.insert(value);

            }else if((value % 10) == 2){

                threewheelerQueue.insert(value);

            }else if((value % 10) == 3){

                bikeQueue.insert(value);
            }
            */
          //////////////////////////////////////////////////
    }

    System.out.println("\nTotal car count: " + carcount + "\nTotal threewheeler count: " 
                    + threewheelcount + "\nTotal bike count: " + bikecount);
}
    




        
    }



 