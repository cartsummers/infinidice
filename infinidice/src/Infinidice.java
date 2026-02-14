import java.util.*;
public class Infinidice {
    public static void main(String[] args) throws Exception {
        try (Scanner watt = new Scanner(System.in)) {
            System.out.println("What sample size do you want you follow rolls to be");
            int sampleSize = watt.nextInt();
            System.out.println("How many dice do you want to roll each set");
            int DC = watt.nextInt();
            System.out.println("How many sides do you want on each dice");
            int DS = watt.nextInt();
            double averageOutput = 0;
            for (int i = 0; i<sampleSize; i++)
            {averageOutput+=shakeEm(DC, DS);
            System.out.println(i+" roll done");
            }
            averageOutput=averageOutput/sampleSize;
            System.out.print(averageOutput);
        }
    }
    public static int shakeEm(int dc, int ds)
    {
        int diceCount = dc;
        int diceSides = ds;
        int outputTotal = 0;
        for (int i = 0; i<diceCount; i++)
        {outputTotal += (int)(Math.random() * (diceSides) + 1);}
        //System.out.println(outputTotal);
        return outputTotal;
    }
}
