public class Main {
	static public void main(String args[]) {
		System.out.println("Hello, World!");
		
		Student s = new Student();
		System.out.println(s.getGrade());
		
		Student s2 = new Student("Alex", 10.0f);
		System.out.println(s2.getName() + " -> " + s2.getGrade());
		
		Student s3 = s2;
		s3.setName("Dan");
		System.out.println(s2.getName());
	}
}
