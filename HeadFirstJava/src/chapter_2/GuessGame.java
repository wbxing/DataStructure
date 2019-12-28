package chapter_2;

public class GuessGame {

    private Player p1 = new Player();
    private Player p2 = new Player();
    private Player p3 = new Player();

    public void startGame() {

        int p1Guess;
        int p2Guess;
        int p3Guess;
        int cnt;
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int)(Math.random() * 10);

        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            cnt = 0;
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1Guess = p1.number;
            p2Guess = p2.number;
            p3Guess = p3.number;

            System.out.println("Player one guessed " + p1Guess);
            System.out.println("Player two guessed " + p2Guess);
            System.out.println("Player three guessed " + p3Guess);

            if (p1Guess == targetNumber) {
                p1IsRight = true;
            }
            if (p2Guess == targetNumber) {
                p2IsRight = true;
            }
            if (p3Guess == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {

                if (p1IsRight) {
                    System.out.println("Player one got it right!");
                    cnt++;
                }
                if (p2IsRight) {
                    System.out.println("Player two got it right!");
                    cnt++;
                }
                if (p3IsRight){
                    System.out.println("Player one got it right!");
                    cnt++;
                }
                if (cnt > 1) {
                    System.out.print("We have " +  cnt + "winners.");
                } else {
                    System.out.println("We have a winner.");
                }
                break;
            } else {
                System.out.println("We have no winner.");
                System.out.println("Players will have to try again.");
            }
        } // end while
    } //end guessGame
} //end class
