package stack_ques_01_backetcheck;
//import Stack.Stackx;
public class bracketcheck {

    private String inputarray;

    public bracketcheck(String in){

        inputarray = in;
        // 3 + ((6 * 2) - 3)

    }

    /**
     * 
     */
    public void checkB(){
        int size = inputarray.length(); // 11
        Stack Bstack = new Stack(size); // max x

        for(int i = 0; i<size; i++){
            if(inputarray.charAt(i) == '('){
                Bstack.push('(');

            }else if(inputarray.charAt(i) == ')'){
                Bstack.pop();
                }
        }

        if(!Bstack.isEmpty()){
            System.out.println("Invalid string");
        }else if(!Bstack.isFull()){
            System.out.println("Invalid string");
                }else{
                    System.out.println("Valid string");
                }
        
    }

    
}

