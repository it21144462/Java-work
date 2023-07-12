package question_1;

import java.util.Scanner;


public class Main {
    
    public static void main (String []args){

        int value;
        int maxSize = 5;
        String inputarray;
        int carcount =0,threewheelcount =0,bikecount=0;

        QueueX mainQueue = new QueueX(maxSize);

        QueueX carQueue = new QueueX(maxSize);
        QueueX threewheelerQueue = new QueueX(maxSize);
        QueueX bikeQueue = new QueueX(maxSize);

        ///String[] strarr = new String[5];

        Scanner scn = new Scanner(System.in);

        while(!mainQueue.isFull()){
            
		
            System.out.print("Vehicle code :");
            value = scn.nextInt();
            mainQueue.insert(value);

            inputarray =Integer.toString(value);
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
            
                if(inputarray.charAt(3) == '1'){
                    carQueue.insert(value);
                    carcount++;
        
                }else if(inputarray.charAt(3) == '2'){
                    threewheelerQueue.insert(value);
                    threewheelcount++;

                    }else if(inputarray.charAt(3) == '3'){
                        bikeQueue.insert(value);
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
    scn.close();




        System.out.println("\nVehicle count :" + carcount);
        while( !carQueue.isEmpty()){

            System.out.println("Vehicle Code :"+ carQueue.remove() + " a car.");

        }
        System.out.println("\nVehicle count :" + threewheelcount);
        while( !threewheelerQueue.isEmpty()){

            System.out.println("Vehicle Code :"+ threewheelerQueue.remove() + " a threewheeler.");

        }
        System.out.println("\nVehicle count :" + bikecount);
        while( !bikeQueue.isEmpty()){

            System.out.println("Vehicle Code :"+ bikeQueue.remove() + " a bike.");

        }

        System.out.println("\n");

    }
}


 