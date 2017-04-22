package practical9;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;

import javax.swing.JFrame;

// As with the previous JFrame classes, this class extends
// JFrame (so that objects from this class will be window frames
// on the screen).  The paint method then contains what we
// want to happen when the created window is painted.
// This class also implements the MouseListener interface
// so that it can respond appropriately when mouse events
// happen; what the class does is, every time the mouse is
// clicked within the JFrame, it paints a circle at the
// location of that mouse click

class MouseJFrame  extends JFrame implements MouseListener, MouseMotionListener{

   int circleXcenter;
   int circleYcenter;
   int circleRadius=10;
   boolean show = false;

// the constructor method: uses the addMouseListener method
// (inherited from JFrame) to say that this window is going
// to listen for and respond to its own mouse events.

   public MouseJFrame(){
       addMouseListener(this);
       addMouseMotionListener(this);
   }

// Paints a circle (as before)

   public void paint(Graphics g){
        super.paint(g);
        if(show){
          g.drawOval(circleXcenter,circleYcenter,
                            circleRadius*2,circleRadius*2);
        }
   }

// the methods required by the MouseListener interface.
// Look up the MouseEvent class to see what the input to
// these methods is.  The getX and getY methods return to
// us the location of the mouseClick that generated the event.

   public void mouseClicked(MouseEvent e){
   }

   public void mouseEntered(MouseEvent e){
   }

   public void mouseExited(MouseEvent e){
   }

   public void mousePressed(MouseEvent e){
   }

   public void mouseReleased(MouseEvent e){
   }
   
   public void mouseMoved(MouseEvent e)//prints the circle when the mosue is moved at all
   {
	  int xLocation = e.getX();
	  int yLocation = e.getY();
	  double width=getWidth()/2;//gets width of JFrame
	  double height=getHeight()/2;//gets height
	  double xloc=xLocation,yloc=yLocation;//store the locations in doubles
	  
	  int distance=(int) Point2D.distance(xloc,yloc,width,height);//this function finds the distance between two points
	  
	  
	  circleXcenter = xLocation-circleRadius;
	  circleYcenter = yLocation-circleRadius;
	  circleRadius=distance;
	  repaint();
	  show = true;
	   	
   }


  public void mouseDragged(MouseEvent e)
  {

  }
  
}



//  This class actually creates one of those MouseJFrame objects
// and sets its initial size and makes it visible (all using
// methods that the MouseJFrame class inherits from JFrame

public class GrowingCircle{

    public static void main(String[] a){
       MouseJFrame  myMouseJFrame = new MouseJFrame ();
       myMouseJFrame.setSize(400, 400);
       myMouseJFrame.setVisible(true);
    }

}



