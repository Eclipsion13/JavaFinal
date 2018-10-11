package infinityDungeon;

public class Names {
	
	public static void list() {
		
		String[] names = {"", "John", "Adam", "Jason", "Will", "Joe", "Gio", "Hailegh",
				"Abby", "Abbi", "Robert", "Conner", "Connor", "Austin", "Jacob"};
		
		int rand = (int)(Math.random() * 14 + 1 );
		
		S.op(names[rand]);
		
	}

}
