package customutils;

import commons.BST;
import commons.Node;

import java.util.List;

public class BinaryTreeUtil
{
    public static BST listToBst(List<Node> nodes, String index)
    {
        if(nodes == null) return null;
        Node node = nodes.stream().filter(it -> it.getId().equals(index)).findFirst().get();
        BST bst = new BST(node.getValue());
        if(node.getLeft() != null) bst.left = listToBst(nodes, node.getLeft().toString());
        if(node.getRight() != null) bst.right = listToBst(nodes, node.getRight().toString());
        return bst;
    }
}
