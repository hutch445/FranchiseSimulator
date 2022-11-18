import java.util.Arrays;

public class Teams{
    // Variables
    int availableRosterSize = 23;
    Player[] players = new Player[availableRosterSize];
    Coaches[] coaches = new Coaches[3];
    String teamName;
    Player[] fLine1 = new Player[3], fLine2 = new Player[3], fLine3 = new Player[3], fLine4 = new Player[3],
     dLine1 = new Player[2], dLine2 = new Player[2], dLine3 = new Player[2];
    int currLine = 1, currOLine = 1;
    int[] record = new int[3];

    // Creation
    public Teams(String teamName) {
        this.teamName = teamName;
    }

    // functions
    public void addPlayer(Player player) {
        // Add player to array
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
            }
        }
    }
    public void deletePlayer(Player player) {
        // Delete player form array
        for (int i = 0; i < players.length; i++) {
            if (players[i] == player) {
                players[i] = null;
            }
        }
    }
    public void addCoach(Coaches coach) {
        // Add coach to array
        for (int i = 0; i < coaches.length; i++) {
            if (coaches[i] == null) {
                coaches[i] = coach;
            }
        }
    }
    public void deleteCoach(Coaches coach) {
        // Delete coach from array
        for (int i = 0; i < coaches.length; i++) {
            if (coaches[i] == coach) {
                coaches[i] = null;
            }
        }
    }
    public Coaches[] getCoaches() {
        return coaches;
    }

        // Forward Line
    public void setForwardLine(Player player, int lineNumber) {
        if (lineNumber == 1) {
            for (int i = 0; i < 3; i++) {
                if (fLine1[i] == null) {
                    fLine1[i] = player;
                    break;
                }
            }
        } else if (lineNumber == 2) {
            for (int i = 0; i < 3; i++) {
                if (fLine2[i] == null) {
                    fLine2[i] = player;
                    break;
                }
            }
        } else if (lineNumber == 3) {
            for (int i = 0; i < 3; i++) {
                if (fLine3[i] == null) {
                    fLine3[i] = player;
                    break;
                }
            }
        } else if (lineNumber == 4) {
            for (int i = 0; i < 3; i++) {
                if (fLine4[i] == null) {
                    fLine4[i] = player;
                    break;
                }
            }
        }
    }
    public Player[] getForwardLine(int lineNumber) {
        if (lineNumber == 1) {
            return fLine1;
        } else if (lineNumber == 2) {
            return fLine2;
        } else if (lineNumber == 3) {
            return fLine3;
        } else if (lineNumber == 4) {
            return fLine4;
        } else {
            return null;
        }
    }

            // Defense Line
        public void setDefenseLine(Player player, int lineNumber) {
            if (lineNumber == 1) {
                for (int i = 0; i < 2; i++) {
                    if (dLine1[i] == null) {
                        dLine1[i] = player;
                        break;
                    }
                }
            } else if (lineNumber == 2) {
                for (int i = 0; i < 2; i++) {
                    if (dLine2[i] == null) {
                        dLine2[i] = player;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    if (dLine3[i] == null) {
                        dLine3[i] = player;
                        break;
                    }
                }
            }
        }
    public Player[] getDefenseLine(int lineNumber) {
        if (lineNumber == 1) {
            return dLine1;
        } else if (lineNumber == 2) {
            return dLine2;
        } else {
            return dLine3;
        }
    }
        // Get Stats
    public int getLineDefenseStats(Player[] line, Coaches[] coaches) {
        int lineDefense = 0;
        for (int i = 0; i < line.length; i++) {
            lineDefense = lineDefense + (line[i].getDefensiveStats()*line[i].getModifier());
            if (coaches[i].getType().equals("Defensive")) {
                lineDefense = (int) Math.ceil(lineDefense * 1.1);
            }
        }
        return lineDefense;
    }
    public int getLineOffenseStats(Player[] line, Coaches[] coaches) {
        int lineOffense = 0;
        for (int i = 0; i < line.length; i++) {
            lineOffense = lineOffense + (line[i].getOffensiveStats()*line[i].getModifier());
            if (coaches[i].getType().equals("Offensive")) {
                lineOffense = (int) Math.ceil(lineOffense * 1.1);
            }
        }
        return lineOffense;
    }
    
        // Get next line
    public Player[] getNextDLine() {
        if (currLine+1 == 4) {
            currLine = 1;
        }
        return getDefenseLine(currLine);
    }
    public Player[] getNextOLine() {
        if (currOLine == 5) {
            currOLine = 1;
        }
        return getForwardLine(currOLine);
    }

        // Name
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }

        // Generating and Filling team w Players
    public void generatePlayers() {
        for (int i = 0; i < 12; i++) {
            Player player = new Player("F", "Offensive", "F" + i);
            player.generateStats();
            this.addPlayer(player);
            int lineNumber;
            if (i < 3) {
                lineNumber = 1;
            } else if (i < 6) {
                lineNumber = 2;
            } else if (i < 9) {
                lineNumber = 3;
            } else {
                lineNumber = 4;
            }
            this.setForwardLine(player, (int) lineNumber);
            System.out.println("Added " + player.getName() + " to " + lineNumber + "!");
        }
        for (int i = 0; i < 6; i++) {
            Player player = new Player("D", "Defensive", "D" + i);
            player.generateStats();
            this.addPlayer(player);
            int lineNumber;
            if (i < 2) {
                lineNumber = 1;
            } else if (i < 4) {
                lineNumber = 2;
            } else {
                lineNumber = 3;
            }
            this.setDefenseLine(player, lineNumber);
            System.out.println("Added " + player.getName() + " to " + lineNumber + "!");
        }
    }
    public void generateCoaches() {
        Coaches coach1 = new Coaches("Head", "Head Coach", "Offensive");
        coaches[0] = coach1;
        Coaches coach2 = new Coaches("Off", "Offense Coach", "Offensive");
        coaches[1] = coach2;
        Coaches coach3 = new Coaches("Def", "Defense Coach", "Offensive");
        coaches[2] = coach3;
    }

    public void addWin() {
        record[0] = record[0]++;
    }
    public void addLoss() {
        record[0] = record[0]++;
    }
    public void addTie() {
        record[0] = record[0]++;
    }
}