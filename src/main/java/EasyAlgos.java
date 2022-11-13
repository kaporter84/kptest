import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
}
