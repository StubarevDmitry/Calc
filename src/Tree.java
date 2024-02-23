public class Tree {
    public Tree left, right;
    public int value;
    public boolean isOperation;
    Tree(int value, boolean operationOrInt, Tree left,Tree right){
        this.isOperation = operationOrInt;
        this.value = value;
    }
}
