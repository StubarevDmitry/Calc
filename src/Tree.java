public class Tree {

    public Tree left, right;
    public int value;
    public boolean isOperation;
    Tree(int value, boolean operation, Tree left,Tree right){
        this.isOperation = operation;
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
