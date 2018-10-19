package infinityDungeon;

public class En {
	
	public static void enChoice() {

		String[] desc = {" strange"," creepy"," wierd-looking"," powerful"," positively"};
		String en = "";
		String the = "";
		int die = 0;
		int i = (int)(Math.random() * 4 + 1 ) - 1;
		//Randomly selects an encounter if there is one
		int rand = (int)(Math.random() * 10 + 1 );

		switch(rand)
        {
            case 2:
            	en1(en, die, the);
            	break;
            case 3:
            	en2(en, die, the);
            	break;
            case 4:
            	en3(en, die, the);
            	break;
            case 5:
            	en4(en, die, the);
            	break;
            case 6:
            	en5(en, die, the);
            	break;
            case 7:
            	en6(en, die, the);
            	break;
            case 8:
            	en7(en, die, the);
            	break;
            case 9:
            	en8(en, die, the);
            	break;
            case 10:
            	en9(en, die, the, i);
            	break;
            default:
            	en0(en, die, the);
        }
	}
	public static void en0(String en, int die, String the) {
		en = " traps";
		the = " some";
		die = 1;
	}
	public static void en1(String en, int die, String the) {
		en = " man";
		the = " a";
		die = (int)(Math.random() * 2 + 1) - 1;
	}
	public static void en2(String en, int die, String the) {
		en = " goblin";
		the = " a";
	}
	public static void en3(String en, int die, String the) {
		en = " haunted cleaver";
		the = " a";
	}
	public static void en4(String en, int die, String the) {
		en = " sleeping butcher, he doesnt seem to have a cleaver though...";
		the = " a";
	}
	public static void en5(String en, int die, String the) {
		en = " pickle, with a face";
		the = " a";
	}
	public static void en6(String en, int die, String the) {
		en = " dog";
		the = " a";
	}
	public static void en7(String en, int die, String the) {
		en = " static TV";
		the = " a";
	}
	public static void en8(String en, int die, String the) {
		en = " penny";
		the = " a";
	}
	public static void en9(String en, int die, String the, int i) {
		en = " nothing";
		the = " absolutely";
		i = 4;
	}
}