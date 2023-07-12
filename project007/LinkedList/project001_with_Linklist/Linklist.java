package LinkedList.project001_with_Linklist;

public class Linklist {

    public Link first;

    public Linklist(){

        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void displayList(){

        Link current = first;
        
        while( current != null){
            current.displayDetails();
            current = current.next;

        }
        System.out.println(" ");
    }

    public void insertFirst(String name, double avg){
        
        Link newlink = new Link(name,avg);
        newlink.next = first;
        first = newlink;
    }

    public Link deleteFirst(){

        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link deleteLink(String name){

        Link current = first;
        Link previous = first;

        if(current == null){
            return null;//if it doesnt have any elements to be deleted
        }
        while( !current.name.equals(name)){ // current.name != name

            previous = current;
            current = current.next;

            if(current == null){
                return null;
            }
        }
        if(current == first){

            first = first.next;
        }else{

            previous.next = current.next;
        }
        System.out.println("\n..................deleted..................");

        return current;
    }

    
}
