public class Season {
    // Variables
    int availableRosterSize;
    int salaryCap;
    String currentSeason;

    // Creation
    public Season(int salaryCap) {
        this.salaryCap = salaryCap;
    }


    // Setters and Getters
    public void setRosterSize(int availableRosterSize) {
        this.availableRosterSize = availableRosterSize;
    }
    public int getRosterSize() {
        return availableRosterSize;
    }

    public void setSalaryCap(int salaryCap) {
        this.salaryCap = salaryCap;
    }
    public int getSalaryCap() {
        return salaryCap;
    }

    public void setCurrentSeason(String newSeason) {
        this.currentSeason = newSeason;
    }
    public String getCurrentSeason() {
        return currentSeason;
    }

}
