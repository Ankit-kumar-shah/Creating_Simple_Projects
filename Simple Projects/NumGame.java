import java.util.Scanner;

public class NumGame{
    int rate(int max, int min){
        return (int) (Math.random()*(max - min + 1) +min);
    }
    public static void main(String[] args){
        System.out.println("Welcome To This Game");
        Scanner sc = new Scanner(System.in);
        NumGame NG = new NumGame();
        int totalAttemps = 0;
        int win = 0;

        while (true) {
            System.out.println("Enter the Maximum number");
            int max = sc.nextInt();
            System.out.println("Enter the Minimum number");
            int min = sc.nextInt();
            sc.nextLine();
            System.out.println("Let Guess the Number");

            int cnum = NG.rate(max, min);
            int attempts = 0;

            while (true) {
                System.out.println("guess a number between "+max+" and "+min);
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cnum){
                    System.out.println("Its Gretter");
                }else if (gnum < cnum){
                    System.out.println("Its Lower");
                }else {
                    System.out.println("Correct Guess");
                    win++;
                    break;
                }
            }
            totalAttemps += attempts;
            System.out.println("Attempts = " +attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / totalAttemps*100;
            System.out.printf("Your winrate is %.2f%%\n", winrate);

            System.out.println("Do you want to play again (Y/N)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("Y")){
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    } 
}