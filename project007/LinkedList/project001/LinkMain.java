package LinkedList.project001;

public class LinkMain {
    public static void main(String[] args){

        Link Nipuna = new Link("Nipuna",53.5);
        Link Aravinda = new Link("Aravinda",78.0);
        Link Prashani = new Link("Prashani",69.5);

        Nipuna.next = Aravinda;
        Aravinda.next = Prashani;
        Prashani.next = null;
        
        //mannual
        //link connection gerator with out using Linklist

        Nipuna.displayDetails();
        Aravinda.displayDetails();
        Prashani.displayDetails();
    }


    
}
