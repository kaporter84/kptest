
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add(new ArrayList<>(Arrays.asList("HTML", "C#")));
        competitions.add(new ArrayList<>(Arrays.asList("C#", "Python")));
        competitions.add(new ArrayList<>(Arrays.asList("Python", "HTML")));

        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0,0,1));

        System.out.println(EasyAlgos.tournamentWinner(competitions, results));
    }
}


