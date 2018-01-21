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
    //Display team info
    public String toString() {
        return "Team Name: " + team + "\nTeam Mascot: " + mascot;
    }
    //Display player info
    public String displayPlayerInfo(int num) {
        return "\nFirst Name: " + arrayPlayers[num].firstName
             + "\nLast name: " + arrayPlayers[num].lastName
             + "\nJersey Number: " + arrayPlayers[num].number
             + "\nPosition: " + arrayPlayers[num].position
             + "\nAge: " + arrayPlayers[num].age
             + "\nRushing Yards: " + arrayPlayers[num].rushYards;
    }   
    //Search method by player position
    public Player getPlayerByPosition(String position) {
        Player player = null;
        for (Player arrayPlayer : arrayPlayers) {
            if (arrayPlayer.position.matches(position)) {
                player = arrayPlayer;
                break;
            }
        }
        if (player == null) {
            System.out.println("No player found.");
        }
        return player;
    }
    //Return sum of rush yards from each player
    public int getTeamRushYards () {
        int sum = 0;
        int loop = 0;
        while (loop < 11) {
            sum += arrayPlayers[loop].rushYards;
            loop++;
        }
        return sum;
    }
    //Add player to array
    public void addPlayer(Player player) {
        if (count < 11) {
            arrayPlayers[count] = player;
            count++;
        }
    }
}
