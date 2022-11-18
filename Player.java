public class Player {
    // Variables
    Teams team;
    String position, playerType, playerName;
    int playModifier;
    int line, offensiveCapabilities, defensiveCapabilities;
    Stats stats;
    RandomAPIWrapper random = new RandomAPIWrapper();

    // Creation
    public Player(String position, String playerType, String playerName) {
        this.position = position;
        this.playerType = playerType;
        this.playerName = playerName;
    }

    // Setters and Getters
        // Team
    public void setTeam(Teams team) {
        this.team = team;
    } 
    public Teams getTeam() {
        return team;
    }

        // Position
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

        // Type
    public void setType(String playerType) {
        this.playerType = playerType;
    }
    public String getType() {
        return playerType;
    }

        // Modifier
    public void setModifier(int playModifier) {
        this.playModifier = playModifier;
    }
    public int getModifier() {
        this.setModifier(random.minAndMax(0,10));
        return playModifier;
    }

        // Name
    public void setName(String playerName) {
        this.playerName = playerName;
    }
    public String getName() {
        return playerName;
    }

        // Line
    public void setLine(int line) {
        this.line = line;
    }
    public int getLine() {
        return line;
    }

        // Stats
            // Generate Stats
    public void generateStats() {
        stats = new Stats(this);
        stats.generateStats();
        offensiveCapabilities = stats.getOffensiveStats();
        defensiveCapabilities = stats.getDefensiveStats();
    }
            // Get Stats
    public int getOffensiveStats() {
        return offensiveCapabilities;
    }
    public int getDefensiveStats() {
        return defensiveCapabilities;
    }
}
