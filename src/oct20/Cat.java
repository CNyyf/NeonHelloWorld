package oct20;

public class Cat extends Animal{

	private String name = "niko";
	public Cat clone() {
		return new Cat();
	}
	
	public static void test() {
		System.out.println("Test Cat");
	}
	public void speak() {
		super.speak();
		System.out.println("miao");
	}
}
