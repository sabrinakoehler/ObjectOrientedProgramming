
public class app {

    public static void main(String[] args) {
        
        //Create New Team
        Team teamOne = new Team("Philadelphia Eagles", "Swoop");

        //Create New Players
        // Player(first, last, position, number, age)
        Player player1 = new Player("Carson", "Wentz", "QB", 11, 25);
        Player player2 = new Player("Nick", "Foles", "QB", 9, 28);
        Player player3 = new Player("Jay", "Ajayi", "RB", 36, 24);
        Player player4 = new Player("Sidney", "Jones", "CB", 22, 21);
        Player player5 = new Player("Zach", "Ertz", "TE", 86, 27);
        Player player6 = new Player("Chris", "Long", "DE", 56, 32);
        Player player7 = new Player("Ashon", "Jeffery", "WR", 17, 27);
        Player player8 = new Player("LeGarrette", "Blount", "RB", 29, 31);
        Player player9 = new Player("Nelson", "Agholor", "WR", 13, 24);
        Player player10 = new Player("Ronald", "Darby", "CB", 41, 24);
        Player player11 = new Player("Fletcher", "Cox", "DT", 91, 27);
        
        //Add Players to Team
        //Team.addPlayer(Player)
        teamOne.addPlayer(player1);
        teamOne.addPlayer(player2);
        teamOne.addPlayer(player3);
        teamOne.addPlayer(player4);
        teamOne.addPlayer(player5);
        teamOne.addPlayer(player6);
        teamOne.addPlayer(player7);
        teamOne.addPlayer(player8);
        teamOne.addPlayer(player9);
        teamOne.addPlayer(player10);
        teamOne.addPlayer(player11);
        //Display Team Name and Mascot
        //Display Team Players Information
        System.out.println(teamOne.getTeamInfo());
        System.out.println("\nPlayer Information");
        int i = 0;
        while ( i < 11 ) {
            System.out.println(teamOne.displayPlayerInfo(i));
            i++;
        }
        //Instantiate new scanner object
        Scanner in = new Scanner(System.in);
        //Ask user to search for a player on team by position
        System.out.print("\nSearch for player by position (QB, RB, CB, TE, DE, WR, DT): ");
        placeHolder = in.nextLine();
        System.out.println(teamOne.search(placeHolder)); 
    }
    
}
    
