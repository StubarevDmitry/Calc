//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int TreeTraversal(Tree tree){
        int total = 0;
        if (tree.isOperation){
            if(tree.value == '+'){//+
                total = TreeTraversal(tree.left) + TreeTraversal(tree.right);
            }
            if(tree.value == '*'){//*
                total = TreeTraversal(tree.left) * TreeTraversal(tree.right);
            }
            if(tree.value == '-'){//-
                total = TreeTraversal(tree.left) - TreeTraversal(tree.right);
            }
            if(tree.value == '/'){//"/"
                total = TreeTraversal(tree.left) / TreeTraversal(tree.right);
            }
        }
        else{
            total = tree.value;
        }
        return total;
    }

    public static void main(String[] args) {
        Parser parser = new Parser("8 + 1*2 +3");
        Tree tree = parser.S();
        System.out.println(TreeTraversal(tree));
    }
}