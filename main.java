public class main {
    public static void main(String[] args) {
        Teams Flyers = new Teams("Flyers");
        Teams Penguins = new Teams("Penguins");
        Flyers.generatePlayers("Flyers");
        Flyers.generateCoaches();
        Penguins.generatePlayers("Penguins");
        Penguins.generateCoaches();
        int flyersWins=0;
        int penguinsWins=0;
        while (flyersWins < 4 && penguinsWins < 4) {
            Games game = new Games(Flyers, Penguins);
            Teams winner = game.playGame();
            if (winner == Flyers) {
                flyersWins = flyersWins + 1;
                System.out.println("Flyers won a game!");
            } else if (winner == Penguins) {
                penguinsWins = penguinsWins + 1;
                System.out.println("Penguins won a game!");
            }
        }
    }
    // NOTES
    /*
     * Games do not give same score is same teams, means there is randomness too it
     *      STILL MUST TRY WHEN ONE TEAM IS BETTER THAN ANOTHER AND MAKE SURE THAT
     *      THE BETTER TEAM WINS MORE OFTEN
     */
}
