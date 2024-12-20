import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;


public abstract class GameObject extends MyRect{
   
    public GameObject(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public abstract void update();

    public void draw(Graphics pen)  {
        pen.setColor(Color.GREEN);
        pen.drawRect(x, y, w, h);
    }

    public boolean collidingWith(GameObject b) {
        if(x<=b.x+b.w && x+w>=b.x && y+h>=b.y && y <= b.y+b.h) 
            return true;
        return false;
    }

    public boolean collidingWith(int bx, int by, int bw, int bh) {
        if(x<=bx+bw && x+w>=bx&& y+h>=by && y <= by+bh) 
            return true;
        return false;
    }

    public void mousePressed(MouseEvent me) {}

    

   

}
