
import java.util.ArrayList;


public class Team {
    private String name;
    private int maxSize = 16;
    private ArrayList<Player> players;
    
    public Team(String teamName) {
        this.name = teamName;
        this.players = new ArrayList<Player>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if (players.size() < this.maxSize) {
            players.add(player);
        }
    }
    
    public void printPlayers(){
        for (Player i : this.players) {
            System.out.println(i);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;   
    }
    
    public int size(){
        return players.size();
    }
    
    public int goals(){
        int goals = 0;
        for (Player i : this.players) {
            goals += i.goals();
        }
        
        return goals;
    }
    
    
    
}
