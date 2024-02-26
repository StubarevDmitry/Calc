//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int TreeTraversal(Tree tree){
        int total = 0;
        if (tree.isOperation){
            if(tree.value == 43){//+
                total = TreeTraversal(tree.left) + TreeTraversal(tree.right);
            }
            if(tree.value == 42){//*
                total = TreeTraversal(tree.left) * TreeTraversal(tree.right);
            }
            if(tree.value == 45){//-
                total = TreeTraversal(tree.left) - TreeTraversal(tree.right);
            }
            if(tree.value == 47){//"/"
                total = TreeTraversal(tree.left) / TreeTraversal(tree.right);
            }
        }
        else{
            total = tree.value;
        }
        return total;
    }
    public static void main(String[] args) {
        Parser parser = new Parser("(2+4)*100+666");
        Tree tree = parser.S();
        System.out.println(TreeTraversal(tree));
    }
}