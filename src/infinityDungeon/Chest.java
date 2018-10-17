package infinityDungeon;

public class Chest {
	
	public static void chestChoice() {

		int coins = 0;
		//Randomly selects an amount of coins to find in the chest
		int rand = (int)(Math.random() * 10 + 1 );

		switch(rand)
        {
            case 2:
            	coins = coins + 10;
            	break;
            case 3:
            	coins = coins + 20;
            	break;
            case 4:
            	coins = coins + 25;
            	break;
            case 5:
            	coins = coins + 35;
            	break;
            case 6:
            	coins = coins + 45;
            	break;
            case 7:
            	coins = coins + 50;
            	break;
            case 8:
            	coins = coins + 65;
            	break;
            case 9:
            	coins = coins + 75;
            	break;
            case 10:
            	coins = coins + 99;
            	break;
            default:
            	coins++;
        }
	}
}