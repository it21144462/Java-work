package LinkedList.project001_with_Linklist;

public class Link {
    public String name;
    public double avg;
    public Link next;

    public Link(String name,double avg){
        this.name = name;
        this.avg = avg;
        this.next = null;
    }
    public void displayDetails(){

	    System.out.println("Name : " + name + "\taverage marks : " + avg );
	  }
}
