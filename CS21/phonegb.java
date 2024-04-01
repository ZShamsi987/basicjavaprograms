public class phonegb{
public static void main(String[]args){

int max = 30;
int min = 1;
int range = max - min + 1;
for (int i = 0; i < 1; i++) {
            int rand = (int)(Math.random() * range) + min;
            System.out.println("Number of gigabytes used is: "+rand);

            double plan1 = 0.0;
			double plan2= 0.0;
			double plan3= 0.0;
			double plan4 = 0.0;
			double plan5 = 89.99;

			if(rand>1){
			plan1 = ((rand-2)*20.00)+19.99;
			System.out.println("Cost for Plan A with "+(rand-2)+" extra GBs needed is $"+plan1);}
			else{
			plan1 = 19.99;
			System.out.println("Cost for Plan A with 0 extra GBs needed is $"+plan1);}

			if(rand>4){
			plan2 = ((rand-5)*15.00)+29.99;
			System.out.println("Cost for Plan B with "+(rand-5)+" extra GBs needed is $"+plan2);}
			else{
			plan2 = 29.99;
			System.out.println("Cost for Plan B with 0 extra GBs needed is $"+plan2);}


			if(rand>9){
			plan3 = ((rand-10)*10.00)+49.99;
			System.out.println("Cost for Plan C with "+(rand-10)+" extra GBs needed is $"+plan3);}
			else{
			plan3 = 49.99;
			System.out.println("Cost for Plan C with 0 extra GBs needed is $"+plan3);}


			if(rand>15){
			plan4 = ((rand-16)*8.00)+69.99;
			System.out.println("Cost for Plan D with "+(rand-16)+" extra GBs needed is $"+plan4);}
			else{
			plan4 = 69.99;
			System.out.println("Cost for Plan D with 0 extra GBs needed is $"+plan4);}

			System.out.println("Cost for Plan E is $"+plan5);


			if(plan1<plan2 && plan1<plan3 && plan1<plan4 && plan1<plan5){
			System.out.println("The least expensive plan is Plan A for a cost of $"+plan1);}

			if(plan2<plan1 && plan2<plan3 && plan2<plan4 && plan2<plan5){
			System.out.println("The least expensive plan is Plan B for a cost of $"+plan2);}

			if(plan3<plan1 && plan3<plan2 && plan3<plan4 &&plan4<plan5){
			System.out.println("The least expensive plan is Plan C for a cost of $"+plan3);}

			if(plan4<plan1 && plan4<plan2 && plan4<plan3 && plan4<5){
			System.out.println("The least expensive plan is Plan D for a cost of $"+plan4);}

			if(plan5<plan1 && plan5<plan2 && plan5<plan3 && plan5<plan4){
			System.out.println("The least expensive plan is Plan E for a cost of $"+plan5);}

        }




}
}