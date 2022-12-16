package customutils;

import commons.Program;
import commons.depthfirstsearchstructure.SubNode;
import commons.treestructure.BST;
import commons.treestructure.BinaryTree;
import commons.treestructure.Node;

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

    public static Program listToNode(List<SubNode> subNodes, String index)
    {
        if(subNodes == null) return null;
        SubNode subNode = subNodes.stream().filter(it -> it.getId().equals(index)).findFirst().get();
        Program program = new Program();
        program.setNode(subNode.getValue());
        program.addChildren(subNodes, subNode.getId(), program.getNode());
        return program;
    }
}
