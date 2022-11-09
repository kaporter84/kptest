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

    public static int[] sortedSquaredArray(int[] array) {

        if(array == null || array.length == 0)
        {
            return new int[] {};
        }

        int[] newList = new int[array.length];
        int smallestPointer = 0;
        int largestPointer = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--)
        {
            if(Math.abs(array[smallestPointer]) < Math.abs(array[largestPointer]))
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
}
