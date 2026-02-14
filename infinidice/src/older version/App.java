public class App {
    public static void main(String[] args) throws Exception {
        int sampleSize = 10000;
        double averageOutput = 0;
        for (int i = 0; i<sampleSize; i++)
        {averageOutput+=shakeEm(99, 6);
            System.out.println(i+" roll done");
        }
        averageOutput=averageOutput/sampleSize;
        System.out.print(averageOutput);
    }
    public static int shakeEm(int dc, int ds)
    {
        int diceCount = 99999999;
        int diceSides = 6;
        int outputTotal = 0;
        for (int i = 0; i<diceCount; i++)
        {outputTotal += (int)(Math.random() * (diceSides) + 1);}
        //System.out.println(outputTotal);
        return outputTotal;
    }
}
