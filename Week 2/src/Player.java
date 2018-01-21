
public class Player {
    //attributes
    String firstName;
    String lastName;
    String position;
    int number;
    int age;
    int rushYards;
    
    public Player(String first, String last, String pos, int num, int years) {
        firstName = first;
        lastName = last;
        position = pos;
        number = num;
        age = years;
        //variable to hold value of yards created by method randomly
        rushYards = createRandomRushYards();
    }
    // Need string representation of an object to use in search method since int variables are primitives, not objects
    public String toString() {
        return firstName + " " + lastName + ", position = " + position + ", number = " + number + ", age = " + age + ", Rush yards: " + rushYards;       
    }
    //Create random rushing yard number for each player each run
    private int createRandomRushYards() {
        return (int)(Math.random() * 10);
    }
}