/*
This object is to make a pumpkin
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class Pumpkin 
{
    private int x;
    private int y;
    static Color horange = new Color(255,153,51);
    static Color dorange = new Color(206,125,44);
    static Color brown = new Color(102,51,0);
    
    public Pumpkin(int x, int y)
    {
        this.x = x;
        this.y = y;
        
    
    }
    public void show(Graphics g)
    {// start show method
    g.setColor(horange);
    g.fillOval(x+440, y+405, 50, 45);
     g.setColor(dorange);
    g.drawArc(x+435, y+405, 50, 45, 90, -180);
    g.drawArc(x+445, y+405, 50, 45, 90, 180);
    g.drawArc(x+453, y+405, 30, 45, 90, 180);
    g.drawArc(x+448, y+405, 30, 45, 90, -180);
    
    g.setColor(brown);
    g.fillRect(x+462, y+395, 5, 13);
    
    
    g.setColor(Color.BLACK);
    Polygon tri = new Polygon();
    tri.addPoint(x+445,y+420);
    tri.addPoint(x+455,y+410);
    tri.addPoint(x+465,y+420);
    g.fillPolygon(tri);
    
   
    tri.addPoint(x+465,y+420);
    tri.addPoint(x+475,y+410);
    tri.addPoint(x+485,y+420);
    g.fillPolygon(tri);
    
    Polygon pe = new Polygon();
    pe.addPoint(x+458,y+430);
    pe.addPoint(x+465,y+420);
    pe.addPoint(x+472,y+430);
    g.fillPolygon(pe);
    
    g.fillArc(x+448, y+420, 35, 25, 0, -180);
    
    g.setColor(horange);
    g.fillRect(x+458, y+433, 3, 5);
    g.fillRect(x+470, y+440, 3, 5);
    
   
    }
}
