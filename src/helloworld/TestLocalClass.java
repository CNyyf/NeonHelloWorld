package helloworld;

public class TestLocalClass {
	public static void main(String[] args) {
		greet();
	}
	
	public enum DaysOfWeek {
		SUN("best", 0), MON("so so", 1), TUE("bad", 2), WED("bad", 3), THU("worst", 4), FRI("good", 5), SAT("best", 6);
		public String feeling;
		public int id;
		private DaysOfWeek(String feeling, int id) {
			this.feeling = feeling;
			this.id = id;
		}
	}
	public void testDaysOfWeek() {
		DaysOfWeek d = DaysOfWeek.MON;
		switch(d) {
		case SUN:
		default:
			break;
		}
	}
	
	public static void greet() {
		final String greetWord = "HelloWorld";
		class Print {
			void printGreetWord() {
				System.out.println(greetWord);
			}
		}
		Print p = new Print();
		p.printGreetWord();
	}
}
