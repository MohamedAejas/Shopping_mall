package Day11.userdefinedobject;

public class HashSetDemo {
	public static void main(String args[]) {
		Set<Student> studentSet = new HashSet<Student>();
		addElements(studentSet);
		System.out.println(studentSet);		
	}

	static void addElements(Set<Student> studentSet) {

		Student s1 = new Student("Pooja",78);
		studentSet.add(s1);
		s1 = new Student("Nikita",66);
		studentSet.add(s1);
		s1 = new Student( "Deepa",73);
		studentSet.add(s1);
		s1 = new Student("Neha",81);
		studentSet.add(s1);
		s1 = new Student("Neha",81);
		//duplicate element can't insert
		studentSet.add(s1); 

	}

}

