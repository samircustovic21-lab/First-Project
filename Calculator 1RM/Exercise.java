public class Exercise {
private String name;
private int weight;
private int reps;

public Exercise (String name, int weight, int reps){
    this.name = name;
    this.weight = weight;
    this.reps = reps;
}

public String getName(){
    return this.name;
}


public double calculator1RM(){

if (reps == 1) {
return weight;

}

return weight * (1 + (double)reps/30);

    }
 }
