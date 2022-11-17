public class Stats {
    Player player;
    int offensiveCapabilities;
    int defensiveCapabilities;
    int line;
    RandomAPIWrapper wrapper = new RandomAPIWrapper();

    public Stats(Player player){
        this.player = player;
    }

    /* Generate the stats:
        Get random number from 0-50 if D, 0-33 for F, multiply
        by line and add linemates together for line Capabilities 
     */     
    public void generateStats(String team) {
        this.line = player.getLine();
        if (player.getPosition() == "D") {
            offensiveCapabilities = wrapper.minAndMax(0, 50);
            defensiveCapabilities = wrapper.minAndMax(0, 50);
        } else {
            offensiveCapabilities = wrapper.minAndMax(0, 33);
            defensiveCapabilities = wrapper.minAndMax(0, 33);
        }
    }

    public int getOffensiveStats() {
        return offensiveCapabilities;
    }
    public int getDefensiveStats() {
        return defensiveCapabilities;
    }
}
