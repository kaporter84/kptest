import com.google.gson.Gson;
import commons.BST;
import commons.Node;
import commons.Treedata;

import java.util.List;

import static customutils.BinaryTreeUtil.listToBst;

public class Main
{
    public static void main(String[] args)
    {

        String json = "{\n" +
                "  \"tree\": {\n" +
                "    \"nodes\": [\n" +
                "      {\"id\": \"100\", \"left\": \"5\", \"right\": \"502\", \"value\": 100},\n" +
                "      {\"id\": \"502\", \"left\": \"204\", \"right\": \"55000\", \"value\": 502},\n" +
                "      {\"id\": \"55000\", \"left\": \"1001\", \"right\": null, \"value\": 55000},\n" +
                "      {\"id\": \"1001\", \"left\": null, \"right\": \"4500\", \"value\": 1001},\n" +
                "      {\"id\": \"4500\", \"left\": null, \"right\": null, \"value\": 4500},\n" +
                "      {\"id\": \"204\", \"left\": \"203\", \"right\": \"205\", \"value\": 204},\n" +
                "      {\"id\": \"205\", \"left\": null, \"right\": \"207\", \"value\": 205},\n" +
                "      {\"id\": \"207\", \"left\": \"206\", \"right\": \"208\", \"value\": 207},\n" +
                "      {\"id\": \"208\", \"left\": null, \"right\": null, \"value\": 208},\n" +
                "      {\"id\": \"206\", \"left\": null, \"right\": null, \"value\": 206},\n" +
                "      {\"id\": \"203\", \"left\": null, \"right\": null, \"value\": 203},\n" +
                "      {\"id\": \"5\", \"left\": \"2\", \"right\": \"15\", \"value\": 5},\n" +
                "      {\"id\": \"15\", \"left\": \"5-2\", \"right\": \"22\", \"value\": 15},\n" +
                "      {\"id\": \"22\", \"left\": null, \"right\": \"57\", \"value\": 22},\n" +
                "      {\"id\": \"57\", \"left\": null, \"right\": \"60\", \"value\": 57},\n" +
                "      {\"id\": \"60\", \"left\": null, \"right\": null, \"value\": 60},\n" +
                "      {\"id\": \"5-2\", \"left\": null, \"right\": null, \"value\": 5},\n" +
                "      {\"id\": \"2\", \"left\": \"1\", \"right\": \"3\", \"value\": 2},\n" +
                "      {\"id\": \"3\", \"left\": null, \"right\": null, \"value\": 3},\n" +
                "      {\"id\": \"1\", \"left\": \"-51\", \"right\": \"1-2\", \"value\": 1},\n" +
                "      {\"id\": \"1-2\", \"left\": null, \"right\": \"1-3\", \"value\": 1},\n" +
                "      {\"id\": \"1-3\", \"left\": null, \"right\": \"1-4\", \"value\": 1},\n" +
                "      {\"id\": \"1-4\", \"left\": null, \"right\": \"1-5\", \"value\": 1},\n" +
                "      {\"id\": \"1-5\", \"left\": null, \"right\": null, \"value\": 1},\n" +
                "      {\"id\": \"-51\", \"left\": \"-403\", \"right\": null, \"value\": -51},\n" +
                "      {\"id\": \"-403\", \"left\": null, \"right\": null, \"value\": -403}\n" +
                "    ],\n" +
                "    \"root\": \"100\"\n" +
                "  },\n" +
                "  \"target\": 208\n" +
                "}";

        Treedata treedata = new Gson().fromJson(json, Treedata.class);
        List<Node> nodeList = treedata.getTree().getNodes();
        BST bst = listToBst(nodeList, treedata.getTree().getRoot());
       System.out.println(EasyAlgos.findClosestValueInBst(bst, treedata.getTarget()));
    }
}


