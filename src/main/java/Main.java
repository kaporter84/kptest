import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {

        int[] ints = {3,2,1,2,6};
        int result = EasyAlgos.minimumWaitingTime(ints);
        System.out.println(result);

//        String s = "{\n" +
//                "  \"nodes\": [\n" +
//                "    {\"children\": [\"B\", \"C\", \"D\"], \"id\": \"A\", \"value\": \"A\"},\n" +
//                "    {\"children\": [\"E\", \"F\"], \"id\": \"B\", \"value\": \"B\"},\n" +
//                "    {\"children\": [], \"id\": \"C\", \"value\": \"C\"},\n" +
//                "    {\"children\": [\"G\", \"H\"], \"id\": \"D\", \"value\": \"D\"},\n" +
//                "    {\"children\": [], \"id\": \"E\", \"value\": \"E\"},\n" +
//                "    {\"children\": [\"I\", \"J\"], \"id\": \"F\", \"value\": \"F\"},\n" +
//                "    {\"children\": [\"K\"], \"id\": \"G\", \"value\": \"G\"},\n" +
//                "    {\"children\": [], \"id\": \"H\", \"value\": \"H\"},\n" +
//                "    {\"children\": [], \"id\": \"I\", \"value\": \"I\"},\n" +
//                "    {\"children\": [], \"id\": \"J\", \"value\": \"J\"},\n" +
//                "    {\"children\": [], \"id\": \"K\", \"value\": \"K\"}\n" +
//                "  ],\n" +
//                "  \"startNode\": \"A\"\n" +
//                "}";
//
//        NodeJson nodeJson = new Gson().fromJson(s, NodeJson.class);
//        Program program = BinaryTreeUtil.listToNode(nodeJson.getNodes(), nodeJson.getStartNode());
//        List<String> finalArray = program.depthFirstSearch(new ArrayList<>());
//        System.out.println(finalArray);


//        String s = "{\n" +
//                "  \"tree\": {\n" +
//                "    \"nodes\": [\n" +
//                "      {\"id\": \"1\", \"left\": \"2\", \"right\": \"3\", \"value\": 1},\n" +
//                "      {\"id\": \"2\", \"left\": \"4\", \"right\": \"5\", \"value\": 2},\n" +
//                "      {\"id\": \"3\", \"left\": \"6\", \"right\": \"7\", \"value\": 3},\n" +
//                "      {\"id\": \"4\", \"left\": \"8\", \"right\": \"9\", \"value\": 4},\n" +
//                "      {\"id\": \"5\", \"left\": null, \"right\": null, \"value\": 5},\n" +
//                "      {\"id\": \"6\", \"left\": null, \"right\": null, \"value\": 6},\n" +
//                "      {\"id\": \"7\", \"left\": null, \"right\": null, \"value\": 7},\n" +
//                "      {\"id\": \"8\", \"left\": null, \"right\": null, \"value\": 8},\n" +
//                "      {\"id\": \"9\", \"left\": null, \"right\": null, \"value\": 9}\n" +
//                "    ],\n" +
//                "    \"root\": \"1\"\n" +
//                "  }\n" +
//                "}";
//        Treedata tree = new Gson().fromJson(s, Treedata.class);
//        BinaryTree binaryTree = BinaryTreeUtil.listToBinaryTree(tree.getTree().getNodes(), tree.getTree().getRoot());
//        System.out.println(EasyAlgos.nodeDepths(binaryTree));
    }

    private static List<String> getTrackingCodeMasksWithSpecifiedRange(int start, int end)
    {
        return IntStream.rangeClosed(start, end).mapToObj(i -> String.format("%01d", i)).collect(Collectors.toList());
    }
}


