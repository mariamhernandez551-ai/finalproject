J// A Hello World Applet

import java.applet.Applet; 
import java.awt.Graphics; 

// Helloworld class extends Appletjavac A Hello World Applet.java
public class HelloApplet extends Applet

{
        //Overriding paint() method 
        @Override 
        public void paint(Graphics g)
        {
            g.drawString("Hello Applet Universe", 20, 20);
        }
        
}