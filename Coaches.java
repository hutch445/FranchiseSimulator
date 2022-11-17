public class Coaches {
    // Variables
    Teams team;
    String coachPosition;
    String coachType;
    String coachName;

    // Creation
    public Coaches(String coachName, String coachPosition, String coachType) {
        this.coachName = coachName;
        this.coachPosition = coachPosition;
        this.coachType = coachType;
    }

    // Setters and Getters
    public void setTeam(Teams team) {
        this.team = team;
    } 
    public Teams getTeam() {
        return team;
    }

    public void setPosition(String coachPosition) {
        this.coachPosition = coachPosition;
    }
    public String getPosition() {
        return coachPosition;
    }

    public void setType(String coachType) {
        this.coachType = coachType;
    }
    public String getType() {
        return coachType;
    }

    public void setName(String coachName) {
        this.coachName = coachName;
    }
    public String getName() {
        return coachName;
    }
}
