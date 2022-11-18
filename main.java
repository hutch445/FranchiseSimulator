public class main {
    public static void main(String[] args) {
        // Teams Flyers = new Teams("Flyers");
        // Teams Penguins = new Teams("Penguins");
        // Flyers.generatePlayers("Flyers");
        // Flyers.generateCoaches();
        // Penguins.generatePlayers("Penguins");
        // Penguins.generateCoaches();
        // int flyersWins=0;
        // int penguinsWins=0;
        Season season = new Season(100);
        season.addTeams();
    }
    // NOTES
    /*
     * - Games do not give same score is same teams, means there is randomness too it
     * 
     * UNFINISHED
     * - (EASY) playSeries() in Games 
     *      Didn't figure out how to track winner after while loop runs
     * - (HARD) Make stats (goals, assists, ...) into a Stat[] of separate objects meaning Stats[] = [Goals goals, Assists assists, ... ...]
     * - (HARD) figure out how to track stats
     * - (MEDIUM) Must figure out a way to save rosters and play multiple games over season
     * - Make seasons
     * - (UNKNOWN) ADD GOALIE TO DEFENSIVE LINE
     * - (HARD) Make season schedule setSchedule
     *      
     */
                        // SERIES STUFF
             // while (flyersWins < 4 && penguinsWins < 4) {
        //     Games game = new Games(Flyers, Penguins);
        //     Teams winner = game.playGame();
        //     if (winner == Flyers) {
        //         flyersWins = flyersWins + 1;
        //         System.out.println("Flyers won a game!");
        //     } else if (winner == Penguins) {
        //         penguinsWins = penguinsWins + 1;
        //         System.out.println("Penguins won a game!");
        //     }
        // }
}
