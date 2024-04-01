public class canvscreensaver{

	static BallCanvas ballCanvas = new BallCanvas(600,600);
	static int xPos=0;

	public static void main(String[]args){

		for (int yPos=1;yPos<512;yPos+=2){
			ballCanvas.moveBall(xPos,yPos);
			xPos++;
			basic();
		}

		for (int yPos=512;yPos>230;yPos-=2){
			ballCanvas.moveBall(xPos,yPos);
			xPos+=2;
			basic();
		}

		for (int yPos=230;yPos>1;yPos-=2){
			ballCanvas.moveBall(xPos,yPos);
			xPos-=2;
			basic();
		}

		for (int yPos=1;yPos<208;yPos+=2){
			ballCanvas.moveBall(xPos,yPos);
			xPos-=3;
			basic();
		}

		for (int yPos=208;yPos<512;yPos+=1){
			ballCanvas.moveBall(xPos,yPos);
			xPos+=1.1;
			basic();
		}

		for (int yPos=512;yPos>53;yPos-=1.9){
			ballCanvas.moveBall(xPos,yPos);
			xPos+=1.4;
			basic();
		}

		for (int yPos=53;yPos>1;yPos-=2){
			ballCanvas.moveBall(xPos,yPos);
			xPos-=2;
			basic();
		}

		for (int yPos=1;yPos<365;yPos+=3){
			ballCanvas.moveBall(xPos,yPos);
			xPos-=3.1;
			basic();
		}

		for (int yPos=365;yPos<512;yPos+=1){
			ballCanvas.moveBall(xPos,yPos);
			xPos+=1.1;
			basic();
		}

		for (int yPos=512;yPos>381;yPos-=1){
			ballCanvas.moveBall(xPos,yPos);
			xPos+=3;
			basic();
		}

		for (int yPos=381;yPos>1;yPos-=1.2){
			ballCanvas.moveBall(xPos,yPos);
			xPos-=2;
			basic();
		}



		}

		public static void basic(){
			ballCanvas.delay(10);
			ballCanvas.repaint();
	}


}