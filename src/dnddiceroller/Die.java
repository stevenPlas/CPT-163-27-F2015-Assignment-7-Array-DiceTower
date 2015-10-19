package dnddiceroller;
import java.util.Random;

/**
 * @author Steven Plas
 */
public class Die {
    
    private final int sides;
    private int value;

    /**
     *
     * @param Sides
     */
    public Die(int Sides) {
        this.sides = Sides;
        
    }

    public double getValue() {
        return this.value;
    }


    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(this.sides) + 1;
    }
    
}

