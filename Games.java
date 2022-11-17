public class Games {
    int period;
    Teams team1, team2;
    int scoreTeam1, scoreTeam2;
    public Games(Teams team1, Teams team2) {
        this.team1 = team1;
        this.team2 = team2;
        period = 1;
    }

    public Teams playGame() {
        for (int p = 0; p < 2; p++) {
            for (int i = 1; i < 4; i++) {
                int team1Score = team1.getLineOffenseStats(team1.getNextOLine(), team1.getCoaches()) + team1.getLineOffenseStats(team1.getNextDLine(), team1.getCoaches());
                int team2Score = team2.getLineDefenseStats(team2.getNextDLine(), team2.getCoaches()) + team2.getLineDefenseStats(team2.getNextOLine(), team2.getCoaches());
                if (team1Score > team2Score) {
                    scoreTeam1 = scoreTeam1 + 1;
                    // System.out.println(team1.getTeamName() + " scored!");
                }
                int team2Score2 = team2.getLineOffenseStats(team2.getNextOLine(), team2.getCoaches()) + team2.getLineOffenseStats(team2.getNextDLine(), team2.getCoaches());
                int team1Score2 = team1.getLineDefenseStats(team1.getNextDLine(), team1.getCoaches()) + team1.getLineDefenseStats(team1.getNextOLine(), team1.getCoaches());
                if (team2Score2 > team1Score2) {
                    scoreTeam2 = scoreTeam2 + 1;
                    // System.out.println(team2.getTeamName() + " scored!");
                }
            }
        }
        if (scoreTeam1 > scoreTeam2) {
            System.out.println(team1.getTeamName() + " Won!");
            System.out.println("The score was: " + scoreTeam1 + "-" + scoreTeam2);
            return team1;
        } else if (scoreTeam1 < scoreTeam2) {
            System.out.println(team2.getTeamName() + " Won!");
            System.out.println("The score was: " + scoreTeam2 + "-" + scoreTeam1);
            return team2;
        } else {
            System.out.println("Tied!");
            System.out.println("The score was: " + scoreTeam1 + "-" + scoreTeam2);
            return null;
        }
    }

    // public Teams playSeries() {
    //     int team1Wins = 0, team2Wins = 0;
    //     while (team1Wins < 4 && team2Wins < 4) {
    //         Teams winner = playGame();
    //         if (winner == team1) {
    //             team1Wins = team1Wins++;
    //         } else if (winner == team2) {
    //             team2Wins = team2Wins++;
    //         }
    //     }
    //     if (team1Wins == 4) {
    //         return team1;
    //     }
    //     if (team2Wins == 4) {
    //         return team2;
    //     }
    // }
}
