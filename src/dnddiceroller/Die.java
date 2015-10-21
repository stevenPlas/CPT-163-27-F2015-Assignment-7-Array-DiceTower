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
    public Die(int sides) {
        this.sides = sides;
        
    }

    public int getValue() {
        return this.value;
    }


    public void roll(){
        Random rand = new Random();
        this.value = rand.nextInt(this.sides) + 1;
    }
    
}

