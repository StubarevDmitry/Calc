//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser("2+4");
        Tree tree = parser.S();
        //int value = tree.value;
        Tree lefttree = tree.left;
        int value = lefttree.value;
        //tree.left;
    }
}