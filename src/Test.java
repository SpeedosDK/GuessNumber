import java.util.Scanner;
import java.util.Random;

public class Test
{
    public static void main(String[] args) {
        welcomeMsg();
        //Scanner input = new Scanner(System.in);
        //int randomNumber = chooseDifficulty();

        //welcomeMsg();
        //String type = input.nextLine();
        //Guess(randomNumber);
    }

    public static void Guess(int randomNumber)
    {
        Scanner guessInput = new Scanner(System.in);

        //int diff = chooseDifficulty();

        int guessStart = -1;

        //

        while (guessStart != randomNumber)
        {
            System.out.println("Gæt tallet");
            int guess = guessInput.nextInt();

        }
    }

    public static  int[] chooseDifficulty()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Test");
        int diff = input.nextInt();

        int startRange = 1;
        int endRange = 10;

        switch (diff)
        {
            case 1:
                randomNumberGen(1,10);
                break;
            case 2:
                randomNumberGen(1, 50);
                break;
            case 3:
                randomNumberGen(1, 100);
                break;
        }

        return new int[]{startRange, endRange};
    }

    public static int randomNumberGen(int rangeStart, int rangeEnd)
    {

        Random rand = new Random();
        return rand.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
    }

    public static String checkGuess()
    {
        String day = "m";
        return day;
    }
    public static void welcomeMsg()
    {
        System.out.println("Velkommen til gæt et tal spillet");
        System.out.println("Vælg en sværhedsgrad: ");
        System.out.println("1. Let (1-10)");
        System.out.println("2. Mellem (1-50)");
        System.out.println("3. Svær (1-100)");
    }

}





