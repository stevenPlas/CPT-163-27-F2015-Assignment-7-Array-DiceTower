package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Steven Plas
 */
public class DiceTower {
  final int PANEL_COUNT = 3;
  List<Die> dice;
  private int dieSum;

  public DiceTower() {
	this.dice = new ArrayList();
        dieSum = 0;
  }
  
  public DiceTower(List dice){
	this.dice = dice;
        dieSum = 0;
  }
  
  public int getDieSum(){
      return dieSum;
  }
  
  public void dropDice() {
       int i = 0;
       for (Die die : dice){
           
           dice.stream().forEach((_item) -> {
               die.roll();
           });
           dieSum += dice.get(i).getValue();
           i++;
       }   
   }
}
