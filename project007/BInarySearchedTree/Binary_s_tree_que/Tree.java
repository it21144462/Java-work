package BInarySearchedTree.Binary_s_tree_que;

public class Tree {

 private Node root;

 public Tree(){

    root = null;
 }

 public void insert(int pheight){
    
    Node newNode = new Node();
    newNode.height = pheight;

    if(root == null){

        root = newNode;
    }
    else{

        Node current = root;
        Node parent = root;

        while(true){
            parent = current;

            if(pheight < current.height)//move left
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

 }

 public Node minimum(){

    Node current = root;
    while(current.leftChild != null){

        current = current.leftChild;
    }
    return current;

 }

 public Node maxmum(){

    Node current = root;
    while(current.rightChild != null){

        current = current.rightChild;

    }
    return current;

 }
 
 //************************************************************************** */

 
 // root is private
 private void descendingOrder(Node localRoot){
    if(localRoot != null)
    {
        descendingOrder(localRoot.leftChild);
        localRoot.displayNode();
        descendingOrder(localRoot.rightChild);
    }
 }
 // the way to call private methods
 //put it iinside the public method
 public void descendingOrder(){

    descendingOrder(root);
 }
    
}
