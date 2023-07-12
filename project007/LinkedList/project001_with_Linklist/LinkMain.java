package LinkedList.project001_with_Linklist;

public class LinkMain {
    public static void main(String[] args){

        // Link Nipuna = new Link("Nipuna",53.5);
        // Link Aravinda = new Link("Aravinda",78.0);
        // Link Prashani = new Link("Prashani",69.5);

        // Nipuna.next = Aravinda;
        // Aravinda.next = Prashani;
        // Prashani.next = null;
        
        // //mannual
        // //link connection gerator with out using Linklist

        // Nipuna.displayDetails();
        // Aravinda.displayDetails();
        // Prashani.displayDetails();

        //using linklist

        Linklist Studentlist = new Linklist();

        Studentlist.insertFirst("Nipuna", 58.23);
        Studentlist.insertFirst("Anuradha", 100);
        Studentlist.insertFirst("Sahan", 45.101);
        Studentlist.insertFirst("Linuka", 78.9);
        Studentlist.insertFirst("Esitha", 65.32);
        Studentlist.insertFirst("Anuga", 81.20);
        Studentlist.insertFirst("Malith", 77);
        Studentlist.insertFirst("Anupama", 78.69);
        Studentlist.insertFirst("Udula", 12.03);
        Studentlist.insertFirst("kasun", 27);
        Studentlist.insertFirst("Saman", 23.01);

       // Studentlist.displayList();

        Studentlist.deleteFirst();

        //Studentlist.displayList();

        Studentlist.deleteLink("Esitha");
        Studentlist.displayList();

        //Studentlist.displayList();
    }


    
}
