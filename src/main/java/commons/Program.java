package commons;

import commons.depthfirstsearchstructure.SubNode;

import java.util.ArrayList;
import java.util.List;

public class Program
{
    Node node;

    public Node getNode()
    {
        return node;
    }

    public void setNode(String name)
    {
        this.node = new Node(name);
    }

    public void addChildren(List<SubNode> subNodes, String index, Node node)
    {
        SubNode subNode = subNodes.stream().filter(it -> it.getId().equals(index)).findFirst().get();
        subNode.getChildren().forEach(node::addChild);
        if (node.children != null) node.children.forEach(child -> addChildren(subNodes, child.name, child));
    }

    public List<String> depthFirstSearch(List<String> array)
    {
        return this.node.depthFirstSearch(array);
    }

    static class Node
    {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name)
        {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array)
        {
            array.add(this.name);
            this.children.forEach(child -> child.depthFirstSearch(array));
            return array;
        }

        public Node addChild(String name)
        {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}