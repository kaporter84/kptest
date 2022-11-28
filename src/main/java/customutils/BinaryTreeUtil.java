package customutils;

import commons.BST;
import commons.BinaryTree;
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

    public static BinaryTree listToBinaryTree(List<Node> nodes, String index)
    {
        if(nodes == null) return null;
        Node node = nodes.stream().filter(it -> it.getId().equals(index)).findFirst().get();
        BinaryTree bst = new BinaryTree(node.getValue());
        if(node.getLeft() != null) bst.left = listToBinaryTree(nodes, node.getLeft().toString());
        if(node.getRight() != null) bst.right = listToBinaryTree(nodes, node.getRight().toString());
        return bst;
    }
}
