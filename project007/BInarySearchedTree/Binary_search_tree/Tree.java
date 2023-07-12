package BInarySearchedTree.Binary_search_tree;

public class Tree {
  //collection of nodes
  
  private Node root;//first node in the tree
  // last class - (private)

  public Tree(){

    root = null; //condition to check whether tree is empty or not
  }

  public Node find(int key){
    //return-type can be boolean/int
    //should start everything from the root

    //left side is allways less than root
    //right is higher than

    Node current = root;

    //current is a node, node cannot be compaired only its data can be

    while( current.iData != key){
        if(key < current.iData){
            //moving , tricky as a linked list
            current = current.leftChild;
        }
        else{
            
            current = current.rightChild;
        }
        // if theres no matching data in the tree itself
        if(current == null){
            return null;
        }
    }
    return current;
  }

 
public void insert(int id, double dd){
    //only paasing a value, that cannot be inserted to the linkedlist / node
    //so we have to create new link/node from that value
    //insert newly created link/node to the tree

    //can call Node constructor or ..

    Node newNode = new Node();
    newNode.iData = id;
    newNode.dData = dd;

    if(root == null){ //no nodes in the tree, root is empty
        root = newNode;
    }
    else{ //root is occupied

        Node current = root;
        Node parent = root;

        while(true){
            parent = current;

            if(id < current.iData)//move left
            {
                current = current.leftChild;
                if(current == null){//if theres no left child
                    parent.leftChild = newNode;//create new node
                    return;
                }

            }
            else//move right
            {
                current = current.rightChild;
                if(current == null){//if theres no right child
                    parent.rightChild = newNode;//create new node
                    return;
                }

            }
        }
    }
    // //root is private
    // //inOrder-traversing ------------------------------------****ascending order****-------------------------------------------------------
    // private void inOrder(Node localRoot)
    // {
    //     if(localRoot != null){

    //         inOrder(localRoot.leftChild);
    //         localRoot.displayNode();
    //         inOrder(localRoot.rightChild);
            
    //     }
    // } 

    // //preOrder-traversing ----------------------------------------------------------------------------------------
    // private void preOrder(Node localRoot)
    // {
    //     if(localRoot != null){

    //         localRoot.displayNode();
    //         preOrder(localRoot.leftChild);
    //         preOrder(localRoot.rightChild);
            
    //     }
    // } 

    // //postOrder-traversing ---------------------------------------------------------------------------------------
    // private void postOrder(Node localRoot)
    // {
    //     if(localRoot != null){

    //         postOrder(localRoot.leftChild);
    //         postOrder(localRoot.rightChild);
    //         localRoot.displayNode();
            
    //     }
    // }
    ////--------------------------------------------------------------------------------------------------------------


    //delete
    //1.node to be deleted is a leaf
    //2.node to be deleted has one child node(successor)
    //3.node to be deleted has two child nodes 
     
    //Degree of a node- no:of children it has
    /*Depth- root is Depth 0
             when we go down by 1 level depth is increased by 1

      Height- largest depth of the node tree

    */
    
  }
  
  //minimum method
  public Node minimum()
    {
        Node current = root;

        while(current.leftChild != null){
            current = current.leftChild;
        }

        return current;
    }
  
    






}
