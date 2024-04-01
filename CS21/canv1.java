import javax.swing.*;
import java.awt.*;

public class canv1 {
   public static void main(String[] args) {
     BallCanvas canvas = new BallCanvas(300, 550);
     for (int i = 600; i >= 0; i--) {
       int xPos = i;
       int yPos = (int) ((300 - i) * (300 - i) * 0.02) ;
       canvas.moveBall(xPos, yPos);
       canvas.repaint();
       canvas.delay(10);
     }
   }
}


