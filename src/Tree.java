public class Tree {

    public Tree left, right;
    public int value;
    public boolean isOperation;
    Tree(int value, boolean isOperation, Tree left,Tree right){
        this.isOperation = isOperation;
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
