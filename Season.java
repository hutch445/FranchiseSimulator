import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Notes:
 *  Need to implement Standings
 *  
 */

public class Season {
    // Variables
    int availableRosterSize;
    int salaryCap;
    String currentSeason;
    Teams[] league = new Teams[32], eastern = new Teams[16], western = new Teams[16], atlantic = new Teams[8], mideast = new Teams[8], coast = new Teams[8], midwest = new Teams[8];

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

    // Read File and fill teams
    public void addTeams() {
        String teamName;
        int i = 0;
        try {
            File teamsTXT = new File("teams.txt");
            Scanner scanner = new Scanner(teamsTXT);
            while (scanner.hasNextLine()) {
                teamName = scanner.nextLine();
                Teams currTeam = new Teams(teamName);
                setDivision(currTeam);
                league[i] = currTeam; 
                i++;
                System.out.println(teamName + " was added to the season!");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find File");
            e.printStackTrace();
        }
    }

    public void fillTeams() {
        for (Teams team : league) {
            team.generatePlayers();
            team.generateCoaches();
        }
    }
    
    // Putting team in division
    public void setDivision(Teams team) {
        if (checkCoast(team) == true) {
            for (int i = 0; i < coast.length; i++) {
                if (coast[i] == null) {
                    coast[i] = team;
                }
            }
        }
        if (checkAtlantic(team) == true) {
            for (int i = 0; i < atlantic.length; i++) {
                if (atlantic[i] == null) {
                    atlantic[i] = team;
                }
            }
        }
        if (checkMidEast(team) == true) {
            for (int i = 0; i < mideast.length; i++) {
                if (mideast[i] == null) {
                    mideast[i] = team;
                }
            }
        }
        if (checkMidWest(team) == true) {
            for (int i = 0; i < midwest.length; i++) {
                if (midwest[i] == null) {
                    midwest[i] = team;
                }
            }
        }
    }

    // Checking if team is in division
    public boolean checkCoast(Teams team) {
        boolean isTrue = false;
        try {
            File coastTXT = new File("coast.txt");
            Scanner scanner = new Scanner(coastTXT);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equals(team.getTeamName())) {
                    isTrue = true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find File");
            e.printStackTrace();
        }
        return isTrue;
    }
    public boolean checkAtlantic(Teams team) {
        boolean isTrue = false;
        try {
            File atlanticTXT = new File("atlantic.txt");
            Scanner scanner = new Scanner(atlanticTXT);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equals(team.getTeamName())) {
                    isTrue = true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find File");
            e.printStackTrace();
        }
        return isTrue;
    }
    public boolean checkMidWest(Teams team) {
        boolean isTrue = false;
        try {
            File midwestTXT = new File("midwest.txt");
            Scanner scanner = new Scanner(midwestTXT);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equals(team.getTeamName())) {
                    isTrue = true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find File");
            e.printStackTrace();
        }
        return isTrue;
    }
    public boolean checkMidEast(Teams team) {
        boolean isTrue = false;
        try {
            File mideastTXT = new File("mideast.txt");
            Scanner scanner = new Scanner(mideastTXT);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equals(team.getTeamName())) {
                    isTrue = true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find File");
            e.printStackTrace();
        }
        return isTrue;
    }

    public Teams[] getDivision(String division) {
        if (division.equals("Coast")) {
            return coast;
        } 
        if (division.equals("Atlantic")) {
            return atlantic;
        } 
        if (division.equals("Midwest")) {
            return midwest;
        } 
        if (division.equals("Mideast")) {
            return mideast;
        } 
        else {
            System.out.println("Invalid divison input");
            return null;
        }
    }

    // TODO
    // public Games[] setSchedule(Teams team) {
        
    // }
}
