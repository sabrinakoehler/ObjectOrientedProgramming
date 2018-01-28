class collegeFootballPlayer extends person implements student, footballPlayer {
    private String major;
    private String status;
    private float height;
    private int weight;
    private String experience;
    private String year;
    private String position;
    private int rating;
    private int number;

    //collegeFootballPlayer("Zack","Mills",22, "IST", "Senior", 5.9f, 240, "Junior Varsity", "2014", "Quarter Back", 15, 27); 
    collegeFootballPlayer(String firstName, String lastName, int age, String major, String status, float height, int weight, String experience, String year, String position, int rating, int number) {
        super(firstName, lastName, age);
        this.major = major;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.experience = experience;
        this.year = year;
        this.position = position;
        this.rating = rating;
        this.number = number;
    }

    @Override
    public String getMajor() {
        System.out.print("Major: ");
        return this.major; 
    }

    @Override
    public void setMajor(String newMajor) {
        this.major = newMajor;
    }

    @Override
    public String getStatus() {
        System.out.print("Level: ");
        return this.status;
    }

    @Override
    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public void setHeight(float newHeight) {
        this.height = newHeight;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    @Override
    public String getExperience() {
        return this.experience;
    }

    @Override
    public void setExperience(String newExperience) {
        this.experience = newExperience;
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    @Override
    public String getAllInfo() {
        return  "Height: " + this.getHeight() + "\n" +
                "Weight: " + this.getWeight() + "\n" +
                "Experience: " + this.getExperience() + "\n" +
                "Positon: " + this.getPosition();    
    }

    @Override
    public int getRating() {
        System.out.print("Rating: ");
        return this.rating;
    }
}