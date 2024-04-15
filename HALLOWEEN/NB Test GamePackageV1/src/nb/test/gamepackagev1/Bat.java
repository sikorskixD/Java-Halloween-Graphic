/*
This object is to draw a bat
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Bat 
{
    private int x;
    private int y;

    
    public Bat(int x, int y)
    {
        this.x = x;
        this.y = y;
    
    
    }
    public void show(Graphics g)
    {// start show method
        Polygon tri = new Polygon();
        Polygon gi = new Polygon();
        Polygon mi = new Polygon();
        Polygon fri = new Polygon();
        Polygon bi = new Polygon();
        
        //g.setColor(Color.WHITE);
       g.setColor(Color.BLACK);
        g.fillOval(x+440, y+40, 15, 20);
       
        //g.setColor(Color.GRAY);
        tri.addPoint(x+442,y+44);
        tri.addPoint(x+447,y+44);
        tri.addPoint(x+445,y+34);
        
        
        gi.addPoint(x+448,y+44);
        gi.addPoint(x+453,y+44);
        gi.addPoint(x+450,y+34);
        
        mi.addPoint(x+450,y+48);
        mi.addPoint(x+475,y+48);
        mi.addPoint(x+465,y+55);
        
        fri.addPoint(x+420,y+48);
        fri.addPoint(x+445,y+48);
        fri.addPoint(x+435,y+55);
        
        bi.addPoint(x+417,y+48);
        bi.addPoint(x+437,y+48);
        bi.addPoint(x+427,y+55);
        
        bi.addPoint(x+453,y+48);
        bi.addPoint(x+478,y+48);
        bi.addPoint(x+453,y+55);
        
        g.fillPolygon(tri);
        g.fillPolygon(gi);
        g.fillPolygon(mi);
        g.fillPolygon(fri);
        g.fillPolygon(bi);
    }
}
