public class Node {
    private Node left = null;
    private Node right = null;
    private Node parent = null
    private int value;

    // Constructor
    public Node(int value) {
        setValue(value);
    }

    /*** Getters ***/
    // Get Left Child Node
    public Node left() {
        return this.left;
    }

    // Get Right Child Node
    public Node right() {
        return this.right;
    }

    // Get Value
    public int value() {
        return this.value;
    }

    /*** Setters ***/
    // Left Child Node
    public void setLeft(Node left) {
        this.left = left;
    }


    // Right Child Node
    public void setRight(Node right) {
        this.right = right;
    }

    // set Value
    public void setValue(int value) {
        this.value = value;
    }

}
