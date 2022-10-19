import java.applet.*;
import java.awt.*;
 /*<applet code="First.class" width="400" height="400"> </applet> */ 
public class First extends Applet
{
  public void init()
  {
   System.out.println("Applet is initialized");
   }
  public void start()
  {
   System.out.println("Applet is Start");
   }
   
  public void paint(Graphics g)
  {
   setBackground(Color.CYAN);
   System.out.println("Applet is painted");
   }
  public void stop()
  {
   System.out.println("Applet is stopped");
   }
  public void destroy()
  {
   System.out.println("Applet is destroyed");
   }
 }  
   