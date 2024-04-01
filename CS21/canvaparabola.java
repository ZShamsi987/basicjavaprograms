import javax.swing.*;
import java.awt.*;

public class canvaparabola {
   public static void main(String[] args) {
     BallCanvas canvas = new BallCanvas(600, 600);
     for (int i = 1; i <=526; i++) {
       int xPos = i;
       int yPos = (int) ((i-250) * (i-250) * 0.00359)+250;
       canvas.moveBall(xPos, yPos);
       canvas.repaint();
       canvas.delay(5);
     }
   }
}


