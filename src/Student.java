
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) { // student class instantiated with name as first last
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName()); // compare by name
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return  name +  " " +score;
	}
	
	
	
	
	
	
}
