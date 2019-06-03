public class Player {
    private String name;
    private int goals;
    
    public Player(String playerName) {
        this(playerName, 0);
    }
    
    public Player(String playerName, int goalsScored){
        this.name = playerName;
        this.goals = goalsScored;
    }
    
    public String toString() {
        return this.name + ", goals " + this.goals;
    }
    
    public int goals(){
        return this.goals;
    }
    
    public String getName(){
        return this.name;
    }
    

    
}
