package LinkedList.Linked_List;

public class Link {

    public int iData; //data item
    public Link next; //reference to the next Link

    public Link(int id){

        iData = id;
        next = null;
    }

    public void displayLink(){ //display data item

        System.out.println(iData); //display only one content
    }
    
}
