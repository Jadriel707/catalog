import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Button extends GameObject{
    
    private boolean hover;
    private boolean clicked;
    private boolean holding;
    private String text;

   

    public Button(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public Button(int x, int y, int w, int h, String label) {
        super(x, y, w, h);
        text=label;
    }

    public void setLabel(String label) {
        text=label;
    }
    


    public void update() {
        setHover(Cursor.insideRect(this)); 
        clicked=false;       
    }


    public void draw(Graphics pen) {
        pen.setColor(Color.WHITE);
        pen.fillRect(x, y, w, h);
        if(holding) {
            pen.setColor(Color.green);
        } else if(hover) {
            pen.setColor(Color.yellow);
        } else {
            pen.setColor(Color.red);
        }
        pen.drawRect(x,y,w,h);

        if(text!=null) {
            pen.setColor(Color.black);
            pen.drawString(text, x+30, y+35);
        }        
    }

    public void setHover(boolean b) {
        hover = b;
    }

    public boolean isHovered() {
        return hover;
    }
    public boolean wasClicked() {
        return clicked;
    }

    // Mouse Inputs

    public void mouseClicked() {
       if(hover) {
            clicked=true;
       }
    }
    public void mousePressed() {
        if(hover) {
            holding=true;
        }
    }

    public void mouseReleased() {
        holding=false;
    }
}
