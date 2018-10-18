package infinityDungeon;

public class En {
	
	public static void chestChoice() {

		//Randomly selects an encounter if there is one
		int rand = (int)(Math.random() * 10 + 1 );

		switch(rand)
        {
            case 2:
            	en1();
            	break;
            case 3:
            	en2();
            	break;
            case 4:
            	en3();
            	break;
            case 5:
            	en4();
            	break;
            case 6:
            	en5();
            	break;
            case 7:
            	en6();
            	break;
            case 8:
            	en7();
            	break;
            case 9:
            	en8();
            	break;
            case 10:
            	en9();
            	break;
            default:
            	en0();
        }
	}
	public static void en0() {
		
	}
	public static void en1() {
		
	}
	public static void en2() {
		
	}
	public static void en3() {
		
	}
	public static void en4() {
		
	}
	public static void en5() {
		
	}
	public static void en6() {
		
	}
	public static void en7() {
		
	}
	public static void en8() {
		
	}
	public static void en9() {
		
	}
}