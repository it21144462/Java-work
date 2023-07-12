package BInarySearchedTree.Binary_search_tree;

public class Node {

    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;

    public Node(){
        
    }

    public Node(int id,double dd){
        iData = id;
        dData = dd; 

    } 

    public void displayNode(){
        System.out.println( "{ "+ iData + " , " + dData + " }" );
    }
    
}
