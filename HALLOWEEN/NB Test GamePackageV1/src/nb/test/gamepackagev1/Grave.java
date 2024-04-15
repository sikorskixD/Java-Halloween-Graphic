/*
This object is to draw a grave
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Grave 
{
    private int x;
    private int y;
    
    public Grave(int x, int y)
    {
        this.x = x;
        this.y = y;
        
    
    }
    public void show(Graphics g)
    {// start show method
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(x+25, y+400, 50, 50, 0, 180);
        g.fillRect(x+25, x+425, 50, 50);
        g.setColor(Color.GRAY);
        g.fillRect(x+20, x+475, 60, 10);
        g.fillRect(x+30, x+425, 2, 15);
        g.drawArc(x+30, y+425, 10, 15, 50, 150);
        g.fillOval(x+38, y+438, 3, 3);
        g.fillRect(x+45, y+425, 2, 15);
        g.fillOval(x+53, y+438, 3, 3);
        g.fillRect(x+58, y+425, 2, 15);
        g.drawArc(x+58, y+425, 5, 10, -100, 360);
    }
    
}
