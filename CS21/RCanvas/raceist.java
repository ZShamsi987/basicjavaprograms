
public class raceist{
	public static void main(String[] args) {

RacerCanvas race = new RacerCanvas(1600,850);
race.setFiles("racer1.png", "racer2.png", "racer3.png");


for (int i = 1; i<500; i++){
race.moveRacer1(i,200);
race.delay(5);
race.repaint();}

for (int i = 1; i<500; i++){
race.moveRacer2(i,400);
race.delay(5);
race.repaint();}

for (int i = 1; i<500; i++){
race.moveRacer3(i,600);
race.delay(5);
race.repaint();}

}
}