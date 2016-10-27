package oct20;

public class Animal {

	private String name = "null";
	public String getName() {
		return name;
	}
	public Animal clone() {
		return new Animal();
	}
	
	public static void test() {
		System.out.println("Test Animal");
	}
	public void speak() {
		System.out.println("Speak null");
	}
}
