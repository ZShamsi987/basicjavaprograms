public class racey{
	public static void main(String args[]){
		RacerCanvas race = new RacerCanvas(800,800);
		race.setFiles("racer1.png","racer2.png","racer3.png");

		int xRacer1 = 0;
		int xRacer2 = 0;
		int xRacer3 = 0;
		int r1xwingSpacesMoved = 0;
		int r1ywingSpacesMoved = 0;
		int r1tiefighterSpacesMoved = 0;
		int r1xwingWins = 0;
		int r1ywingWins = 0;
		int r1tiefighterWins = 0;
		int xwingWins = 0;
		int ywingWins = 0;
		int tiefighterWins = 0;


		race.moveRacer1(1,0);
		race.moveRacer2(1,210);
		race.moveRacer3(1,420);




	for (int i = 1; i <= 3; i++) //Gets the race to occur 3 times exactly for the 3 rounds
	{
		race.showText(true);
		race.setPlaces("Round " + i + " will begin!", 300, 700, 25); //Makes the round number increase
		race.delay(2000);
		race.repaint();
		race.showText(false);

		while (xRacer1<664 ||xRacer2<664 || xRacer3<664) //Moves the objects from left to right
		{

			if (xRacer1 < 664)
			{
			race.moveRacer1(xRacer1, 0);
			race.repaint();
			race.delay(10);
			int randomnum1 = (int)(Math.random()*10)+1;
			xRacer1+=randomnum1;
			r1xwingSpacesMoved++;
			}

			if (xRacer2 < 664)
			{
			race.moveRacer2(xRacer2, 210);
			race.repaint();
			race.delay(10);
			int randomnum2 = (int)(Math.random()*10)+1;
			xRacer2+=randomnum2;
			r1ywingSpacesMoved++;
			}

			if (xRacer3 < 664)
			{
			race.moveRacer3(xRacer3, 420);
			race.repaint();
			race.delay(10);
			int randomnum3 = (int)(Math.random()*10)+1;
			xRacer3+=randomnum3;
			r1tiefighterSpacesMoved++;
			}


		}

			if (r1xwingSpacesMoved < r1ywingSpacesMoved && r1xwingSpacesMoved < r1tiefighterSpacesMoved && r1ywingSpacesMoved < r1tiefighterSpacesMoved) //Decides who wins the round
				{
				r1xwingWins++;
				xwingWins++;
				race.showText(true);
				race.setPlaces("The winner is X-Wing! Y-Wing is 2nd and Tie-Fighter is 3rd!", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1xwingSpacesMoved < r1ywingSpacesMoved && r1xwingSpacesMoved < r1tiefighterSpacesMoved && r1tiefighterSpacesMoved < r1ywingSpacesMoved)
				{
				r1xwingWins++;
				xwingWins++;
				race.showText(true);
				race.setPlaces("The winner is X-Wing! Tie-Fighter is 2nd and Y-Wing is 3rd!", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1xwingSpacesMoved == r1ywingSpacesMoved && r1xwingSpacesMoved < r1tiefighterSpacesMoved)
				{
				r1xwingWins++;
				r1ywingWins++;
				xwingWins++;
				ywingWins++;
				race.showText(true);
				race.setPlaces("X-Wing and Y-Wing tie for first! Tie-Fighter is 3rd!", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1xwingSpacesMoved == r1tiefighterSpacesMoved && r1xwingSpacesMoved < r1ywingSpacesMoved)
				{
				r1xwingWins++;
				r1tiefighterWins++;
				xwingWins++;
				tiefighterWins++;
				race.showText(true);
				race.setPlaces("X-Wing and Tie-Fighter tie for first! Y-Wing is 3rd!", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1ywingSpacesMoved < r1xwingSpacesMoved && r1ywingSpacesMoved < r1tiefighterSpacesMoved && r1tiefighterSpacesMoved == r1xwingSpacesMoved)
				{
				r1ywingWins++;
				ywingWins++;
				race.showText(true);
				race.setPlaces("The winner is Y-Wing! X-Wing and Tie-Fighter tied for 2nd!", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1tiefighterSpacesMoved < r1xwingSpacesMoved && r1tiefighterSpacesMoved < r1ywingSpacesMoved && r1ywingSpacesMoved == r1xwingSpacesMoved)
				{
				r1tiefighterWins++;
				tiefighterWins++;
				race.showText(true);
				race.setPlaces("The winner is Tie-Fighter! X-Wing and Y-Wing tied for 2nd!", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1ywingSpacesMoved < r1xwingSpacesMoved && r1ywingSpacesMoved < r1tiefighterSpacesMoved && r1xwingSpacesMoved < r1tiefighterSpacesMoved)
				{
				r1ywingWins++;
				ywingWins++;
				race.showText(true);
				race.setPlaces("The winner is Y-Wing! X-Wing is 2nd and Tie-Fighter is 3rd", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1ywingSpacesMoved < r1xwingSpacesMoved && r1ywingSpacesMoved < r1tiefighterSpacesMoved && r1tiefighterSpacesMoved < r1xwingSpacesMoved)
				{
				r1ywingWins++;
				ywingWins++;
				race.showText(true);
				race.setPlaces("The winner is Y-Wing! Tie-Fighter is 2nd and X-Wing is 3rd", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1ywingSpacesMoved == r1tiefighterSpacesMoved && r1tiefighterSpacesMoved < r1xwingSpacesMoved)
				{
				r1ywingWins++;
				r1tiefighterWins++;
				ywingWins++;
				tiefighterWins++;
				race.showText(true);
				race.setPlaces("Y-Wing and Tie-Fighter tied for 1st! X-Wing is 3rd", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1tiefighterSpacesMoved < r1xwingSpacesMoved && r1tiefighterSpacesMoved < r1ywingSpacesMoved && r1ywingSpacesMoved < r1xwingSpacesMoved)
				{
				r1tiefighterWins++;
				tiefighterWins++;
				race.showText(true);
				race.setPlaces("The winner is Tie-Fighter! Y-Wing is 2nd and X-Wing is 3rd", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1tiefighterSpacesMoved < r1xwingSpacesMoved && r1tiefighterSpacesMoved < r1ywingSpacesMoved && r1xwingSpacesMoved < r1ywingSpacesMoved)
				{
				r1tiefighterWins++;
				tiefighterWins++;
				race.showText(true);
				race.setPlaces("The winner is Tie-Fighter! X-Wing is 2nd and Y-Wing is 3rd", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1tiefighterSpacesMoved == r1xwingSpacesMoved && r1tiefighterSpacesMoved < r1ywingSpacesMoved)
				{
				r1tiefighterWins++;
				tiefighterWins++;
				race.showText(true);
				race.setPlaces("Tie-Fighter and X-Wing tied for 1st! Y-Wing is 3rd", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}
				else if (r1tiefighterSpacesMoved == r1ywingSpacesMoved && r1tiefighterSpacesMoved < r1xwingSpacesMoved)
				{
				r1tiefighterWins++;
				tiefighterWins++;
				race.showText(true);
				race.setPlaces("Tie-Fighter and Y-Wing tied for 1st! X-Wing is 3rd", 100, 700, 20);
				race.repaint();
				race.delay(2000);
				race.showText(false);
				race.repaint();
				}

				xRacer1 = 0;  //Resets all the variables so the rounds can happen again
				xRacer2 = 0;
				xRacer3 = 0;
				r1xwingSpacesMoved = 0;
				r1ywingSpacesMoved = 0;
				r1tiefighterSpacesMoved = 0;
				r1xwingWins = 0;
				r1ywingWins = 0;
				r1tiefighterWins = 0;

	}

		if (xwingWins > ywingWins && xwingWins > tiefighterWins && ywingWins > tiefighterWins)  // Calculates who wins the series
		{
		race.showText(true);
		race.setPlaces("X-WING WINS THE SERIES! Y-Wing is 2nd and Tie-Fighter is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (xwingWins > ywingWins && xwingWins > tiefighterWins && tiefighterWins > ywingWins)
		{
		race.showText(true);
		race.setPlaces("X-WING WINS THE SERIES! Tie-Fighter is 2nd and Y-Wing is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (ywingWins > xwingWins && ywingWins > tiefighterWins && tiefighterWins > xwingWins)
		{
		race.showText(true);
		race.setPlaces("Y-WING WINS THE SERIES! Tie-Fighter is 2nd and X-Wing is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (ywingWins > xwingWins && ywingWins > tiefighterWins && xwingWins > tiefighterWins)
		{
		race.showText(true);
		race.setPlaces("Y-WING WINS THE SERIES! X-Wing is 2nd and Tie-Fighter is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (tiefighterWins > xwingWins && tiefighterWins > ywingWins && xwingWins > ywingWins)
		{
		race.showText(true);
		race.setPlaces("TIE-FIGHTER WINS THE SERIES! X-Wing is 2nd and Y-Wing is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (tiefighterWins > xwingWins && tiefighterWins > ywingWins && ywingWins > xwingWins)
		{
		race.showText(true);
		race.setPlaces("TIE-FIGHTER WINS THE SERIES! Y-Wing is 2nd and X-Wing is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (tiefighterWins == xwingWins && xwingWins > ywingWins)
		{
		race.showText(true);
		race.setPlaces("TIE-FIGHTER AND X-WING TIE THE SERIES! Y-Wing is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (tiefighterWins == ywingWins && ywingWins > xwingWins)
		{
		race.showText(true);
		race.setPlaces("TIE-FIGHTER AND Y-WING TIE THE SERIES! X-Wing is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (xwingWins == ywingWins && ywingWins > tiefighterWins) //Accounts for ties
		{
		race.showText(true);
		race.setPlaces("X-WING AND Y-WING TIE THE SERIES! Tie-Fighter is 3rd", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}
		else if (xwingWins == ywingWins && ywingWins == tiefighterWins)
		{
		race.showText(true);
		race.setPlaces("X-WING, Y-WING AND TIE-FIGHTER TIED THE SERIES!", 100, 700, 20);
		race.repaint();
		race.delay(2000);
		race.showText(false);
		race.repaint();
		}




	}
}