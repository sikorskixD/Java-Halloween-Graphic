/*
This class creates the Haunted House
 */
package nb.test.gamepackagev1;

import java.awt.*;

public class HHouse 
{// start class
    
    private int x;
    private int y;
    static Color purple = new Color(44,10,125);
    static Color brown = new Color(164,118,50);
    static Color lpurple = new Color(127,0,255);
    
    public HHouse(int x, int y)
    {
        this.x = x;
        this.y = y;
        
    
    }
    public void show(Graphics g)
    {// start show method
        Polygon tri = new Polygon();
        g.setColor(brown);
        g.fillRect(x+0,y+450, 500, 50);
        
        g.setColor(Color.BLACK);
        g.fillRect(x+95,y+200, 310, 260);
        
        g.setColor(lpurple);
        g.fillRect(x+100,y+200, 300, 250);
        
        g.setColor(Color.BLACK);
        g.fillRect(x+0,y+450, 500, 10);
        g.fillRect(x+100,y+475, 300, 20);
        g.setColor(purple);
        g.fillRect(x+104,y+480, 290, 15);
        g.setColor(Color.BLACK);
        g.fillRect(x+125,y+460, 250, 20);
        g.setColor(purple);
        g.fillRect(x+130,y+465, 240, 10);
        
        g.setColor(Color.BLACK);
        g.fillRect(x+125,y+445, 50, 20);
        g.fillRect(x+325,y+445, 50, 20);
        g.fillRect(x+340,y+330, 20, 120);
        g.fillRect(x+140,y+330, 20, 120);
          
        g.fillRect(x+225,y+350, 50, 100);
        
        g.fillRect(x+125,y+320, 250, 25);
        
        tri.addPoint(x+75,y+200);
        tri.addPoint(x+425,y+200);
        tri.addPoint(x+250,y+50);
        g.fillPolygon(tri);
        
        Polygon fry = new Polygon();
        
        g.setColor(lpurple);
        fry.addPoint(x+85,y+200);
        fry.addPoint(x+415,y+200);
        fry.addPoint(x+250,y+65);
        g.fillPolygon(fry);
        
        
        g.setColor(Color.YELLOW);
        g.fillRect(x+237,y+360, 25, 25);
        g.fillRect(x+150,y+220, 50, 75);
        g.fillRect(x+300,y+220, 50, 75);
        g.setColor(Color.BLACK);
        g.fillRect(x+175,y+217, 2, 80);
        g.fillRect(x+325,y+217, 2, 80);
        g.fillRect(x+150,y+235, 50, 2);
        g.fillRect(x+150,y+255, 50, 2);
        g.fillRect(x+150,y+275, 50, 2);
        g.fillRect(x+300,y+235, 50, 2);
        g.fillRect(x+300,y+255, 50, 2);
        g.fillRect(x+300,y+275, 50, 2);
        
        g.setColor(Color.YELLOW);
        g.fillArc(x+200, y+130, 100, 100, 0, 180);
        g.setColor(Color.BLACK);
        g.fillRect(x+250,y+130, 2, 50);
        g.fillRect(x+215,y+145, 75, 2);
        g.fillRect(x+200,y+165, 100, 2);
        
        
        
        
        
    }
}

