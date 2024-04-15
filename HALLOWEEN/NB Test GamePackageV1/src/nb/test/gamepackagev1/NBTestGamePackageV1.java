/* HALLOWEEN
Adrian Sikorski
*/
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;


public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Halloween");
    static Moon moon = new Moon(0,0);
    static HHouse house = new HHouse(0,0);
    static Grave stone = new Grave(0,0);
    static Pumpkin larry = new Pumpkin(-25,0);
    static Pumpkin marry = new Pumpkin(-350, 50);
    static Bat jim = new Bat(0,0);
    static Bat kim = new Bat(-400,10);
    static Bat lim = new Bat(-350,40);
    static Bat klim = new Bat(10,80);
    
    public static void main(String[] args) 
    { // start main    
        
        showGameBoard(gb);
          
    }   //end main
    public void draw(Graphics g)
    {// start draw
        Graphics2D g2d = (Graphics2D) g;        
        Color color1 = Color.GREEN;        
        Color color2 = Color.DARK_GRAY; 
        
        GradientPaint gp = new GradientPaint(0, 100, color1,0, 300, color2);
        
         g2d.setPaint(gp);        
         g2d.fillRect(0, 0, 500, 500);
        
         moon.show(g);
         house.show(g);
         stone.show(g);
         larry.show(g);
         marry.show(g);
         jim.show(g);
         kim.show(g);
         lim.show(g);
         klim.show(g);
         
    }// end draw
    
}// end class
 
