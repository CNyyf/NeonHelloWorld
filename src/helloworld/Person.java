package helloworld;

public class Person {
	private int age;
	private String name;
	public int getAge() {
		age++;
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		age++;
	}
	public String getName() {
		if(name!=null)
			name+="/";
		return name;
	}
	public void setName(String name) {
		this.name = name;
		if(name!=null)
			name+="/";
	}
}
