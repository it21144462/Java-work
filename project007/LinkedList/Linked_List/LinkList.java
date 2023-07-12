package LinkedList.Linked_List;

public class LinkList {
    
    private Link first; // first link in the list is called "first"

    public LinkList(){
        first = null;
    }

    public boolean isEmpty(){

        return (first ==null);

    }
    //there is no isFull() method in the linklist, at any time
    //you can have any number of links

    public void displayList(){ //display all the things

        Link current = first;

        while( current != null){
            current.displayLink();
            current = current.next;

        }
        System.out.println(" ");
    }

    //find method
    /** 
    public boolean find(int key){

        Link current = first;
        while(current != null){
            if( current.iData == key){
                return true;
            }else{
                current = current.next;
            }
        }

        return false;
    }
    */

    //find but having link return
     
    public Link find(int key){
        Link current = first;
        while(current != null){
            if( current.iData == key){
                return current;
            }else{
                current = current.next;
            }
        }

        return null;
    }
    


    //insertFirst method
    public void insertFirst(int id){

        Link newLink = new Link(id);
        newLink.next = first;
        first = newLink;
    }

    //insertMiddle method 
    //goes with insert when having return type link *********************************************
    public boolean insertMiddle(int key, int newData){
        
        Link current = find(key); //to find the value

        if(current != null){ //to check if the value is there or not
            Link newlink = new Link(newData);

            newlink.next = current.next;
            current.next = newlink;

            return true;

        }else{

            return false;
        }
    }

    //deleteFirst method
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    //deleteMiddle method
    public boolean deleteMiddle(int key){

        Link current = first;
        Link previous = first;

        while(current != null){
            if(current.iData == key){
                previous.next = current.next;

                return true;

            }else{

                previous = current;
                current = current.next;

            }
            
        }
        return false;
    }

    //delete both
    //from first and from middle
    //public boolean deleteboth(int key){

    //    Link current = first;
    //    Link previous = first;

    //     while(current != null){
    //         if(current.iData == //front ){
    //             //previous.next = current.next;
    //             //Link temp = first;
    //              //first = first.next;
    //             //return temp;

    //             return true;

    //         }else{

    //             previous = current;
    //             current = current.next;

    //         }
            
    //     }
    //     return false;
    // }

    }
