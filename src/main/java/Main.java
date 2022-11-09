
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        List<Integer> mainArray = new ArrayList<>(Arrays.asList(1,1,6,1));
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1,1));
        System.out.println(EasyAlgos.isValidSubsequence(mainArray, sequence));
    }
}


