import com.google.gson.Gson;
import commons.BinaryTree;
import commons.Tree;
import commons.Treedata;
import customutils.BinaryTreeUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        String s = "{\n" +
                "  \"tree\": {\n" +
                "    \"nodes\": [\n" +
                "      {\"id\": \"1\", \"left\": \"2\", \"right\": \"3\", \"value\": 1},\n" +
                "      {\"id\": \"2\", \"left\": \"4\", \"right\": \"5\", \"value\": 2},\n" +
                "      {\"id\": \"3\", \"left\": \"6\", \"right\": \"7\", \"value\": 3},\n" +
                "      {\"id\": \"4\", \"left\": \"8\", \"right\": \"9\", \"value\": 4},\n" +
                "      {\"id\": \"5\", \"left\": null, \"right\": null, \"value\": 5},\n" +
                "      {\"id\": \"6\", \"left\": null, \"right\": null, \"value\": 6},\n" +
                "      {\"id\": \"7\", \"left\": null, \"right\": null, \"value\": 7},\n" +
                "      {\"id\": \"8\", \"left\": null, \"right\": null, \"value\": 8},\n" +
                "      {\"id\": \"9\", \"left\": null, \"right\": null, \"value\": 9}\n" +
                "    ],\n" +
                "    \"root\": \"1\"\n" +
                "  }\n" +
                "}";
        Treedata tree = new Gson().fromJson(s, Treedata.class);
        BinaryTree binaryTree = BinaryTreeUtil.listToBinaryTree(tree.getTree().getNodes(), tree.getTree().getRoot());
        System.out.println(EasyAlgos.nodeDepths(binaryTree));
    }
}


