package Generics;

public class Q1 {

	public static void main(String[] args) {
	
		Student<String> s1 = new Student("Saurav","3209",21);
		s1.display();
		
		System.out.println();
		
		Student<Integer> s2 = new Student("Bibek",6223,19);
		s2.display();
		
		

	}

}

class Student<T> {
	 String name;
	 T roll;
	 int age;
	
	public Student(String name, T roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
		
	}


	
	public void display() {
		System.out.println("Student Name = " + name);
		System.out.println("Roll = " + roll);
		System.out.println("Age = " + age);
	}
	
	
}


