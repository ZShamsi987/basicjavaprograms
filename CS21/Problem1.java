public class Problem1{
	public static void main(String[]args){

//Assignment 1
		BallCanvas ballCanvas = new BallCanvas(300,200);

		for (int yPos=1;yPos<512;yPos+=2){
//Assignment 2
//		for (int yPos=1;yPos<512;yPos+=5){
			ballCanvas.moveBall(100,yPos);
			ballCanvas.delay(1);
			ballCanvas.repaint();
		}
//Assignment 3
		for (int yPos=512;yPos>=0;yPos-=2){
			ballCanvas.moveBall(100,yPos);
			ballCanvas.delay(1);
			ballCanvas.repaint();
		}

		}
}