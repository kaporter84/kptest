import commons.treestructure.BST;
import commons.treestructure.BinaryTree;
import customutils.SortingUtil;

import java.util.*;
import java.util.stream.IntStream;

public class EasyAlgos
{
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence)
    {
        if (array == null || array.size() == 0 || sequence == null || sequence.size() == 0 || sequence.size() > array.size())
        {
            return false;
        }

        int sequencePointer = 0;
        for (Integer integer : array)
        {
            if (sequencePointer < sequence.size() && integer.equals(sequence.get(sequencePointer)))
            {
                sequencePointer++;
            }
        }

        return sequencePointer == sequence.size();
    }

    public static int[] sortedSquaredArray(int[] array)
    {

        if (array == null || array.length == 0)
        {
            return new int[]{};
        }

        int[] newList = new int[array.length];
        int smallestPointer = 0;
        int largestPointer = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--)
        {
            if (Math.abs(array[smallestPointer]) < Math.abs(array[largestPointer]))
            {
                newList[i] = Math.abs(array[largestPointer]) * Math.abs(array[largestPointer]);
                largestPointer--;
            }
            else
            {
                newList[i] = Math.abs(array[smallestPointer]) * Math.abs(array[smallestPointer]);
                smallestPointer++;
            }
        }

        return newList;
    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results)
    {
        if (competitions == null || results == null || competitions.size() != results.size())
        {
            return "";
        }

        HashMap<String, Integer> numberOfWins = new HashMap<>();
        String winningTeam = "";
        int highestScore = 0;

        for (int i = 0; i < competitions.size(); i++)
        {
            String team = competitions.get(i).get(results.get(i) == 1 ? 0 : 1);
            int newScore = numberOfWins.getOrDefault(team, 0) + 3;

            if (newScore > highestScore)
            {
                highestScore = newScore;
                winningTeam = team;
            }

            numberOfWins.put(team, newScore);
        }

        return winningTeam;
    }

    public static int nonConstructibleChange(int[] coins)
    {
        if (coins.length == 0) return 1;

        Arrays.sort(coins);
        int createUpTo = 0;

        for (int integer : coins)
        {
            if (integer > (createUpTo + 1)) break;
            createUpTo += integer;
        }

        return createUpTo + 1;
    }

    public static int findClosestValueInBst(BST tree, int target)
    {
        BST bestNode = null;
        if(tree != null) bestNode = iterativeSearch(tree, target, tree);
        return bestNode != null ? bestNode.value : -1;
    }

    private static BST iterativeSearch(BST tree, int target, BST bestNode)
    {
        BST currentNode = tree;
        while(currentNode != null)
        {
            if (Math.abs(target - bestNode.value) > Math.abs(target - currentNode.value)) bestNode = currentNode;

            if(target < currentNode.value)
                currentNode = currentNode.left;
            else if(target > currentNode.value)
                currentNode = currentNode.right;
            else
                break;
        }

        return bestNode;
    }

    private static BST search(BST tree, int target, BST bestNode)
    {
        if (tree != null && ((tree.left != null && tree.value > tree.left.value) || (tree.right != null && tree.value < tree.right.value) || (tree.left == null && tree.right == null)))
        {
            boolean keepGoing = true;
            if(bestNode == null)
            {
               bestNode = tree;
            }
            else
            {
                int bestNodeCalc = Math.abs(target - bestNode.value);
                int currentNodeCalc = Math.abs(target - tree.value);

                if (currentNodeCalc == 0 || currentNodeCalc < bestNodeCalc)
                {
                    bestNode = tree;
                }

                keepGoing = currentNodeCalc != 0;
            }

            if(keepGoing)
            {
                if(target < tree.value)
                    bestNode = search(tree.left, target, bestNode);
                else if(target > tree.value)
                    bestNode = search(tree.right, target, bestNode);
            }
        }

        return bestNode;
    }

    private static List<Integer> search(BinaryTree tree, List<Integer> integers, int sum)
    {
        if (tree == null) return integers;
        sum += tree.value;

        if(tree.left == null && tree.right == null)
        {
            integers.add(sum);
        }
        else if (tree.left != null && tree.right != null)
        {
            integers = search(tree.left, integers, sum);
            integers = search(tree.right, integers, sum);
        }
        else if(tree.left != null)
        {
            integers = search(tree.left, integers, sum);
        }
        else
        {
            integers = search(tree.right, integers, sum);
        }

        return integers;
    }

    public static List<Integer> branchSums(BinaryTree root)
    {
        return search(root, new ArrayList<>(), 0);
    }

    public static int nodeDepths(BinaryTree root) {
        if(root == null ) return -1;
        List<Integer> integers = nodeDepthsSub(root, new ArrayList<>(), 0);
        return integers.stream().mapToInt(value -> value).sum();
    }

    private static List<Integer> nodeDepthsSub(BinaryTree tree, List<Integer> integers, int depth)
    {
        if(tree == null) return integers;
        if(depth > 0) integers.add(depth);
        depth += 1;

        if (tree.left != null && tree.right != null)
        {
            integers = nodeDepthsSub(tree.left, integers, depth);
            integers = nodeDepthsSub(tree.right, integers, depth);
        }
        else if(tree.left != null)
        {
            integers = nodeDepthsSub(tree.left, integers, depth);
        }
        else
        {
            integers = nodeDepthsSub(tree.right, integers, depth);
        }

        return integers;
    }

    public static int minimumWaitingTime(int[] queries)
    {
        if(queries != null)
        {
            SortingUtil.quickSort(queries, 0, queries.length - 1);
            return IntStream.range(0, queries.length).map(t -> queries[t] * (queries.length - (t + 1))).sum();
        }
        
        return -1;
    }

    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights)
    {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        return redShirtHeights.get(redShirtHeights.size() - 1) > blueShirtHeights.get(blueShirtHeights.size() - 1) ? IntStream.range(0, redShirtHeights.size()).noneMatch(i -> redShirtHeights.get(i) <= blueShirtHeights.get(i)) : IntStream.range(0, blueShirtHeights.size()).noneMatch(i -> blueShirtHeights.get(i) <= redShirtHeights.get(i));
    }
}
