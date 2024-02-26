public class Parser {
    private final String str;
    private final int length;
    private int count = 0;
    Parser(String str1){
        str = str1;
        length = str.length();
    }
    Tree S(){
        Tree leftTree = M();
        if (count == length){
            return leftTree;
        }
        if ('+' == str.charAt(count)){
            //System.out.println(str.charAt(count));
            int value = str.charAt(count);
            count++;
            Tree rightTree = S();
            return new Tree(value, true, leftTree, rightTree);
        }
        if ('-' == str.charAt(count)){
            int value = str.charAt(count);
            count++;
            Tree rightTree = S();
            return new Tree(value, true, leftTree, rightTree);
        }
        return leftTree;
    }
    Tree M(){
        Tree leftTree = P();
        if (count == length){
            return leftTree;
        }
        if ('*' == str.charAt(count)){
            int value = str.charAt(count);
            count++;
            Tree rightTree = M();
            return new Tree(value, true, leftTree, rightTree);
        }
        if ('/' == str.charAt(count)){
            int value = str.charAt(count);
            count++;
            Tree rightTree = M();
            return new Tree(value, true, leftTree, rightTree);
        }
        return leftTree;
    }
    Tree P(){
        if(count == length){
            return null;
        }
        if (9 + (int)'0' >= (int)str.charAt(count) && '0' <= (int)str.charAt(count)){
            StringBuilder buff = new StringBuilder("");
            while ( (count != length) && (9 + (int)'0' >= (int)str.charAt(count) && '0' <= (int)str.charAt(count) )){
                //System.out.println(str.charAt(count));
                buff.append(str.charAt(count));
                count++;
            }
            return new Tree(Integer.parseInt(String.valueOf(buff)), false, null,null);
        }
        if ( '(' == str.charAt(count)){
            //System.out.println(str.charAt(count));
            count++;
            Tree tree = S();
            if ( ')' == str.charAt(count)){
                //System.out.println(str.charAt(count));
                count++;
                return tree;
            }
        }
        return null;
    }
}
