public class Reformatory {
    private int amount = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        this.amount++;
        return person.getWeight();
    }
    
    public int totalWeightsMeasured(){
        return this.amount;
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

}
