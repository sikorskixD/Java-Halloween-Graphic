/*
This class creates the moon
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Moon 
{// start class
    
    private int x;
    private int y;
    static Color lyellow = new Color(243,243,68);
    
    public Moon(int x, int y)
    {
        this.x = x;
        this.y = y;
    
    
    }
    public void show(Graphics g)
    {// start show method
        g.setColor(Color.BLACK);
        g.fillOval(x+325,y+50, 150, 150);
        g.setColor(Color.YELLOW);
        g.fillOval(x+325,y+50, 146, 146);
        g.setColor(lyellow);
        g.fillOval(x+325,y+50, 142, 142);
    }
}
