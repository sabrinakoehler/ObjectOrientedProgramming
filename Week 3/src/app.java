public class app 
{ 
     public static void main(String[] args)
     { 
        collegeFootballPlayer player1 = new collegeFootballPlayer("Zack","Mills",22, "IST", "Senior", 5.9f, 240, "Junior Varsity", "2014", "Quarter Back", 15, 27); 
        System.out.println(player1.getInfo());
        System.out.println(player1.getMajor());
        System.out.println(player1.getStatus());
        System.out.println(player1.getAllInfo());
        System.out.println(player1.getRating());         
     } 

}
