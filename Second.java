import java.applet.Applet;
import java.awt.*;
public class Second extends Applet
{
 public void paint(Graphics g)
 {
  g.setColor(Color.RED);
  g.drawString("welcome",150,150);
  g.drawLine(20,30,140,150);
  g.drawRect(20,30,70,100);
  g.setColor(Color.BLUE);
  g.fillRect(120,130,70,100);
  g.setColor(Color.BLACK);
  g.drawOval(150,70,100,100);
  g.drawOval(250,250,70,120);
  
  g.setColor(Color.YELLOW);
  g.fillOval(120,130,70,120);
  g.setColor(Color.ORANGE);
  g.drawArc(90,150,30,30,30,270);
  g.fillArc(90,150,30,30,30,270);
  }
 } 
 /*
  <applet code="Second.class" width="300" height="300"></applet>
  */