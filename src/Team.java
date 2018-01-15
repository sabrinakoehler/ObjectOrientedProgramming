
public class Team {
    String team = "Philadelphia Eagles";
    String mascot = "Swoop";
    //Hold array of players (11)
    Player[] arrayPlayers = new Player[11];
    //Keep track of players being added to team
    int count = 0;
    
    Team (String teamName, String teamMascot) {
        team = teamName;
        mascot = teamMascot;
    }
    public String getTeamInfo() {
        return "Team Name: " + team + "\nTeam Mascot: " + mascot;
    }
    
    public String displayPlayerInfo(int num) {
        return "\nFirst Name: " + arrayPlayers[num].firstName
             + "\nLast name: " + arrayPlayers[num].lastName
             + "\nJersey Number: " + arrayPlayers[num].number
             + "\nPosition: " + arrayPlayers[num].position
             + "\nAge: " + arrayPlayers[num].age;
    }
    
    public String getPlayerInfo(String placeHolderPosition) {
        Player player = null;
        for (Player arrayPlayer : arrayPlayers) {
            if (arrayPlayer.position.equals(placeHolderPosition)) {
                player = arrayPlayer;
                break;
            }
        }
        return player.getInfo();
    }
    
    public void addPlayer(Player player) {
        if (count < 11) {
            arrayPlayers[count] = player;
            count++;
        }
    }
}
