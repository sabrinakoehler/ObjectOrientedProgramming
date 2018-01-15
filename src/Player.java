
public class Player {
    //attributes
    String firstName;
    String lastName;
    String position;
    int number;
    int age;
    
    public Player(String first, String last, String pos, int num, int years) {
        firstName = first;
        lastName = last;
        position = pos;
        number = num;
        age = years;
    }
    
    public String getInfo() {
        return firstName + " " + lastName + ", position = " + position + ", number = " + number + ", age = " + age;       
    }
}

