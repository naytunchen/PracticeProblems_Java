import Node.java

public class Tree {
    private Node root;

    public Tree(Node root) {
        setRoot(root); 
    }

    public Node root() {
        return this.root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }   

    public boolean isEmpty() {
        return root == null;
    }

}
